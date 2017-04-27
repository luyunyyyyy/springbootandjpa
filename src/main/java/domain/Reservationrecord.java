package domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservationrecord {

  @Id
  @GeneratedValue
  private long recordId;
  private java.sql.Timestamp recordDate;
  private long recordDeskId;
  private String recordState;
  private long recordUserId;


  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
    this.recordId = recordId;
  }


  public java.sql.Timestamp getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(java.sql.Timestamp recordDate) {
    this.recordDate = recordDate;
  }


  public long getRecordDeskId() {
    return recordDeskId;
  }

  public void setRecordDeskId(long recordDeskId) {
    this.recordDeskId = recordDeskId;
  }


  public String getRecordState() {
    return recordState;
  }

  public void setRecordState(String recordState) {
    this.recordState = recordState;
  }


  public long getRecordUserId() {
    return recordUserId;
  }

  public void setRecordUserId(long recordUserId) {
    this.recordUserId = recordUserId;
  }

}
