package client_lib;

public class BankService {
  protected int years;
  protected double percent; // in the format 1.XX..
  protected double body;

  public BankService() {
    this.years = -1;
    this.percent = -1;
    this.body = -1;
  }

  public BankService(int years) {
    this.years = years;
    this.percent = -1;
    this.body = -1;
  }

  public BankService(double body) {
    this.body = body;
    this.years = -1;
    this.percent = -1;
  }

  public BankService(int years, double percent, double body) {
    this.years = years;
    this.percent = percent;
    this.body = body;
  }

  public void setYear(int newYear) {
    this.years = newYear;
  }

  public void setBody(double newBody) {
    this.body = newBody;
  }

  public void setPercent(double newPercent) {
    this.percent = newPercent;
  }

  public int getYears() {
    return this.years;
  }

  public double getPercent() {
    return this.percent;
  }

  public double getBody() {
    return this.body;
  }
}