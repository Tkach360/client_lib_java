import client_lib.Client;

public class test {
  public static void main(String[] args) {
    System.out.println("Class Tests:");

    int test = 0;

    Client cli = new Client("Igor", 23, "234234");
    System.out.println("\n" + (++test) + ") Test constructor with all parameters");
    cli.showInConsole();

    System.out.println("\n" + (++test) + ") Test AddAccount");
    cli.addNewAccount(10000);
    cli.Accounts.get(0).showInConsole();

    cli.addNewAccount(10000);
    System.out.println("\n" + (++test) + ") Test MakeTransaction");
    cli.Accounts.get(0).makeTransaction(cli.Accounts.get(1), 5000);
    cli.Accounts.get(0).showAllTransactionInConsole();
    cli.Accounts.get(1).showAllTransactionInConsole();

    System.out.println("\n" + (++test) + ") Test AddDeposit");
    cli.addNewDeposit(10, 1.08, 100000);
    cli.Deposits.get(0).showInConsole();

    System.out.println("\n" + (++test) + ") Test AddCredit");
    cli.addNewCredit(10, 1.08, 100000, 9000);
    cli.Credits.get(0).showInConsole();

    System.out.println("\n" + (++test) + ") Test ShowAllTransactionsInConsole");
    cli.Accounts.get(0).showAllTransactionInConsole();

    System.out.println("\n" + (++test) + ") Test GetFinalContributionsPayments");
    System.out.println("Final contrib pay: " + cli.Credits.get(0).getFinalContributionsPayments());

    System.out.println("\n" + (++test) + ") Test GetFinalDepositAmount");
    System.out.println("Final deposit amount: " + cli.Deposits.get(0).getFinalDepositAmount());

    System.out.println("\n" + (++test) + ") Test dynamic");
    Client cli_d = cli;
    cli_d.showInConsole();
    cli_d.Accounts.get(0).makeTransaction(cli.Accounts.get(1), 100);
    cli_d.addNewCredit(5, 1.05, 10000, 1000);

    System.out.println("\n" + (++test) + ") Test of a dynamic array of class objects");
    Client[] cli_arr = new Client[3];
    cli_arr[0] = new Client("Grigory");
    cli_arr[1] = new Client("Victor");
    cli_arr[2] = new Client("Gennadiy");
    for (int i = 0; i < 3; i++) 
      System.out.println(cli_arr[i].getName());

    System.out.println("\n" + (++test) + ") Test of an array of dynamic class objects");
    Client[] cli_d_arr = new Client[3];
    cli_d_arr[0] = new Client("Guts");
    cli_d_arr[1] = new Client("Griffits");
    cli_d_arr[2] = new Client("Stepan");
    for (int i = 0; i < 3; i++)
      System.out.println(cli_d_arr[i].getName());

    for (int i = 0; i < 3; i++)
      cli_d_arr[i] = null;

    System.out.println("\n" + (++test) + ") Test InputClientFromConsole");
    Client cli_c = new Client();
    cli_c.inputClientFromConsole();
    cli_c.showInConsole();

    System.out.println("\n" + (++test) + ") Test InputNewAccountFromConsole");
    cli_c.inputNewAccountFromConsole();
    cli_c.Accounts.get(0).showInConsole();

    System.out.println("\n" + (++test) + ") Test InputNewCreditFromConsole");
    cli_c.inputNewCreditFromConsole();
    cli_c.Credits.get(0).showInConsole();

    System.out.println("\n" + (++test) + ") Test InputNewDepositFromConsole");
    cli_c.inputNewDepositFromConsole();
    cli_c.Deposits.get(0).showInConsole();

    System.out.println("\n" + (++test) + ") Test InputNewTransactionFromConsole");
    cli_c.Accounts.get(0).inputNewTransactionFromConsole(cli.Accounts.get(0));
    cli_c.Accounts.get(0).showAllTransactionInConsole();
  }
}