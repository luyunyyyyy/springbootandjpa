package com.luyunyyyyy.service;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyy on 2017/5/1.
 */
public class UserService {

    @RequestMapping(
            "/login"
    )
    public String login(@Param("userId") Long userId,@Param("password") Long password){
        return "hello 马爽";
    }
}
