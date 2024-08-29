package lohitha;
//default constructor
public class cat {
	int age;
	String name;
	public cat() { //constructor
		age=0;
		name="unknown";
	}
	public static void main(String args[]) {
		cat myobj=new cat();
		System.out.println(myobj.age);
		System.out.println(myobj.name);
	}
}