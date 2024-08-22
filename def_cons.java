package lohitha;
//without parameters
public class def_cons {
	int a=2 ,b=4;
	int x;
	public def_cons() {
		x=a+b;
	}
	public static void main(String[] args) {
		def_cons obj = new def_cons();
		System.out.println(obj.x);
	}
}
