package SubjectEnrolment;

import java.util.Scanner;

public class Driver {
	public static Enrolment enrolment=null;
	public static void main(String[] a){
		int chioce=menu();
		while(chioce!=5){
			switch(chioce)
			{
			case 1:create();break;
			case 2:
				if(enrolment==null)
				{
					System.out.println("����ִ��1�����������γ�");
					break;
				}
				add();break;
			case 3:
				if(enrolment==null)
				{
					System.out.println("����ִ��1�����������γ�");
					break;
				}
				del();break;
			case 4:
				if(enrolment==null)
				{
					System.out.println("����ִ��1�����������γ�");
					break;
				}
				print();break;
			default:System.out.println("�������");
			}
			chioce=menu();
		}
		System.out.println("ллʹ�ã��˳�����");
		
	}
	public static int menu(){
		int chioce;
		System.out.println("=======Enrolment=======");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.�˿�");
		System.out.println("4.���");
		System.out.println("5.�˳�");
		System.out.println("=======Enrolment=======");
		System.out.println("��ѡ��");
		Scanner scan=new Scanner(System.in);
		chioce=scan.nextInt();
		return chioce;
	}
	public static void create()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������γ̴��룺");
		String id=scan.next();
		System.out.println("������γ����ƣ�");
		String name=scan.next();
		System.out.println("���������ѡ��������");
		int maxSize=scan.nextInt();
		Subject sub=new Subject(id,name,maxSize);
		enrolment=new Enrolment(sub);
		System.out.println("�����ɹ���");
		System.out.println(enrolment.getSub().toString());
	}
	public static void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������ѡ��ѧ��ѧ�ţ�");
		String id=scan.next();
		System.out.println("������ѧ�����֣�");
		String name=scan.next();
		Student stu=new Student(id,name);
		if(enrolment.add(stu))
			System.out.println("��ӳɹ���");
		else
			System.out.println("���ʧ�ܣ�");
	}
	public static void del()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("������Ҫɾ�����:");
		int index=scan.nextInt();
		if(enrolment.remove(index))
			System.out.println("ɾ���ɹ���");
		else
			System.out.println("ɾ��ʧ�ܣ�");
	}
	public static void print()
	{
		System.out.println(enrolment.toString());
	}

}
