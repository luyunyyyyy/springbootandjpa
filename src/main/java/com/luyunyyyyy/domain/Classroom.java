package com.luyunyyyyy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Collection;

/**
 * Created by LYY on 2017/5/1.
 */
@Entity
public class Classroom {

    @Id
    @GeneratedValue
    private long classroomId;
    private String roomState;
    private String roomSerialNumber;
    private int buildingNumber;
    private int floorNumber;

    public Collection<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Collection<Activity> activities) {
        this.activities = activities;
    }
    @Transient
    private Collection<Activity> activities;
    public long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(long classroomId) {
        this.classroomId = classroomId;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public String getRoomSerialNumber() {
        return roomSerialNumber;
    }

    public void setRoomSerialNumber(String roomSerialNumber) {
        this.roomSerialNumber = roomSerialNumber;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
