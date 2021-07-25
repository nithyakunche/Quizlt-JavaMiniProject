import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Choice implements ActionListener{
	JFrame frame = new JFrame();
	JLabel quizit = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JLabel heading = new JLabel(); 
	public static void main(String args[]) {
		
	}
	public Choice() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1300,650);
		frame.getContentPane().setBackground(new Color(0,153,76));
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		quizit.setBounds(0,0,1300,150);
		quizit.setForeground(Color.WHITE);
		quizit.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,100));
		quizit.setHorizontalAlignment(JTextField.CENTER);
		quizit.setText("QuizIt");
		
		
		heading.setBounds(0,150,1300,75);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,50));
		heading.setHorizontalAlignment(JTextField.CENTER);
		heading.setText("Choose your Topic");
		
		
		button1.setBounds(350,250,600,50);
		button1.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		button1.setFocusable(false);
		button1.setForeground(Color.WHITE);
		button1.addActionListener((ActionListener) this);
		button1.setText("English");
		
		
		button2.setBounds(350,300,600,50);
		button2.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		button2.setFocusable(false);
		button2.setForeground(Color.WHITE);
		button2.addActionListener((ActionListener) this);
		button2.setText("Mathematics");
		
		
		button3.setBounds(350,350,600,50);
		button3.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		button3.setFocusable(false);
		button3.setForeground(Color.WHITE);
		button3.addActionListener((ActionListener) this);
		button3.setText("Sports");
		
		
		button4.setBounds(350,400,600,50);
		button4.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		button4.setFocusable(false);
		button4.setForeground(Color.WHITE);
		button4.addActionListener((ActionListener) this);
		button4.setText("World Affairs");
		
		
		button5.setBounds(350,450,600,50);
		button5.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		button5.setFocusable(false);
		button5.setForeground(Color.WHITE);
		button5.addActionListener((ActionListener) this);
		button5.setText("Science and Technology");
		
		
		frame.add(heading);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(quizit);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) { 
		
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		frame.dispose();
		if(e.getSource()==button1) {
			Eng_Quiz eq = new Eng_Quiz();
			eq.ini();
		}
		else if(e.getSource()==button2) {
			Math_Quiz mq = new Math_Quiz();
			mq.ini();
		}
		else if(e.getSource()==button3) {
			Sports_Quiz sq = new Sports_Quiz();
			sq.ini();
		}
		else if(e.getSource()==button4) {
			World_Quiz wq = new World_Quiz();
			wq.ini();
		}
		else if(e.getSource()==button5) {
			Sci_Quiz sq = new Sci_Quiz();
			sq.ini();
		}
	}
}