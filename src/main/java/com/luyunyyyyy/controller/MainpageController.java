package com.luyunyyyyy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyunyyyyy.domain.Location;
import com.luyunyyyyy.response.MainpageResponse;
import com.luyunyyyyy.domain.User;
import com.luyunyyyyy.repository.LocationRepository;
import com.luyunyyyyy.repository.UserRepository;
import com.luyunyyyyy.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by LYY on 2017/5/2.
 */
//总共座位 当前剩余座位
//当前已预约座位

@RestController
public class MainpageController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;





    @RequestMapping(
            "/Mainpage"
    )
    public String getMainpagePrama(@Param("userSutId")Long userSutId) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        int leftDeskNumber = 0;
        if(userSutId==null)
            return mapper.writeValueAsString(new Response(401,"参数错误"));
        User tempUser = userRepository.findByUserSutId(userSutId);

        MainpageResponse mainpageResponse = new MainpageResponse();

        if(tempUser==null)
            return mapper.writeValueAsString(new Response(400,"用户不存在"));
        mainpageResponse.setUserSutId(tempUser.getUserSutId());
        mainpageResponse.setUserCollege(tempUser.getUserCollege());
        mainpageResponse.setUserLastLoginTime(tempUser.getUserLastLoginTime());
        mainpageResponse.setUserMajor(tempUser.getUserMajor());
        mainpageResponse.setUserState(tempUser.getUserState());
        mainpageResponse.setUserName(tempUser.getUserName());

        for(Location temp:locationRepository.findAll()){
            leftDeskNumber+=temp.getLocationDesksLeftNumber();
        }
        mainpageResponse.setLeftDeskNumber(leftDeskNumber);

        return mapper.writeValueAsString(mainpageResponse);
    }
}
