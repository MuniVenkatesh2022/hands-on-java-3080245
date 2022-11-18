package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private String passowrd;
  private int accountId;
  private boolean authenticated;

  public Customer(int id, String name, String username, String password, int accounId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPassowrd(password);
    setAccountId(accounId);
    setAuthenticated(false);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassowrd() {
    return this.passowrd;
  }

  public void setPassowrd(String passowrd) {
    this.passowrd = passowrd;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public boolean isAuthenticated() {
    return this.authenticated;
  }

  public void setAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
  }

}
