package lohitha;
import java.util.*;
public class Shape {
	public void getArea() {
		int area=2*3;
		System.out.println(area);
	}
	class rectangle extends Shape{
		public void getArea() {
			System.out.println("enter length: ");
			Scanner ln=new Scanner(System.in);
			int l=ln.nextInt();
			System.out.println("enter breadth: ");
			int b=ln.nextInt();
			int area=l*b;
			System.out.println(area);
			ln.close();
			}
	}
	public static void main(String[] args) {
		Shape s1=new Shape();//obj creation
		rectangle r1=s1.new rectangle();
		r1.getArea();
	}
}
	