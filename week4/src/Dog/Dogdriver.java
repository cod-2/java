package Dog;

import java.util.Scanner;

public class Dogdriver {
	public static void main(String[] agr) {
		Dog b=new Dog();
		String Name,Color;
		int Age;
		b.display();
		
		System.out.println("Input name:");
		Scanner scan=new Scanner(System.in);
		Name=scan.next();
		System.out.println("Input color:");
		Color=scan.next();
		System.out.println("Input age:");
		Age=scan.nextInt();
		
		b.setName(Name);
		b.setColor(Color);
		b.setAge(Age);
		b.display();
		
	}

}
