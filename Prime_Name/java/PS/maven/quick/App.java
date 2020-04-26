package PS.maven.quick;

public class App
{

	public static void main( String[] args )
	{
		AssignPrime assignprime = new AssignPrime();
		Prime prime = new Prime();
		Character startCharacter = 'A';
		Character endCharacter = 'B';
		for (Character i = startCharacter; i < endCharacter; i++) {

			assignprime.fill(startCharacter, prime.NextPrime());
		}

	}
}
