package lohitha;

public class areaShapes {
	public int area(int s){//square
		return s*s;
	}
	public double area (int l , int b) {//rectangle
		return l*b;	
	}
	public double area(double r) {//circle
		return 3.14*r*r;
	}
public static void main(String[] args) {
	areaShapes s=new areaShapes();
	System.out.println(s.area(6));
	System.out.println(s.area(10,6));
	System.out.println(s.area(4.5));
}
}

