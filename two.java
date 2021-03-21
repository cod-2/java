package weekone;

import java.util.Scanner;

public class two {
	public static void main(String a[]) {
		int biscuitsNumber,boxsNumber,coutainerNumber,biscuitsLeft,boxsLeft;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入饼干的数量：");
		biscuitsNumber=scan.nextInt();
		
		boxsNumber=biscuitsNumber/24;
		coutainerNumber=boxsNumber/75;
		biscuitsLeft=biscuitsNumber%24;
		boxsLeft=boxsNumber%75;
		
		System.out.println("盒子的数量："+boxsNumber);
		System.out.println("容器的数量："+coutainerNumber);
		System.out.println("剩余饼干的数量："+biscuitsLeft);
		System.out.println("剩余盒子的数量："+boxsLeft);
	
	}

}
