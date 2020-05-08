
import java.io.FileNotFoundException;

import org.json.simple.parser.ParseException;

public class QuizRunner {

	public static void main(String[] args) throws FileNotFoundException, ParseException, Exception {

		Questions questions = new Questions();
		while (questions.hasNextQues()) {
			System.out.println("Question --> " + questions.nextQues());
			System.out.println("options are  --> " + questions.options());
			TimerInput input = new TimerInput();
			String str = "";
			try {
				str = input.getInput();
			} catch (Exception e) {
				System.out.println(e + "input error ");
			}
			if (str.equals("1")) {
				questions.incQuesCount();
				continue;
			} else if (str.equals("0")) {
				break;
			} else {

				if (!str.isEmpty() && questions.isCorrect(str.toUpperCase())) {
					System.out.println("corrrect");
				} else {
					System.out.println("incorrect");
				}
				questions.incQuesCount();
		}

		}
		System.out.println("main exit...");

	}
}
