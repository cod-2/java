package weekone;

import java.util.Scanner;

public class one {
	public static void main(String a[]) {
		String songTitle;
		float songPrice;
		int number;
		
		float totalRevenue,siteRevenue,manageRevenue,siteRate,manageRate;
		siteRate=0.03f;
		manageRate=0.12f;
		Scanner scan=new Scanner(System.in);
		System.out.println("������������ƣ�");
		songTitle=scan.nextLine();
		System.out.println("�����뵥�ۣ�");
		songPrice=scan.nextFloat();
		System.out.println("������������");
		number=scan.nextInt();
		
		totalRevenue=songPrice*number;
		siteRevenue=totalRevenue*siteRate;
		manageRevenue=totalRevenue*manageRate;
		
		System.out.println("������"+totalRevenue);
		System.out.println("��վ����"+siteRevenue);
		System.out.println("��������"+manageRevenue);
		
	}

}
