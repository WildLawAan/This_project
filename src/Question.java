import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Question extends JFrame{
	static GregorianCalendar time = new GregorianCalendar();
	private static int second = time.get(Calendar.SECOND);
	private static int minute = time.get(Calendar.MINUTE);
	private static int hour = time.get(Calendar.HOUR);
	private static int day = time.get(Calendar.DATE);
	private static int dm = time.get(Calendar.DAY_OF_MONTH);
	private static int month = time.get(Calendar.MONTH);
	private static int week = time.get(Calendar.DAY_OF_WEEK);
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
			String input1 = JOptionPane.showInputDialog("더 자세한 사항의 입력을 원하시면 1을 입력하세요! ");
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
	public static void Q4() {
		JOptionPane.showMessageDialog(null,"문제가 있으시네요 ");
		String input = JOptionPane.showInputDialog("What is the problem?");
		String s = input + (month + 1) + " /" + day + " /" + hour + " /" + minute;
		
	}

}
