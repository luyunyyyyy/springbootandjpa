package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Desk {

  @Id
  @GeneratedValue
  private long deskId;
  private long deskLocationId;
  private String deskState;
  private String deskText;


  public long getDeskId() {
    return deskId;
  }

  public void setDeskId(long deskId) {
    this.deskId = deskId;
  }


  public long getDeskLocationId() {
    return deskLocationId;
  }

  public void setDeskLocationId(long deskLocationId) {
    this.deskLocationId = deskLocationId;
  }


  public String getDeskState() {
    return deskState;
  }

  public void setDeskState(String deskState) {
    this.deskState = deskState;
  }


  public String getDeskText() {
    return deskText;
  }

  public void setDeskText(String deskText) {
    this.deskText = deskText;
  }

}
