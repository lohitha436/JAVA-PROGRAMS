package lohitha;

public class swap {
	public static void main(String[] args) {
		int a=15,b=24;
		System.out.println("the numbers before swapping are");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the numbers after swapping are:");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
