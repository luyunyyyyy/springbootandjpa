package com.luyunyyyyy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyunyyyyy.response.Response;
import com.luyunyyyyy.domain.User;
import com.luyunyyyyy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * Created by LYY on 2017/5/2.
 */
@RestController
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(
            "/login"
    )
    public String userLogin(@Param("userSutId") Long userSutId, @Param("userPassword") String userPassword) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User loginUser = userRepository.findByUserSutId(userSutId);


        //Timestamp nousedate = new Timestamp(date.getTime());
        if (loginUser!=null&&loginUser.getUserPassword().equals(userPassword)){
            try {
                loginUser.setUserLastLoginTime(new Timestamp(System.currentTimeMillis()));
                return mapper.writeValueAsString(loginUser);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                return mapper.writeValueAsString(new Response(401,"对象序列化错误"));
            }
        }else{
            return mapper.writeValueAsString(new Response(400,"登陆失败"));
        }
    }
}
