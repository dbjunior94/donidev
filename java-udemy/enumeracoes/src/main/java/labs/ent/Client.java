package labs.ent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private String name;
  private String email;

  private Date birhtDate;

  public Client() {
  }

  public Client(String name, String email, Date birhtDate) {
    this.name = name;
    this.email = email;
    this.birhtDate = birhtDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirhtDate() {
    return birhtDate;
  }

  public void setBirhtDate(Date birhtDate) {
    this.birhtDate = birhtDate;
  }

  @Override
  public String toString() {
    return name +  " (" + sdf.format(birhtDate) + ") - " + email;
  }
}
