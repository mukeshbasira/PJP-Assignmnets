
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class TimerInput {
	private String str = "";


	TimerTask task = new TimerTask() {
		@Override
		public void run() {
			if (str.equals("")) {
				System.out.println("NO input.Enter 1 to continue or 0 to exit ");
				// System.exit(0);
			}
		}

	};

	public String getInput() throws Exception {
		Timer timer = new Timer();
		timer.schedule(task, 10 * 1000);
		System.out.println("Input a option within 10 seconds OR PRESS 1 For Next Question ");
		BufferedReader inBufferedReader = new BufferedReader(new InputStreamReader(System.in));
		str = inBufferedReader.readLine();
		timer.cancel();

		System.out.println("you selected : " + str);
		return str;
	}


}

