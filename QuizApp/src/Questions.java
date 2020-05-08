import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Questions {
	private JSONObject jo;
	private JSONArray ja;

	ArrayList<JSONObject> listquestions = new ArrayList<JSONObject>();
	ArrayList<JSONObject> answers = new ArrayList<JSONObject>();
	private static Integer quesNumber = 0;

	public Questions() throws FileNotFoundException, Exception, ParseException {
		Object obj = new JSONParser().parse(new FileReader("./Ques-JSON/Questions.json"));
		jo = (JSONObject) obj;
		ja = (JSONArray) jo.get("questions");
		listquestions.addAll(ja);
	}

	public Boolean isCorrect(String A) {
		return A.equals(((listquestions.get(quesNumber)).get("ans")));
	}

	public boolean hasNextQues() {

		if (listquestions.size() - 1 < quesNumber) {
			System.out.println("no more questions");
			return false;
		}
		return true;
	}

	public String nextQues() {
		return (String) (listquestions.get(quesNumber)).get("question");
	}

	public String options() {
		return ((listquestions.get(quesNumber)).get("options")).toString();

	}

	public void incQuesCount() {
		// TODO Auto-generated method stub
		quesNumber++;


	}

}