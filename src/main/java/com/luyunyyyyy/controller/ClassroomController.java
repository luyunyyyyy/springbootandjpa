package com.luyunyyyyy.controller;

import com.luyunyyyyy.domain.Classroom;
import com.luyunyyyyy.repository.ActivityRepository;
import com.luyunyyyyy.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;

/**
 * Created by LYY on 2017/5/18.
 */
@Controller
public class ClassroomController {
    @Autowired
    ClassroomRepository classroomRepository;

    @Autowired
    ActivityRepository activityRepository;
    @GetMapping(
            "/classroom"
    )
    public String getClassroomInfo(@Param("buildingNumber") int buildingNumber,@Param("floorNumber") int floorNumber, Map<String, Object> model){

        Collection<Classroom> classrooms = classroomRepository.findByBuildingNumberAndFloorNumber(buildingNumber,floorNumber);
        for(Classroom classroom:classrooms){


            classroom.setActivities(activityRepository.findByActivityClassroomId(classroom.getClassroomId()));
        }

        model.put("classroom",classrooms);

        return "classroom";
    }
}
