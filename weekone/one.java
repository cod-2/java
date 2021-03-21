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
		System.out.println("请输入歌曲名称：");
		songTitle=scan.nextLine();
		System.out.println("请输入单价：");
		songPrice=scan.nextFloat();
		System.out.println("请输入数量：");
		number=scan.nextInt();
		
		totalRevenue=songPrice*number;
		siteRevenue=totalRevenue*siteRate;
		manageRevenue=totalRevenue*manageRate;
		
		System.out.println("总利润："+totalRevenue);
		System.out.println("网站利润："+siteRevenue);
		System.out.println("经理利润："+manageRevenue);
		
	}

}
