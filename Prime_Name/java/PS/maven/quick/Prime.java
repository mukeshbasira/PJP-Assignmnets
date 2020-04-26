package PS.maven.quick;

public class Prime {
	private Integer firstPrime ;
	private Integer currentPrimeInteger ;

	public Integer NextPrime() {
		currentPrimeInteger++;
		while(isPrime(currentPrimeInteger).booleanValue()==false)
		{
			currentPrimeInteger = currentPrimeInteger+1;
		}


		return currentPrimeInteger;

	}
	private Boolean isPrime(Integer a)
	{
		for(int i =firstPrime;i< Math.sqrt(a);i++  )
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;

	}

	public Prime() {
		this(2);
	}

	public Prime(Integer firstPrime) {
		this.firstPrime = firstPrime;
		this.currentPrimeInteger = firstPrime;
	}


}
