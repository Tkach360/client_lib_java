package client_lib;

import java.util.Scanner;

public class Input{

	public static int inputInt(String message) {
		Scanner in = new Scanner(System.in);
		String age;

		do {
			System.out.println(message);
			age = in.nextLine();
		} while (!Verify.isValidInt(age));

		return Integer.parseInt(age);
	}

	public static double inputDouble(String message) {
		Scanner in = new Scanner(System.in);
		String money;

		do {
			System.out.println(message);
			money = in.nextLine();
		} while (!Verify.isValidDouble(money));

		return Double.parseDouble(money);
	}

	public static String inputClientName(String message) {
		Scanner in = new Scanner(System.in);
		String clientName;

		do {
			System.out.println(message);
			clientName = in.nextLine();
		} while (!Verify.isValidClientName(clientName));

		return clientName;
	}

	public static String inputClientPhoneNumber(String message) {
		String phoneNumber;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println(message);
			phoneNumber = in.nextLine();
		} while (!Verify.isValidPhoneNumber(phoneNumber));

		return phoneNumber;
	}
}