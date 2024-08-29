package lohitha;
//parameterized constructor
public class dog {
	String name;
	String color;
	public dog(String x , String y) {
		name=x;
		color=y;
	}
	public static void main(String args[]) {
		dog n=new dog("bruno","black");
		System.out.println(n.name);
		System.out.println(n.color);	
	}

}
