import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Plolog extends JFrame{

	public static void main(String[] args) throws IOException {
		int n1;
		while (true) {
			String input1 = JOptionPane.showInputDialog(
					"Do you want see? " + "\n" + "0.Go!" + "\n" + "1.Tutorial" + "\n" + "2.pilosophy" + "\n" + "3.end");

			if (isStringDouble(input1) == true) {
				n1 = new Integer(input1).intValue();
				if (0 <= n1 && n1 <= 5) {
					break;
				}

			}
		}

			
			
			if (n1 == 0) {
				

			} else if (n1 == 1) {
				JOptionPane.showMessageDialog(null, "사용법사진 같은");
				Plolog.main(args);
				

			} else if (n1 == 2) {
				JOptionPane.showMessageDialog(null, "My Life 의 철학 ");
				Plolog.main(args);
				

			} else if (n1 == 3) {
				JOptionPane.showMessageDialog(null, "혹시나 싶어서 넣어놓은건데 진짜 plolog에서 종료하시네요..? ");
				System.exit(0);
				

			} else {
				Plolog.main(args);

			}
		

	}

	private static boolean isStringDouble(String input1) {
		// TODO Auto-generated method stub
		try {
			Double.parseDouble(input1);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
