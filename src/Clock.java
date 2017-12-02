
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock extends JPanel {
	private int secondy;
	private int minutey;
	private int houry;

	public Clock() {
		int width = 200;
		JFrame f = new JFrame();
		f.setTitle("Clock");
		f.setSize(500, 500);
		f.setVisible(true);
		f.getContentPane().add(this);
	}

	public void gettime(int secondy, int minutey, int houry, Graphics g) {
		int s_angle = 90 - (secondy * 6);
		int m_angle = 90 - (minutey * 6);
		int h_angle = 90 - (houry * 30);
		int gap = 50;
		int d = 100;
		System.out.println(secondy + "      " + s_angle);
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.black);
		g.drawOval(gap, gap, d, d);
		g.setColor(Color.blue);
		g.fillArc(gap + 25, gap + 25, d - 50, d - 50, h_angle, 8);
		g.setColor(Color.red);
		g.fillArc(gap + 5, gap + 5, d - 10, d - 10, m_angle, 5);
		g.setColor(Color.black);
		g.fillArc(gap + 10, gap + 10, d - 20, d - 20, s_angle, -3);

	}

	public void paintComponent(Graphics g) {
		gettiming();
		gettime(secondy, minutey, houry, g);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("ERROR!");
			e.printStackTrace();
		}
	}

	public void gettiming() {
		GregorianCalendar time = new GregorianCalendar();
		secondy = time.get(Calendar.SECOND);
		minutey = time.get(Calendar.MINUTE);
		houry = time.get(Calendar.HOUR);
		this.repaint();
	}

	public static void main(int n) {
		Clock c = new Clock();

	}

}