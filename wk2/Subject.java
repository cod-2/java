package wk2

public class Subject {

	private String subId;
	private String SubName;
	private int maxSize;
	public Subject(String id,String name,int maxSize)
	{
		this.subId=id;
		this.SubName=name;
		this.maxSize=maxSize;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return SubName;
	}
	public void setSubName(String subName) {
		SubName = subName;
	}
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	public String toString()
	{
		String msg="";
		msg="�γ̴��룺"+this.subId;
		msg+="\t�γ�����;"+this.SubName;
		msg+="\t���������"+this.maxSize;
		return msg;
	}
}
