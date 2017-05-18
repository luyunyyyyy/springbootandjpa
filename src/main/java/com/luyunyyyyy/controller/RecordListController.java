package com.luyunyyyyy.controller;

import com.luyunyyyyy.repository.ReservationRecordRepository;
import com.luyunyyyyy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by LYY on 2017/5/17.
 */
@Controller
public class RecordListController {
    @Autowired
    ReservationRecordRepository reservationRecordRepository;

    @Autowired
    UserRepository userRepository;
    @GetMapping("/recordlist")

    public String test(@RequestParam("userSutId") Long id, Map<String, Object> model) {
        Long tempId=userRepository.findByUserSutId(id).getUserId();
        model.put("recordList", reservationRecordRepository.findByRecordUserId(tempId));
        System.out.println(reservationRecordRepository.findByRecordUserId(id).size());
        return "/recordlist";
    }
}
