package com.luyunyyyyy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by LYY on 2017/5/1.
 */

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private long activityId;
    private java.sql.Timestamp activityDate;
    private long activityClassroomId;
    private String activityDetail;
    private Timestamp activityBeginTime;
    private Timestamp activityEndTime;


    public Activity() {
    }

    public long getActivityId() {
        return activityId;
    }

    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    public Timestamp getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Timestamp activityDate) {
        this.activityDate = activityDate;
    }

    public long getActivityClassroomId() {
        return activityClassroomId;
    }

    public void setActivityClassroomId(long activityClassroomId) {
        this.activityClassroomId = activityClassroomId;
    }

    public String getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(String activityDetail) {
        this.activityDetail = activityDetail;
    }

    public Timestamp getActivityBeginTime() {
        return activityBeginTime;
    }

    public void setActivityBeginTime(Timestamp activityBeginTime) {
        this.activityBeginTime = activityBeginTime;
    }

    public Timestamp getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Timestamp activityEndTime) {
        this.activityEndTime = activityEndTime;
    }
}
