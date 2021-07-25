import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Instructions implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JLabel instructions = new JLabel();
	JLabel quizit = new JLabel();
	JLabel message1 = new JLabel();
	JLabel message2 = new JLabel();
	JLabel message3 = new JLabel();
	JLabel message4 = new JLabel();
	JLabel message5 = new JLabel();
	
	static String uname;
	public static void main(String args[]) {
		
	}
	
	public void name(String usname) {
		uname= usname;
		ini();
	}
	
	public void ini() {
		
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

		
		instructions.setBounds(0,125,1300,100);
		instructions.setForeground(Color.WHITE);
		instructions.setFont(new Font("SUKHUMIT SET",Font.PLAIN,50));
		instructions.setHorizontalAlignment(JTextField.CENTER);
		instructions.setText("Instructions");

		
		message1.setBounds(0,225,1300,45);
		message1.setForeground(Color.WHITE);
		message1.setHorizontalAlignment(SwingConstants.CENTER);
		message1.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,45));
		message1.setText("Hi "+uname+", welcome to QuizIt");
		
		
		message2.setBounds(0,300,1300,35);
		message2.setForeground(Color.WHITE);
		message2.setHorizontalAlignment(SwingConstants.CENTER);
		message2.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		message2.setText("1. You will be given 4 topics to choose from and each topic has 10 Questions.");
		
		
		message3.setBounds(0,350,1300,35);
		message3.setForeground(Color.WHITE);
		message3.setHorizontalAlignment(SwingConstants.CENTER);
		message3.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		message3.setText("2. Each topic has 10 questions and 10 Seconds will be given for each question.");
		
		
		message4.setBounds(0,400,1300,35);
		message4.setForeground(Color.WHITE);
		message4.setHorizontalAlignment(SwingConstants.CENTER);
		message4.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		message4.setText("Press Next to Choose your Topic");
		
		
		message5.setBounds(0,450,1300,35);
		message5.setForeground(Color.WHITE);
		message5.setHorizontalAlignment(SwingConstants.CENTER);
		message5.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,40));
		message5.setText("All the Best!");
		
		
		button.setBounds(600,500,100,50);
		button.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		button.setFocusable(false);
		button.addActionListener((ActionListener) this);
		button.setForeground(Color.WHITE);
		button.setText("Next");
		
		
		frame.add(button);
		frame.add(quizit);
		frame.add(instructions);
		frame.add(message1);
		frame.add(message2);
		frame.add(message3);
		frame.add(message4);
		frame.add(message5);
		
		frame.setVisible(true);			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unused")
		Choice ch = new Choice();
		frame.dispose();
	}
}