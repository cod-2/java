package SubjectEnrolment;

public class Student {

	private String id;
	private String name;
	public Student()
	{
		id="null";
		name="null";
	}
	public Student(String id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		String msg="";
		msg="ѧ�ţ�"+this.id;
		msg+="\t������"+this.name;
		return msg;
	}
}
