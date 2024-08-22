package lohitha;
class Animal{
	public void display()
	{
		System.out.println("Tiger");
	}
}
class Lion extends Animal{
	public void display()
	{
		System.out.println("Rabbit");
	}
}
public class OverRiding {
public static void main(String[] args) {
	Lion obj=new Lion();
	obj.display();
	}
}
