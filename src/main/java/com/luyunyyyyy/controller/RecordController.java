package com.luyunyyyyy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyunyyyyy.domain.Desk;
import com.luyunyyyyy.domain.ReservationRecord;
import com.luyunyyyyy.domain.User;
import com.luyunyyyyy.repository.DeskRepository;
import com.luyunyyyyy.repository.ReservationRecordRepository;
import com.luyunyyyyy.repository.UserRepository;
import com.luyunyyyyy.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * Created by LYY on 2017/5/3.
 */
@RestController
public class RecordController {

    @Autowired
    private ReservationRecordRepository reservationRecordRepository;

    @Autowired
    private DeskRepository deskRepository;


    @Autowired
    private UserRepository userRepository;
    @RequestMapping(
            "/finishRecord"
    )
    public String finishRecord(@Param("UserId") Long UserId) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ReservationRecord temp = reservationRecordRepository.findByRecordUserIdAndRecordState(UserId, "进行中");
        if (temp == null)
            return mapper.writeValueAsString(new Response(400, "订单不存在"));
        temp.setRecordState("已完成");
        reservationRecordRepository.saveAndFlush(temp);
        User tempUser = userRepository.findOne(UserId);
        if(tempUser==null)
            return mapper.writeValueAsString(new Response(400, "用户不存在"));
        tempUser.setUserState("正常");//需要存回去
        userRepository.saveAndFlush(tempUser);
        return mapper.writeValueAsString(new Response(200, "订单已完成"));
    }


    @RequestMapping(
            "/addRecord"
    )
    public String addRecord(@Param("recordUserId") Long recordUserId, @Param("recordDeskId") Long recordDeskId) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        if (recordDeskId == null || recordUserId == null)
            return mapper.writeValueAsString(new Response(400, "参数错误"));

        Desk tempDesk = deskRepository.findOne(recordDeskId);
        if(tempDesk==null)
            return mapper.writeValueAsString(new Response(400, "座位号不存在"));
        tempDesk.setDeskState("已占用");

        User tempUser = userRepository.findOne(recordUserId);
        if(tempUser==null)
            return mapper.writeValueAsString(new Response(400, "用户不存在"));
        if(tempUser.getUserState().equals("已有订单"))
            return mapper.writeValueAsString(new Response(400, "用户有未完成订单"));

        tempUser.setUserState("已有订单");
        ReservationRecord newRecord = new ReservationRecord();
        newRecord.setRecordState("进行中");
        newRecord.setRecordDeskId(recordDeskId);
        newRecord.setRecordUserId(recordUserId);
        newRecord.setRecordDate(new Timestamp(System.currentTimeMillis()));
        reservationRecordRepository.saveAndFlush(newRecord);
        return mapper.writeValueAsString(new Response(200, "新增订单完成"));

    }

}
