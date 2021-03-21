package weekone;

import java.util.Scanner;

public class one {
	public static void main(String a[]) {
		float Money;
		int cents, DollarNum, fiftyCent, twentyCent, tenCent, fiveCent, twoCent, oneCent;
		System.out.println("Please enter the amount of money:");
		Scanner scan = new Scanner(System.in);
		Money = scan.nextFloat();
		scan.close();
		Money = Money * 100;
		cents = (int) Money;
		DollarNum = 0;
		DollarNum = cents / 100;
		cents = cents % 100;
		fiftyCent = 0;
		fiftyCent = cents / 50;
		cents = cents % 50;
		twentyCent = 0;
		twentyCent = cents / 20;
		cents = cents % 20;
		tenCent = 0;
		tenCent = cents / 10;
		cents = cents % 10;
		fiveCent = 0;
		fiveCent = cents / 5;
		cents = cents % 5;
		twoCent = 0;
		twoCent = cents / 2;
		cents = cents % 2;
		oneCent = 0;
		oneCent = cents / 1;
		cents = cents % 1;

		Money = Money / 100;
		System.out.println("$" + Money + " = $" + DollarNum + "+" + fiftyCent + "*50c+" + twentyCent + "*20c+"
				+ tenCent + "*10c+" + fiveCent + "*5c+" + twoCent + "*2c+" + oneCent + "*1c.");
	}

}