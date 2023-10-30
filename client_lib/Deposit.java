package client_lib;

import client_lib.BankService;

public class Deposit extends BankService {
  public Deposit() {
    super();
  }
  public Deposit(int Years) {
    super(Years);
  }
  public Deposit(double Body) {
    super(Body);
  }
  public Deposit(int Years, double Percent, double Body) {
    super(Years, Percent, Body);
  }

  public double getFinalDepositAmount() {
    double finalDepositAmount = getBody();
    int years = getYears();
    for (int i = 0; i < years; i++) {
      finalDepositAmount *= getPercent();
    }
    return finalDepositAmount;
  }
  public void showInConsole() {
    String info = "Deposit year: " + Integer.toString(this.getYears()) + " body: " + Double.toString(this.getBody()) +
      " percent: " + Double.toString(this.getPercent());
    System.out.println(info);
  }
}