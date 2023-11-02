package Loops;

import java.util.Scanner;

public class Exercise1_advanced {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your number");
		long number = scan.nextLong();

		while (number != -1) {
			System.out.println(number + " this is your number");
			System.out.println("Write your number");
			number = scan.nextLong();
		}
		scan.close();
		System.out.println("end");
	}

}
