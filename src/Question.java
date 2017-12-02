import java.io.IOException;

import javax.swing.JOptionPane;

public class Question {
	Go g = new Go();
	String q1[];

	private static boolean isStringDouble(String input1) {
		// TODO Auto-generated method stub
		try {
			Double.parseDouble(input1);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int Q1() throws IOException {
		// TODO Auto-generated method stub
		int n;
		while (true) {
			String input1 = JOptionPane.showInputDialog(
					"What do you want?" + "\n" + "0.Introduce 1.Chart  2.Ploblem " + "\n" + " 3.Idea  4.Jjan  5.end");
			if (isStringDouble(input1) == true) {
				n = new Integer(input1).intValue();
				if (0 <= n && n <= 5) {
					break;
				}

			}

		}
		return n;

	}

	public int Q2() {
		// TODO Auto-generated method stub
		String input1 = JOptionPane
				.showInputDialog("Where do you want?" + "\n" + "1.Home  2.Dorimtory  3.Cluster  4.Library");
		if (input1 == "1" || input1 == "Home") {

		}
		return 1;

	}

	public static int Q3() {
		int n;
		while (true) {
			String input1 = JOptionPane.showInputDialog("Do tou want more? then please input 1");
			if (isStringDouble(input1) == true) {
				n = new Integer(input1).intValue();
				if (n==1) {
					return 1;
					
				}
				else {
					return 0;
				}

			}
			else {
				return 0;
			}

		}
		

	}

}
