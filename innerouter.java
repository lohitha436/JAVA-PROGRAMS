package lohitha;
class computer{
	String brand="lenovo ";
	String speed="4";
	class processor{
		public void displayDetails()
		{
			System.out.println(speed);
			System.out.println(brand);
		}
		}
}
public class innerouter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer myOuter=new computer();//obj creation for outer class
		computer.processor myInner=myOuter.new processor();//accessing inner class from outer
		myInner.displayDetails();
		
	}

}


