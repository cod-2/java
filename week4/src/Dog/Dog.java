package Dog;

public class Dog {
	String name,color;
	int age;
	public Dog() {
		this.name="Tom";
		this.color="yellow";
		this.age=5;
	}
	public Dog(String Name,String Color,int Age) {
		this.name=Name;
		this.color=Color;
		this.age=Age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void display() {
		System.out.println("name:"+name+" color:"+color+" age:"+age);
	}
}
