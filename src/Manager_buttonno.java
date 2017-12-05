import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Manager_buttonno extends Component implements ActionListener {
	// private FileWriter fw = new FileWriter("/Users/wildlaws/desktop/a.txt");
	// 이게 안되는 이유가 뭘
	static String line2[];
	static GregorianCalendar time = new GregorianCalendar();
	private static int second = time.get(Calendar.SECOND);
	private static int minute = time.get(Calendar.MINUTE);
	private static int hour = time.get(Calendar.HOUR);
	private static int day = time.get(Calendar.DATE);
	private static int dm = time.get(Calendar.DAY_OF_MONTH);
	private static int month = time.get(Calendar.MONTH);
	JButton b0 = new JButton("Plolog            ");
	JButton b1 = new JButton("Chart             ");
	JButton b2 = new JButton("Problem          ");
	JButton b3 = new JButton("Idea             ");
	JButton b4 = new JButton("Jjan!!!           ");
	JButton b5 = new JButton("The ended         ");
	
	BufferedImage img;
	  
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null); //그림을 그리는 메소드
    }
    //디폴트 생성자
    public void Image() {
       try {
        String filename="/Users/wildlaws/desktop/Mylife/sky.jpeg"; // 파일의 경로
           img = ImageIO.read(new File(filename));   //이미지 파일을 불러오는 IO 메소드
                                //파일경로의 이미지 파일을 읽는다.
       } catch (IOException e) {
        e.printStackTrace();
       }
    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100); //그림 파일이 없을 경우 프레임의 크기를 100,100으로 만든다
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null)); //그림의 크기에 따라 화면의 크기를 변경한다.
       }
    }

	public Manager_buttonno() {
		JFrame f = new JFrame("Hello! Today is " + (month + 1) + " /" + day + "/" + hour + " /" + minute);
		

		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		
		
		

		// 버튼 추가
		f.add(new Image());
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.pack();

		// 프레임 크기 지정
		f.setSize(2000, 2000);

		// 프레임 보이도록 설정
		f.setVisible(true);

		// X버튼 눌렀을 때 닫히도록 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b0.addActionListener((ActionListener) f);
		b1.addActionListener((ActionListener) f);
		b2.addActionListener((ActionListener) f);
		b3.addActionListener((ActionListener) f);
		b4.addActionListener((ActionListener) f);
		b5.addActionListener((ActionListener) f);
	}

	// 이건 밑에 반복하는거에 걸리니까 간좀 보
	public static void main(String[] args) throws IOException {

		new Manager_buttonno();

		// FileWriter fw = new FileWriter("/Users/wildlaws/desktop/Mylife/idea.txt",
		// true);
		// Question q = new Question();
		// Go g = new Go();
		//
		// JOptionPane.showMessageDialog(null, "Hello! Today is"+(month+1)+" /"+day+"
		// /"+hour+" /"+minute);
		// int n = Question.Q1();
		//
		// if (n == 0) {
		// Plolog.main(args);
		// // if(a==3) {
		// // JOptionPane.showMessageDialog(null,"프로그램이 꺼지도록 구현 할것 ");
		// // }
		// } else if (n == 1) {
		// Clock.main(n);
		// Manager.main(args);
		// } else if (n == 2) {
		// String line2[] = new String[5];
		//
		// String input = JOptionPane.showInputDialog("What is the problem?");
		// String s = input;
		// String time = (month+1)+" /"+day+" /"+hour+" /"+minute;
		// fw.write(time + " \r\n");
		// fw.write(s + " \r\n");
		// fw.close();
		//
		// BufferedReader br = new BufferedReader(new
		// FileReader("/Users/wildlaws/desktop/Mylife/idea.txt"));
		// String line21 = (String) br.readLine();
		//
		//// System.out.println(line2[0]);
		// //딴방법이 필요할듯
		//// while (true) {
		//// String line = br.readLine();
		////
		//// JOptionPane.showMessageDialog(null, line);
		////
		//// if (line == null)
		//// break;
		////
		//// }
		//// 굳이 출력갑을 확인할 이유가없어
		// br.close();
		// int n1 = q.Q3();
		// if (n1 == 1) {
		// Memo m = new Memo();
		//
		// m.main(args);
		// } else {
		// Manager.main(args);
		// }
		//
		// } else if (n == 3) {
		// g.idea();
		// Manager.main(args);
		// } else if (n == 4) {
		// g.jjan();
		// Manager.main(args);
		// } else if (n == 5) {
		// // [호준 , 민지 , 지은 , 수민 , 미경 , 지윤 , 선아 , 미진 ];
		// String ch[] = { "내인생은 결국 나밖에 살수 없다 \n by wildlaw(안호준)",
		// "삶이 있는 한 희망은 있다 \n by 키케로 ",
		// "산다는것 그것은 치열한 전투이다. \n by로망로랑 ",
		// "하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다. \n by 사무엘 존슨 ",
		// "언제나 현재에 집중할수 있다면 행복할것이다. \n by 파울로 코엘료 ",
		// "단순하게 살아라.\n 현대인은 쓸데없는 절차와 일 때문에 얼마나 복잡한 삶을 살아가는가?\n by 이드리스 샤흐" ,
		// "행복의 문이 하나 닫히면 다른 문이 열린다 \n 그러나 우리는 종종 닫힌 문을 멍하니 바라보다가\n우리를 향해 열린 문을 보지 못하게
		// 된다\n by 헬렌켈러"
		// };
		// int i;
		// i= (int) (Math.random() * 6);

		// String wise = ch[w[i]];

		// 랜덤으로 명언중 하나가 나오게 해놓을 것
		// JOptionPane.showMessageDialog(null, ch[i]);

	}

	// }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b0)) {

			Plolog p = new Plolog();
			try {
				p.main(line2);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource().equals(b1)) {

		} else if (e.getSource().equals(b2)) {
			JOptionPane.showMessageDialog(this, "문제가 있으시네요 ");
			Question q = new Question();
			int n1 = q.Q3();
			if (n1 == 1) {
				Memo m = new Memo();
			}
		} else if (e.getSource().equals(b3)) {
			JOptionPane.showMessageDialog(this, "문제의 해결책이 있으신가");
			
			
		} else if (e.getSource().equals(b4)) {
			JOptionPane.showMessageDialog(this, "해결되었습니다!!");
			
			
		} else if (e.getSource().equals(b5)) {
			//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			String ch[] = { "내인생은 결국 나밖에 살수 없다 \n by wildlaw(안호준)", "삶이 있는 한 희망은 있다 \n by 키케로 ",
					"산다는것 그것은 치열한 전투이다. \n by로망로랑 ", "하루에 3시간을 걸으면 7년 후에 지구를 한바퀴 돌 수 있다. \n by 사무엘 존슨 ",
					"언제나 현재에 집중할수 있다면 행복할것이다. \n by 파울로 코엘료 ",
					"단순하게 살아라.\n 현대인은 쓸데없는 절차와 일 때문에 얼마나 복잡한 삶을 살아가는가?\n by 이드리스 샤흐",
					"행복의 문이 하나 닫히면 다른 문이 열린다 \n 그러나 우리는 종종 닫힌 문을 멍하니 바라보다가\n우리를 향해 열린 문을 보지 못하게 된다\n by 헬렌켈러" };
			int i;
			i = (int) (Math.random() * 6);

			// String wise = ch[w[i]];

			// 랜덤으로 명언중 하나가 나오게 해놓을 것
			JOptionPane.showMessageDialog(null, ch[i]);
			System.exit(0);

		}

	}

}
