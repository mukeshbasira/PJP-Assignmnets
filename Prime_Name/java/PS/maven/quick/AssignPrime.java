package PS.maven.quick;

import java.util.HashMap;

public class AssignPrime {
	HashMap<Character, Integer> primeMap = new HashMap<>();

	public void fill(Character a, Integer p) {
		this.primeMap.put(a, p);
		System.out.println(a.toString() + p.toString());
	}

	public HashMap<Character, Integer> getPrimeMap() {
		return primeMap;
	}

	public void setPrimeMap(HashMap<Character, Integer> primeMap) {
		this.primeMap = primeMap;
	}

}
