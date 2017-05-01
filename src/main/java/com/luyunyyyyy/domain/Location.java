package com.luyunyyyyy.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location {

  @Id
  @GeneratedValue
  private long locationId;
  private long locationFloor;
  private long locationDesksNumber;
  private String locationState;
  private String locationPart;
  private long locationDesksLeftNumber;


  public long getLocationId() {
    return locationId;
  }

  public void setLocationId(long locationId) {
    this.locationId = locationId;
  }


  public long getLocationFloor() {
    return locationFloor;
  }

  public void setLocationFloor(long locationFloor) {
    this.locationFloor = locationFloor;
  }


  public long getLocationDesksNumber() {
    return locationDesksNumber;
  }

  public void setLocationDesksNumber(long locationDesksNumber) {
    this.locationDesksNumber = locationDesksNumber;
  }


  public String getLocationState() {
    return locationState;
  }

  public void setLocationState(String locationState) {
    this.locationState = locationState;
  }


  public String getLocationPart() {
    return locationPart;
  }

  public void setLocationPart(String locationPart) {
    this.locationPart = locationPart;
  }


  public long getLocationDesksLeftNumber() {
    return locationDesksLeftNumber;
  }

  public void setLocationDesksLeftNumber(long locationDesksLeftNumber) {
    this.locationDesksLeftNumber = locationDesksLeftNumber;
  }

}
