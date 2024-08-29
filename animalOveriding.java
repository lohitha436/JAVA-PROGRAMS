package lohitha;
public class animalOveriding {
		public void move() {
			System.out.println("I'm an Animal");
		}
		class Cheetah extends animalOveriding {
			public void move() {
				System.out.println("I'm Cheetah,I'm the Fastest");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			animalOveriding a1 = new animalOveriding();
			Cheetah c1 = a1.new Cheetah();
			c1.move();
		}
	}
