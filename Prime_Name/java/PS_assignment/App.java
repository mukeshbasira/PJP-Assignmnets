package PS_assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{

	public static void main( String[] args )
	{
		PrimeArray primeArray = new PrimeArray();
		Prime prime = new Prime();
		Character startCharacter = 'A';
		Character endCharacter = 'Z';
		for (Character i = startCharacter; i <= endCharacter; i++) {
			primeArray.fill(i, prime.NextPrime());
		}
		try (Scanner myscan = new Scanner(System.in)) {
			System.out.println("Enter name");
			String userName = myscan.nextLine();
			System.out.println("Username in Prime is: " + primeArray.toPrime(userName));
			myscan.close();
		} catch (InputMismatchException e) {
			System.out.println(e + " **please enter a String input** ");

		}

	}
}
