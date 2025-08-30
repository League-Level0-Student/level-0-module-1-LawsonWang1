package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {

		for (int loop = 0; loop < 2; loop +=1 ) {



			for (int badger = 0; badger < 12; badger +=1 ) {
				System.out.print("badger");
				if (badger < 11 ) {
					System.out.print(", ");
				}
			}
			System.out.println();
			for (int mushroom = 0; mushroom < 2; mushroom +=1 ) {

				System.out.print("mushroom");
				if (mushroom < 1) {
					System.out.print(", ");

				}
			}
			System.out.println();
			System.out.println();

		}

















	}
} 
