package weekone;

import java.util.Scanner;

public class four {
	public static void main(String a[]) {
		int length,width,crownsNumber;
		double price=0;
		String color;
		int frame,crowns;;
		
		System.out.println("������ͼƬ�ĳ��Ϳ�");
		Scanner scan=new Scanner(System.in);
		length=scan.nextInt();
		width=scan.nextInt();
		
		System.out.println("��ѡ���Ƿ���Ҫ��ʽ����1,�ǣ�0���񣩣�");
		Scanner scan1=new Scanner(System.in);
		frame=scan1.nextInt();
		if(frame==1) {
			price=0.25*length*width;
		}
		else {
			price=0.15*length*width;
		}
		System.out.println("�����ܼ۸�Ϊ��"+price);
		
		System.out.println("��ѡ�񻭿���ɫ��");
		Scanner scan2=new Scanner(System.in);
		color=scan2.next();
		
		price=price+(0.1+0.02+0.07)*length*width;
		
		System.out.println("�����ܼ۸�Ϊ��"+price);
		
		System.out.println("��ѡ���Ƿ���Ҫ�ʹڣ�1,�ǣ�0���񣩣�");
		Scanner scan3=new Scanner(System.in);
		crowns=scan3.nextInt();
		if(crowns==1) {
			System.out.println("������Ҫ�����ʹڣ�С��4����");
			Scanner scan4=new Scanner(System.in);
			crownsNumber=scan4.nextInt();
			price=price+0.35*crownsNumber;
		}
		
		System.out.println("�����ܼ۸�Ϊ��"+price);
	}

}
