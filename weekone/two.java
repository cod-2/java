package weekone;

import java.util.Scanner;

public class two {
	public static void main(String a[]) {
		int biscuitsNumber,boxsNumber,coutainerNumber,biscuitsLeft,boxsLeft;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("��������ɵ�������");
		biscuitsNumber=scan.nextInt();
		
		boxsNumber=biscuitsNumber/24;
		coutainerNumber=boxsNumber/75;
		biscuitsLeft=biscuitsNumber%24;
		boxsLeft=boxsNumber%75;
		
		System.out.println("���ӵ�������"+boxsNumber);
		System.out.println("������������"+coutainerNumber);
		System.out.println("ʣ����ɵ�������"+biscuitsLeft);
		System.out.println("ʣ����ӵ�������"+boxsLeft);
	
	}

}
