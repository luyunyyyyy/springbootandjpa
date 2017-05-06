package com.luyunyyyyy.response;

import java.sql.Timestamp;

/**
 * Created by lyy on 2017/5/2.
 */
public class MainpageResponse {
    private Long userSutId;
    private String userName;
    private Timestamp userLastLoginTime;
    private int leftDeskNumber;
    private String userState;
    private String userMajor;
    private String userCollege;
    private int deskNumber;
    private int allDeskNumber;


    public MainpageResponse() {
    }

    public int getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(int deskNumber) {
        this.deskNumber = deskNumber;
    }

    public int getAllDeskNumber() {
        return allDeskNumber;
    }

    public void setAllDeskNumber(int allDeskNumber) {
        this.allDeskNumber = allDeskNumber;
    }

    public Long getUserSutId() {
        return userSutId;
    }

    public void setUserSutId(Long userSutId) {
        this.userSutId = userSutId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Timestamp userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public int getLeftDeskNumber() {
        return leftDeskNumber;
    }

    public void setLeftDeskNumber(int leftDeskNumber) {
        this.leftDeskNumber = leftDeskNumber;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege;
    }
}
