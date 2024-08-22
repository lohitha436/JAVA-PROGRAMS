package lohitha;
class Parent{
	int exp=700;
}
	class child extends Parent{
	int bonus=200;
}
public class basic_inh {
public static void main(String[] args) {
	child mon=new child();
	System.out.println("exp"+mon.exp+"\nbonus"+mon.bonus);
}
}
