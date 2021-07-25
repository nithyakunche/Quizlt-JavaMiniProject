import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

class Math_Quiz implements ActionListener{
	
	String[] questions_org = {
							"What is three fifth of 100?",
							"If David’s age is 27 years old in 2011. What was his age in 2003?.",
							"What is the remainder of 21 divided by 7?",
							"What is 7% equal to?",
							"What is the square root of 121",
							"How many years are there in a decade?", 
							"What is the square of 15?",
							"What is the value of x if x^2 = 169",
							"What is the reciprocal of 17/15?",
							"In a century how many months are there?",
							"What is the average of first 150 natural numbers?",
							"0.003 × 0.02 = ?",
							"What is the average of the numbers: 0, 0, 4, 10, 5, and 5 ?",
							"|–4| + |4| – 4 + 4 = ?",
							"What is the value of x in the equation 3x – 15 – 6 = 0 ? ",
							"10-2 means …………. ",
							"The cube root of 1331 is ………… .",
							"All natural numbers and 0 are called the ……………….. numbers.",
							"142 × 16 = ………….. .",
							"10 is equal to …………. .",
                            "4505 ÷ 5 = ………… .",
							"10003 – 999 = ………….. .",
							"The simplest form of 1.5 : 2.5 is …………",
							"Evaluation of 83 × 82 × 8-5 is …………",
							"18/√…….. = 2",
							"4 : 13 :: 64 : …….. .",
							"What percentage should be added to 40 to make it 50?",
							"4.16 × 0.75 = ………… .",
							"Which least number should be added to 2600 to make it a perfect square?",
							"The number which is neither prime nor composite is ……. .",
							"A clock seen through a mirror shows 8 o’clock. What is the correct time?",
							"If the day tomorrow is Sunday, what was it yesterday?",
							"78 ÷ 5 ÷ 0.5 = ?",
							"Simplify: 0 × 102",
							"Subtract - 8a from - 3a.", 
							"Solve: x - 3 = 5",
							"How many sides are there in a nonagon?",
							"How many months have 30 day.",
							"Which number occurred before 9019?",
							"What kind of number is 37?"
							};
	String[][] options_org = 	{
							{"3","5","20","60"},
							{"17","37","20","19"},
							{"21","7","1","None of These"},
							{"0.007","0.07","0.7","7"},
							{"10","11","12","13"},
							{"5","10","15","20"},
							{"15","30","252","225"},
							{"1","13","169","338"},
							{"13","15/17","17/15","30/34"},
							{"12","120","1200","12000"},
							{"70","70.5","75","75.5"},
							{"0.06","0.006","0.0006","0.00006"},
							{"2","3","4","5"},
							{"0","2","4","8"},
							{"7","8","9","-9"},
							{"11","13","19","17"},
							{"whole","prime","integer","rational"},
							{"7222","2227","2722","2272"},
							{"-1","0","1","none of the above"},
							{"901","910","190","109"},
							{"4009","9004","9040","9400"},
							{"6:10","15:25","0.75:1.25","3:5"},
							{"1","0","8","none of he above"},
							{"6","18","36","81"},
							{"168","198","208","228"},
							{"15","25","75","80"},
							{"0.312","0.0312","3.12","31.2"},
							{"10","11","12","13"},
							{"3","39 ","1","5"},
							{"0","1","3","2"},
							{"8.00","4.00","12.20","12.40"},
							{"Wednesday","Thursday","Friday ","Saturday"},
							{"15.6","31.2","7.8","20.4"},
							{"10","10.2","102","none of the above"},
                            {"2a","5a","-11a","11a"},
							{"-8","-5","-9","8"},
							{"3","5","7","9"},
							{"2","4","11","12"},
							{"9099","9109","9091","none of the above"},
							{"odd","prime","both a and b","none of the above"}
							};
	char[] answers_org = 	{'D','D','D','B','B','B','D','B','B','C','D','D','C','D','A','B','A','A','D','C','A','B','D','A','D','C','B','C','C','B','B','C','B','D','B','D','D','B','D','C'
};
	
	String questions[] = new String[40];
	String options[][] = new String[40][4];
	char answers[]=new char[40];
	int index=0;
	char answer;
	int correct;
	int total_questions = 10;
	int seconds=10;
	int result;
	
	
	JFrame frame = new JFrame();
	JLabel quizit = new JLabel();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel topic = new JLabel();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
			}
		});
	
	
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
		
		
		topic.setBounds(0,125,1300,100);
		topic.setForeground(Color.WHITE);
		topic.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,65));
		topic.setHorizontalAlignment(JTextField.CENTER);
		topic.setText("Mathematics");
		
		
		textarea.setBounds(0,200,1300,100);
		textarea.setForeground(Color.WHITE);
		textarea.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		textarea.setBackground(new Color(0,153,76));
		textarea.setEditable(false);
		textarea.setWrapStyleWord(true);
		textarea.setLineWrap(true);
		
		buttonA.setBounds(250,300,100,50);
		buttonA.setForeground(Color.WHITE);
		buttonA.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(250,350,100,50);
		buttonB.setForeground(Color.WHITE);
		buttonB.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		buttonB.setFocusable(false);
		textarea.setForeground(Color.WHITE);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(250,400,100,50);
		buttonC.setForeground(Color.WHITE);
		buttonC.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(250,450,100,50);
		buttonD.setForeground(Color.WHITE);
		buttonD.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		
		answer_labelA.setBounds(300,300,1000,50);
		answer_labelA.setForeground(Color.WHITE);
		answer_labelA.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		answer_labelA.setHorizontalAlignment(JTextField.CENTER);
		
		
		answer_labelB.setBounds(300,350,1000,50);
		answer_labelB.setForeground(Color.WHITE);
		answer_labelB.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		answer_labelB.setHorizontalAlignment(JTextField.CENTER);
		
		
		answer_labelC.setBounds(300,400,1000,50);
		answer_labelC.setForeground(Color.WHITE);
		answer_labelC.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		answer_labelC.setHorizontalAlignment(JTextField.CENTER);
		
		
		answer_labelD.setBounds(300,450,1000,50);
		answer_labelD.setForeground(Color.WHITE);
		answer_labelD.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,35));
		answer_labelD.setHorizontalAlignment(JTextField.CENTER);
		
		
		time_label.setBounds(1000,500,100,35);
		time_label.setForeground(Color.WHITE);
		time_label.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		time_label.setHorizontalAlignment(JTextField.CENTER);
		time_label.setText("Timer");
		
		
		seconds_left.setBounds(1000,535,100,100);
		seconds_left.setForeground(Color.RED);
		seconds_left.setFont(new Font("SUKHUMVIT SET",Font.BOLD,60));
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		
		frame.add(topic);
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(quizit);
		frame.setVisible(true);
		
		
		Integer[] arr = new Integer[40];
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr));
	    for(int i=0;i<10;i++) {
	    	questions[i]=questions_org[arr[i]];
	    	for(int j=0;j<4;j++) {
	    		options[i][j]=options_org[arr[i]][j];
	    	}
	    	answers[i]=answers_org[arr[i]];
	    }
	    
	    
	    
		nextQuestion();
		
		
	}	
	
	public void nextQuestion() {
		if(index>=total_questions) {
			result();
		}
		else {
			quizit.setText("QuizIt");
			textarea.setText((index+1)+"."+questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
			buttonA.setEnabled(false);
			buttonB.setEnabled(false);
			buttonC.setEnabled(false);
			buttonD.setEnabled(false);
			
			if(e.getSource()==buttonA) {
				answer= 'A';
				if(answer == answers[index]) {
					correct++;
				}
			}
			if(e.getSource()==buttonB) {
				answer= 'B';
				if(answer == answers[index]) {
					correct++;
				}
			}
			if(e.getSource()==buttonC) {
				answer= 'C';
				if(answer == answers[index]) {
					correct++;
				}
			}
			if(e.getSource()==buttonD) {
				answer= 'D';
				if(answer == answers[index]) {
					correct++;
				}
			}
			displayAnswer();
	}

	public void displayAnswer() {
		
		timer.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(Color.RED);
		if(answers[index] != 'B')
			answer_labelB.setForeground(Color.RED);
		if(answers[index] != 'C')
			answer_labelC.setForeground(Color.RED);
		if(answers[index] != 'D')
			answer_labelD.setForeground(Color.RED);
		if(answers[index] == 'A')
			answer_labelA.setForeground(Color.GREEN);
		if(answers[index] == 'B')
			answer_labelB.setForeground(Color.GREEN);
		if(answers[index] == 'C')
			answer_labelC.setForeground(Color.GREEN);
		if(answers[index] == 'D')
			answer_labelD.setForeground(Color.GREEN);
		
		Timer pause = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				answer_labelA.setForeground(Color.WHITE);
				answer_labelB.setForeground(Color.WHITE);
				answer_labelC.setForeground(Color.WHITE);
				answer_labelD.setForeground(Color.WHITE);
				
				answer = ' ';
				seconds=10;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		pause.setRepeats(false);
		pause.start();
	}
	public void result() {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = correct;
		Login nam = new Login();
		String cat="Mathematics";
		nam.result_display(result,cat);
	}
}
