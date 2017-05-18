package com.luyunyyyyy.controller;

import com.luyunyyyyy.repository.UserRepository;
import com.luyunyyyyy.repository.ViolationsrecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by LYY on 2017/5/17.
 */
@Controller
public class ViolationsrecordController {

    @Autowired
    ViolationsrecordRepository violationsrecordRepository;

    @Autowired
    UserRepository userRepository;
    @GetMapping("/violationsrecordList")
    public String violationsrecord(@RequestParam("userSutId") Long id, Map<String, Object> model) {
        Long temp = userRepository.findByUserSutId(id).getUserId();
        model.put("violationsrecordList", violationsrecordRepository.findByViolationsUserId(temp));
        System.out.println(violationsrecordRepository.findByViolationsUserId(temp).size());
        return "/violationsRecordList";


    }
}
