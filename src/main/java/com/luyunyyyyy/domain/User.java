package com.luyunyyyyy.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

  private String userName;
  private String userEmail;
  private String userPassword;
  private java.sql.Timestamp userCreateTime;
  private String userPhoneNumber;
  private String userMajor;
  private String userCollege;
  private long userGender;


  @Id
  @GeneratedValue
  private long userId;
  private String userState;
  private String userClass;
  private long userSutId;


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public java.sql.Timestamp getUserCreateTime() {
    return userCreateTime;
  }

  public void setUserCreateTime(java.sql.Timestamp userCreateTime) {
    this.userCreateTime = userCreateTime;
  }


  public String getUserPhoneNumber() {
    return userPhoneNumber;
  }

  public void setUserPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
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


  public long getUserGender() {
    return userGender;
  }

  public void setUserGender(long userGender) {
    this.userGender = userGender;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }


  public String getUserClass() {
    return userClass;
  }

  public void setUserClass(String userClass) {
    this.userClass = userClass;
  }


  public long getUserSutId() {
    return userSutId;
  }

  public void setUserSutId(long userSutId) {
    this.userSutId = userSutId;
  }

}
