package Zadania;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
	
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		
		for(int i = 2; i < number; i++) {
			while(number % 2 == 0) {
				System.out.print(i + ", ");
				number /= i;
			}
		}
		if(number > 2) {
			System.out.println(number);
		}
	}

}
