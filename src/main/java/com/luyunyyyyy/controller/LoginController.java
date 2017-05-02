package com.luyunyyyyy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyunyyyyy.domain.Response;
import com.luyunyyyyy.domain.User;
import com.luyunyyyyy.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LYY on 2017/5/2.
 */
@RestController
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(
            "/login"
    )
    public String userLogin(@Param("userSutId") Long userSutId, @Param("userPassword") String userPassword) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User loginUser = userRepository.findByUserSutId(userSutId);
        if (loginUser.getUserPassword().equals(userPassword)){
            try {
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
