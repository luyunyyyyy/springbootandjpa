package com.luyunyyyyy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.luyunyyyyy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by LYY on 2017/5/18.
 */
@Controller
public class WebsetController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(
            "/webset"
    )
    public String getUserInfo(@Param("userSutId") Long userSutId, Map<String, Object> model) throws JsonProcessingException {
        model.put("user", userRepository.findByUserSutId(userSutId));


        return "/webset";
    }
}
