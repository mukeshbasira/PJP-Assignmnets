package Language;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Synonym {

	Map<String, Set<String>> translationHashMap = new HashMap<String, Set<String>>();

	public boolean hasTranslation(String word) {
		return translationHashMap.containsKey(word);
	}

	public String translation(String word) {

		return translationHashMap.get(word).toString();
	}

	public void addSynonym(String trim, Set<String> word1) {
		translationHashMap.put(trim, word1);
		System.out.printf("added word -> %s and meanings %s \n", trim, word1);

	}

}
