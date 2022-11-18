package bank;

import bank.exception.AmountException;

public class Account {
  private int id;
  private String type;
  private double balance;

  public Account(int id, String type, double balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposite(double amount) throws AmountException {

    if (amount < 0) {
      throw new AmountException("The minimum deposite is 1.0");
    } else {
      double newBalance = balance + amount;
      setBalance(newBalance);
      DataSource.updateAccountBalance(id, newBalance);
    }
  }

  public void withdraw(double amount) throws AmountException {
    if (amount < 0) {
      throw new AmountException("Withdraw shold be greater than 0");
    }
    else if(amount>getBalance()){
      throw new AmountException("You do not have a sufficent balance for this withdrawal.")
    }
    else{
      double newBalance=balance-amount;
      setBalance(newBalance);
      DataSource.updateAccountBalance(id, newBalance);
    }
  }
}
