package weekone;

import java.util.Scanner;

public class four {
	public static void main(String a[]) {
		int length,width,crownsNumber;
		double price=0;
		String color;
		int frame,crowns;;
		
		System.out.println("请输入图片的长和宽：");
		Scanner scan=new Scanner(System.in);
		length=scan.nextInt();
		width=scan.nextInt();
		
		System.out.println("请选择是否需要花式画框（1,是；0，否）：");
		Scanner scan1=new Scanner(System.in);
		frame=scan1.nextInt();
		if(frame==1) {
			price=0.25*length*width;
		}
		else {
			price=0.15*length*width;
		}
		System.out.println("画框总价格为："+price);
		
		System.out.println("请选择画框颜色：");
		Scanner scan2=new Scanner(System.in);
		color=scan2.next();
		
		price=price+(0.1+0.02+0.07)*length*width;
		
		System.out.println("画框总价格为："+price);
		
		System.out.println("请选择是否需要皇冠（1,是；0，否）：");
		Scanner scan3=new Scanner(System.in);
		crowns=scan3.nextInt();
		if(crowns==1) {
			System.out.println("请问需要几个皇冠（小于4）：");
			Scanner scan4=new Scanner(System.in);
			crownsNumber=scan4.nextInt();
			price=price+0.35*crownsNumber;
		}
		
		System.out.println("画框总价格为："+price);
	}

}
