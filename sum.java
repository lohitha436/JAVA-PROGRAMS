package lohitha;

public class sum {
	public int add(int x) {
		return x;
	}
	public int add(int x ,int y) {
		return x+y;
	}
	public double add(int x,double z) {
		return x+z;
	}
	public static void main(String[] args) {
		sum s = new sum();
		System.out.println(s.add(10));
		System.out.println(s.add(10,2));
		System.out.println(s.add(1, 2.5));
	}
}
