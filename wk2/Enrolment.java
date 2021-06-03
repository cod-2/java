package wk2

public class Enrolment {

	private Student stu[];
	private Subject sub;
	private int count;
	public Enrolment(Subject sub)
	{
		stu=new Student[sub.getMaxSize()];
		this.sub=sub;
		count=0;
	}
	
	public Student[] getStu() {
		return stu;
	}

	public void setStu(Student[] stu) {
		this.stu = stu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}
	public boolean add(Student s)
	{
		if(s==null)
		{
			System.out.println("不可传空值");
			return false;
		}
		if(count>=sub.getMaxSize())
		{
			System.out.println("已达最大存储空间");
			return false;
		}
		stu[count]=s;
		count++;
		return true;
	}
	public boolean remove(int index)
	{
		if(index<0||index>=count)
		{
			System.out.println("超出范围");
			return false;
		}
		if(index==0||index==count-1)
		{
			stu[index]=null;
			count--;
			return true;
		}
		stu[index]=null;
		count--;
		for(int i=index;i<=count;i++)
			stu[i]=stu[i+1];
		stu[count]=null;
		return true;
	}
	public int indexOf(String id)
	{
		for(int i=0;i<count&&stu[i]!=null;i++)
			if(stu[i].getId()==id)
				return i;
		return -1;
	}
	public String toString()
	{
		String msg="";
		msg="选课信息如下：\n";
		msg+=this.sub.toString()+"\n";
		for(int i=0;i<count;i++)
			msg+=this.stu[i].toString()+"\n";
		return msg;
	}
}
