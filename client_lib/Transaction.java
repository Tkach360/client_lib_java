package client_lib;

import java.util.Date;

public class Transaction {
	private boolean sent;
	private double money;
	private String alterClientName;
	private int alterAccountID;
	private Date time;

	Transaction(String alterclientname, int alterAccountID, double money, boolean sent) {
		this.sent = sent;
		this.alterAccountID = alterAccountID;
		this.alterClientName = alterClientName;
		this.money = money;
		time = new Date();
	}

	public boolean getSent() {
		return this.sent;
	}
	public double getMoney() {
		return this.money;
	}
	public String getAlterClientName() {
		return this.alterClientName;
	}
	public int getAlterAccountID() {
		return alterAccountID;
	}
	public Date getTime() {
		return time;
	}

	public void showInConsole() {
		String strTime = time.toString();
		String strMoney, strAlterClientName, strAlterAccountID;

		if (sent) {
			strMoney = "-" + Double.toString(money);
			strAlterClientName = "to " + alterClientName;
		}
		else {
			strMoney = "+" + Double.toString(money);
			strAlterClientName = "from " + alterClientName;
		}

		strAlterAccountID = Integer.toString(alterAccountID);
		System.out.println("Time: " + strTime + " " + strMoney + " " + strAlterClientName + " acc. " + strAlterAccountID);
	}
};