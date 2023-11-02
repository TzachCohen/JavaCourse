package Loops;

import java.util.Scanner;

public class Exercise2_advanced {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Write your number");
			long number = scan.nextLong();
			if (number < 18 ) {
				System.out.println("he is young");
				System.out.println("Write your number");
				number = scan.nextLong();
				if (number > 65) {
					System.out.println("he is old");
					number = scan.nextLong();
				}
				
			}

	}

}
