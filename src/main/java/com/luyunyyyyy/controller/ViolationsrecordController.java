package com.luyunyyyyy.controller;

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

    @GetMapping("/violationsrecordList")
    public String violationsrecord(@RequestParam("violationsUserId") Long id, Map<String, Object> model) {

        model.put("violationsrecordList", violationsrecordRepository.findByViolationsUserId(id));
        System.out.println(violationsrecordRepository.findByViolationsUserId(id).size());
        return "/violationsRecordList";


    }
}
