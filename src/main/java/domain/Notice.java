package domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Notice {

  @Id
  @GeneratedValue
  private long noticeId;
  private java.sql.Timestamp noticeTime;
  private String noticeText;


  public long getNoticeId() {
    return noticeId;
  }

  public void setNoticeId(long noticeId) {
    this.noticeId = noticeId;
  }


  public java.sql.Timestamp getNoticeTime() {
    return noticeTime;
  }

  public void setNoticeTime(java.sql.Timestamp noticeTime) {
    this.noticeTime = noticeTime;
  }


  public String getNoticeText() {
    return noticeText;
  }

  public void setNoticeText(String noticeText) {
    this.noticeText = noticeText;
  }

}
