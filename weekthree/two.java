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
					System.out.println("������ɲ���1");
				} else {
					outputOddNum();
				}
				break;
			case 3:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("������ɲ���1");
				} else {
					outputEvenSum();
				}
				break;
			case 4:
				if (firstNum == 0 && secondNum == 0) {
					System.out.println("������ɲ���1");
				} else {
					outputOddSqu();
				}
				break;
			default:
				System.out.println("�������!");
			}
			choose = menu();
		}
		System.out.println("ллʹ�ã��˳�����");
	}

	public static int menu()// ���
	{
		int choose;
		System.out.println("==================");
		System.out.println("1.����������");
		System.out.println("2.�����������");
		System.out.println("3.�������ż����");
		System.out.println("4.�����������ƽ����");
		System.out.println("5.�˳�");
		System.out.println("==================");
		System.out.println("��ѡ��");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void Input()// ����ѧ���ɼ�
	{
		System.out.println("��������������(firstNum<secondNumber):");
		Scanner scan = new Scanner(System.in);
		firstNum = scan.nextInt();
		secondNum = scan.nextInt();

		while (firstNum >= secondNum) {
			System.out.println("������������������(firstNum<secondNumber)��");
			Scanner scan1 = new Scanner(System.in);
			firstNum = scan1.nextInt();
			secondNum = scan1.nextInt();
		}
	}

	public static void outputOddNum()// �����������
	{
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}

	public static void outputEvenSum()// �������ż����
	{
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("ż����Ϊ" + sum);
	}

	public static void outputOddSqu()// �����������ƽ��
	{
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			if (i % 2 != 0) {
				sum += i * i;
			}
		}
		System.out.println("����ƽ���ͣ�" + sum);
	}

}
