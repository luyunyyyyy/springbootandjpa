package domain;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Violationsrecords {

  @Id
  @GeneratedValue
  private long violationsId;
  private java.sql.Timestamp violationsDate;
  private long violationsUserId;
  private String violationsState;
  private long reservationRecordId;


  public long getViolationsId() {
    return violationsId;
  }

  public void setViolationsId(long violationsId) {
    this.violationsId = violationsId;
  }


  public java.sql.Timestamp getViolationsDate() {
    return violationsDate;
  }

  public void setViolationsDate(java.sql.Timestamp violationsDate) {
    this.violationsDate = violationsDate;
  }


  public long getViolationsUserId() {
    return violationsUserId;
  }

  public void setViolationsUserId(long violationsUserId) {
    this.violationsUserId = violationsUserId;
  }


  public String getViolationsState() {
    return violationsState;
  }

  public void setViolationsState(String violationsState) {
    this.violationsState = violationsState;
  }


  public long getReservationRecordId() {
    return reservationRecordId;
  }

  public void setReservationRecordId(long reservationRecordId) {
    this.reservationRecordId = reservationRecordId;
  }

}
