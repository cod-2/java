package Address;

import java.util.Scanner;

public class Addressdriver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Address b=new Address();
		String country,province,city,street,postalCode;
		System.out.println(b.toString());
		
		System.out.println("Input country:");
		Scanner scan=new Scanner(System.in);
		country=scan.next();
		System.out.println("Input province:");
		Scanner scan1=new Scanner(System.in);
		province=scan1.next();
		System.out.println("Input city:");
		Scanner scan2=new Scanner(System.in);
		city=scan2.next();
		System.out.println("Input street:");
		Scanner scan3=new Scanner(System.in);
		street=scan3.next();
		System.out.println("Input postalCode:");
		Scanner scan4=new Scanner(System.in);
		postalCode=scan4.next();
		
		b.setCountry(country);
		b.setProvince(province);
		b.setCity(city);
		b.setStreet(street);
		b.setPostalCode(postalCode);
		System.out.println(b.toString());
	}

}
