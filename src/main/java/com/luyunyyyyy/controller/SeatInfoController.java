package com.luyunyyyyy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luyunyyyyy.domain.Desk;
import com.luyunyyyyy.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by LYY on 2017/5/18.
 */
@RestController
public class SeatInfoController {
    @Autowired
    DeskRepository deskRepository;

    @RequestMapping(
            "/seatInfo"
    )
    public String getSeatInfo() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Collection<Desk>desks = deskRepository.findAll();
        ArrayList<String> deskinfo = new ArrayList<>();


        for(Desk desk:desks){
            if(desk.getDeskState().equals("已占用"))
                deskinfo.add(""+(desk.getDeskId()/10+1)+"_"+desk.getDeskId()%10);

        }

        return mapper.writeValueAsString(deskinfo);
    }
}
