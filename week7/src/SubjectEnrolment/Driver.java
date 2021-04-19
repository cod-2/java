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
					System.out.println("请先执行1操作，创建课程");
					break;
				}
				add();break;
			case 3:
				if(enrolment==null)
				{
					System.out.println("请先执行1操作，创建课程");
					break;
				}
				del();break;
			case 4:
				if(enrolment==null)
				{
					System.out.println("请先执行1操作，创建课程");
					break;
				}
				print();break;
			default:System.out.println("输入错误！");
			}
			chioce=menu();
		}
		System.out.println("谢谢使用！退出程序");
		
	}
	public static int menu(){
		int chioce;
		System.out.println("=======Enrolment=======");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退课");
		System.out.println("4.输出");
		System.out.println("5.退出");
		System.out.println("=======Enrolment=======");
		System.out.println("请选择：");
		Scanner scan=new Scanner(System.in);
		chioce=scan.nextInt();
		return chioce;
	}
	public static void create()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入课程代码：");
		String id=scan.next();
		System.out.println("请输入课程名称：");
		String name=scan.next();
		System.out.println("请输入最大选课人数：");
		int maxSize=scan.nextInt();
		Subject sub=new Subject(id,name,maxSize);
		enrolment=new Enrolment(sub);
		System.out.println("创建成功！");
		System.out.println(enrolment.getSub().toString());
	}
	public static void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入选课学生学号：");
		String id=scan.next();
		System.out.println("请输入学生名字：");
		String name=scan.next();
		Student stu=new Student(id,name);
		if(enrolment.add(stu))
			System.out.println("添加成功！");
		else
			System.out.println("添加失败！");
	}
	public static void del()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入要删除序号:");
		int index=scan.nextInt();
		if(enrolment.remove(index))
			System.out.println("删除成功！");
		else
			System.out.println("删除失败！");
	}
	public static void print()
	{
		System.out.println(enrolment.toString());
	}

}
