package Language;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Boolean continueBoolean = true;
		Synonym synonym = new Synonym();
		try (Scanner myscan = new Scanner(System.in)) {
			while (continueBoolean) {
				System.out.println("Enter the word to search for a synonym -> ");
				String word = myscan.next();
				if (word.isEmpty()) {
					System.out.println("please enter a word");

				} else {
					if (synonym.hasTranslation(word.trim())) {
						System.out.println(synonym.translation(word.trim()));
					}

					else {

						System.out.println("Not found .. to add synonyms for this word enter 1 else 0 :) ");
						Set<String> set = new HashSet<String>();
						while (myscan.hasNext()) {
							String string = myscan.next();
							if (string.equals("0")) {
								break;
							}else {
								System.out.println("** enter new synonym to add **");
								string = myscan.next();
								set.add(string.trim());
							}

							System.out.println("To continue adding press 1 else 0 -->>");

						}
						if (!set.isEmpty()) {
							synonym.addSynonym(word.trim(), set);
						}
					}
				}
				System.out.println("--- To search for new word press 1 else 0 ---");
				Integer number = myscan.nextInt();
				if (number.equals(1)) {
					continueBoolean = true;
				} else {
					continueBoolean = false;
				}

			}
		} catch (Exception e) {
			System.out.println("input error + " + e);
		}


	}

}


