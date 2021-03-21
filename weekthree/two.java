package weekthree;

import java.util.Scanner;

public class two {

	public static int firstNum = 0, secondNum = 0;

	public static void main(String[] a) {

		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				Input();
				break;
			case 2:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("请先完成操作1");
				} else {
					outputOddNum();
				}
				break;
			case 3:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("请先完成操作1");
				} else {
					outputEvenSum();
				}
				break;
			case 4:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("请先完成操作1");
				} else {
					outputOddSqu();
				}
				break;
			default:
				System.out.println("输入错误!");
			}
			choose = menu();
		}
		System.out.println("谢谢使用！退出程序");
	}

	public static int menu()// 最高
	{
		int choose;
		System.out.println("==================");
		System.out.println("1.输入两整数");
		System.out.println("2.输出所有奇数");
		System.out.println("3.输出所有偶数和");
		System.out.println("4.输出所有奇数平方和");
		System.out.println("5.退出");
		System.out.println("==================");
		System.out.println("请选择：");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void Input()// 输入学生成绩
	{
		System.out.println("请输入两个整数(firstNum<secondNumber):");
		Scanner scan = new Scanner(System.in);
		firstNum = scan.nextInt();
		secondNum = scan.nextInt();

		while (firstNum >= secondNum) {
			System.out.println("请重新输入两个整数(firstNum<secondNumber)：");
			Scanner scan1 = new Scanner(System.in);
			firstNum = scan1.nextInt();
			secondNum = scan1.nextInt();
		}
	}

	public static void outputOddNum()// 输出所有奇数
	{
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}

	public static void outputEvenSum()// 输出所有偶数和
	{
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("偶数和为" + sum);
	}

	public static void outputOddSqu()// 输出所有奇数平方
	{
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				sum += i * i;
			}
		}
		System.out.println("奇数平方和：" + sum);
	}

}
