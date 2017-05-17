package com.luyunyyyyy.controller;

import com.luyunyyyyy.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by LYY on 2017/5/16.
 */
@Controller
public class InfoController {

    @Autowired
    ActivityRepository activityRepository;

    @GetMapping("/test")

    public String test(@RequestParam("activityClassroomId") Long id,Map<String, Object> model) {

        model.put("test", activityRepository.findByActivityClassroomId(id));
        System.out.println(activityRepository.findByActivityClassroomId(id).size());
        return "/test";

/***当返回index字符串，会自动去WEB-INF JSP路径寻找index.jsp*/

    }

    /***

     * @author shaoyongyang

     * @since 2014-10-13 13:47:46

     * 例子流程

     * **/

}
