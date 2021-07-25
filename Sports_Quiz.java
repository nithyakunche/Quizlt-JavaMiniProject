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

class Sports_Quiz implements ActionListener{
	
	String[] questions_org = 	{
								"Where the Winter Olympic Games 2022 will be organized?",
								"Who became the youngest cricketer to claim a hat-trick in Test Cricket?",
								"How many players are there in a team of Volleyball?",
								"Who is the only Indian to score 500 run in consecutive IPL seasons?",
								"The headquarters of The International Olympic Committee is situated in ____",
								"The world's largest cricket stadium situated at _______",
								"Which of the following club has won the FIFA Club World Cup,2019?",
								"Archery is the national game of _____",
								"Who was the ICC Best Cricketer of the Year 2019?",
								"Who won the Women Single's title in the U.S. Opens Tennis Tournament, 2018?",
								"The terms Volley, Smash, Service are related to which among the following sports?",
								"Electra Gold Cup is associated with which sports?",
								"Which among the following sports have largest number of participants in teams of either side?",
								"For which of the following sports Maulana Abul Kalam Azad (MAKA) Trophy’ is given ?",
								"Who is the IOC Coordination Commission Tokyo 2020?",
								"Who is the President of International World Games Association?  ",
								"When was the name of National Boxing Association changed to World Boxing Association?.",
								"Who was the first international player to use a Kookaburra released carbon fibre-reinforced polymer support bat?",
								"Who won the Gold Medal in Pole Vaulting in women’s category in 2016 Rio Olympics?",
								"Who had established the World Series Cricket in 1970s?",
                                "Which Commonwealth Games were hosted in India?",
								"Which nation won the maximum number of medals in the 2018 ISSF World Shooting Championships?",
								"In which city was the finals of 2015 ICC World Cup played?",
								"Who is the coach of Saina Nehwal?",
								"Which of the following were part of the Panhellenic Games?",
								"Where were the first Asian Games held?",
								"Who hosted the Deaflympics in 2019?",
								"Which of the following nation was not a founding member of the Badminton World Federation?",
								"Where are the headquarters of International Gymnastics Federation?",
								"Where did the first Sudirman Cup tournament take place?",
								"Who is the President of International Correspondence Chess Federation?",
								"When was the first Men’s Freestyle Wrestling tournament conducted by the UWW?",
								"Where were the 2018 UCI Track Cycling World Championships held?",
								"Which athlete has won five gold medals in men’s long jump?",
								"Which team won the EPL without losing a single game in 2003-04 season, a feat which has never been repeated?",								           
								"Who had officially opened the Gold Coast 2018 games?",
								"Which organisation is responsible for the control of rules of the Football?",
								"Who is the only athlete in Olympic history to participate in 8 Winter Olympics?",
								"Who was W.G. Grace?",
								"In which Cricket World Cup edition, India won its first Cricket World Cup Champion title?"
								};
	String[][] options_org= 	{
								{"Pyeong Chang, South Korea","Vancouver, Canada","Sochi, Russia","Beijing, China"},
								{"Geoff Griffin, South Africa","Harbhajan Singh, India","Abdul Razzaq, Pakistan","Naseem Shah, Pakistan"},
								{"5","6","7","8"},
								{"Rohit Sharma","Virat Kohli","KL Rahul","MS Dhoni"},
								{"Vienna, Austria","Lausanne, Switzerland","Geneva, Switzerland","Madrid, Spain"},
								{"Kolkata","Manchester","Melbourne","Motera"},
								{"Barcelona","Real Madrid","Juventas","Liverpool"},
								{"Bhutan","Denmark","Sri Lanka","Switzerland"},
								{"Rohit Sharma, India","Ben Stokes, England","Pat Cummins, Australia","Virat Kohli"},
								{"Serena Williams","Anastasija Sevastova","Naomi Osaka","Elena Vesnia"},
								{"volleyball","lawn tennis","table tennis","badminton"},
								{"lawn tennis","table tennis","badminton","football"},
								{"rugby football","water polo","baseball","soccer"},
								{"inter school","inter state","inter university","none of the above"},
								{"Kirsty coventry","ban ki-moon","John Coates","Barry maister"},
								{"1958","1962","1969","1970"},
								{"Jose perruna Lopez","andrew parsons","Duane kale","Robert steadward"},
								{"virat kohli","kapell dev","chris Gayle","ricky Ponting"},
								{"katerina stefanidi","sandt Morris","eliza McCartney ","Jennifer Suhr"},
								{"Kerry packer","David Johnson","Allen hill","Alfred shaw"},
								{"2006","2002","2010","2014"},
								{"Sweden","Finland","United States","china"},
								{"Brisbane","Sydney","Melbourne","Auckland"},
								{"pullela gopichand","vrushali gummadi","tan Kim her","both a and c"},
								{"pythian games","nemean games","isthmian games","all of the above"},
								{"Jakarta","kathmandu","New Delhi","Islamabad"},
								{"russia","canada","italy","Sweden"},
								{"germany","france","England","Netherlands"},
								{"england","germany","Switzerland","france"},
								{"china","thailand ","Denmark","indonesia"},
								{"max zavanelli","Alan borwell","Eric ruch","anders elgesem"},
								{"1904","1965","1951","1970"},
								{"Poland","Netherlands ","Australia","germany"},
								{"sergey bubka","Stefan holm","Ivan Pedroso","Javier sotomayor "},					                                           
								{"arsenal","Chelsea","Liverpool","Man U "},
                                {"sally Pearson","queen Elizabeth 2","Karen Murphy","prince Charles"},
								{"FIFA","FIFA COUNCIL","Olympics council","IFAB"},
								{"Nathan Chen","sven kramer","noriaki kasai","wu dajing "},
								{"cricketer","footballer","golfer","tennis player"},
								{"9099","9109","9091","none of the above"},
								{"3rd","4th","5th","6th"}
								};
	char[] answers_org = 		{'D','D','B','C','B','D','D','A','B','C','B','B','A','C','C','A','B','D','A','A','C','D','C','A','D','C','C','A','C','D','C','C','B','C','A','D','D','C','A','A'};
	
	String questions[] = new String[40];
	String options[][] = new String[40][4];
	char answers[]=new char[40];
	int index=0;
	char answer;
	int correct;
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
		topic.setText("Sports");
		
		
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
		if(index>=10) {
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
		String cat="Sports";
		nam.result_display(result,cat);
	}
}