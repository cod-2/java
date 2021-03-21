package weektwo;

import java.util.Scanner;

public class two {
	public static void main(String a[]) {
		int i, n, number, wei, newNumber;
		System.out.println("Input n:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		for (i = (int) Math.pow(10, (n - 1)); i < (int) Math.pow(10, n); i++) {
			number = i;
			newNumber = 0;
			while (number > 0) {
				wei = number % 10;
				number = number / 10;
				newNumber = newNumber + (int) Math.pow(wei, n);
			}
			if (newNumber == i) {
				System.out.println(newNumber);
			}

		}
		System.out.println("Finish");
	}

}
