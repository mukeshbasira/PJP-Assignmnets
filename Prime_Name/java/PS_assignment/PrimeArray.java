package PS_assignment;

import java.util.HashMap;

public class PrimeArray {
	HashMap<Character, Integer> primeMap = new HashMap<>();

	public void fill(Character a, Integer p) {
		this.primeMap.put(a, p);

	}

	public String toPrime(String userName) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < userName.length(); i++) {

			char c = Character.toUpperCase(userName.charAt(i));
			if (c <= 'Z' && c >= 'A') {

				stringBuilder.append(Integer.toHexString((primeMap.get(c))) + ",");

			} else {

				return "Not Valid Name provided";

			}


		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		stringBuilder.append(".");

		return stringBuilder.toString();
	}


}
