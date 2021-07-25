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

class Sci_Quiz implements ActionListener{
	
	String[] questions_org = 	{
							"Which technology company launched a new file-sharing feature ‘Nearby Share’?",
							"Which space mission of India has completed one full year in the lunar orbit?",
							"Which organisation has developed highly purified Antisera, to treat Covid-19?",
							"What is ‘PARAM Siddhi – AI’, that was seen in news recently?",
							"Which country in the world has maximum number of robots working?",
							"Which technology company has launched a campaign named ‘Make Small Strong’?",
							"What does SSLV stand for?",
							"Which social media giant launched a new tool Business Suite to help businesses?",
							"How many astronauts have been selected for India’s first human space mission?",
							"What is ‘Covid Kavach Elisa’, that was seen in news recently?",
							"The Covid-19 RT-PCR test kits of which Indian company has received validation from Drug Controller of India?",
							"Which technology company has committed to pay USD 1 billion for next 3 years to the publishers for their content?",
							"The custom-made aircraft Air India One is manufactured by which company?",
							"What is the name of the paper strip test for SARS-CoV-2 diagnosis to be rolled out by the Ministry of Health?",
							"Which space craft of NASA would make an attempt to collect samples from asteroid Bennu?",
							"Mars Atmosphere and Volatile Evolution (MAVEN) is the Mars orbiter mission of which country?",
							"Which space agency has confirmed the presence of water on the surface of moon?.",
							"Which Indian company has launched the world’s first CRISPR Cas-9 based diagnostic tool ‘CHECK’?",
							"Which country has approved the first self-testing kit to detect coronavirus?",
							"Which Technology major has unveiled its Rich Communication Services (RCS) messaging globally?",
                            "Which satellite would be launched on January 17, 2020 as the first satellite of the year 2020?",
							"Which state has recently declared 2020 as the year of Artificial Intelligence (AI) and has signed MoUs with tech firms for AI research?",
							"Scientists recently discovered dwarf galaxies with massive black holes using Very Large Array (VLA) observatory. Where is the observatory situated?",
							"What is a Shopper, which was sometimes seen in news recently ?",
							"Which global tele-communication company’s arm has recently launched a new privacy-focused search engine called ‘OneSearch’?",
							"Which global firm has developed a new Artificial Intelligence (AI) model to protect an endangered whale species?",
							"‘Whole Genome Sequencing (WGS)’, which was seen in news recently, is associated with research in which field?",
							"Which smart-phone maker launched the first 5G-enabled smartphone of India?",
							"Which Indian city has deployed drones to sanitize its region against the coronavirus outbreak by sprinkling chemicals?",
							"‘Nearby Spot’ is an initiative of which technological firm, to provide information on locating local stores that sells essential things?",
							"As per the recent study of the National Institute of Biomedical Genomics, the novel coronavirus has mutated into how many different types?",
							"‘Read along’, that was in news recently, is an application of which multi-national company?",
							"Which famous technology company has launched a short music videos application called ‘Collab’?",
							"Which is the first private space company to send astronauts into space?",
							"Which country’s super computer has become the fastest in the world?",								           
							"What is the name of the new short-video platform launched by Facebook, within its Instagram app?",
							"Which Technology company has introduced a new educational product called ‘Assignments’?",
							"Which company would be organising a virtual event named ‘One More Thing’?",
							"Researchers of IIT Kharagpur have developed food packaging material using which material?",
							"Which Technology major has unveiled its Rich Communication Services (RCS) messaging globally?"
							};
	String[][] options_org = 	{
							{"Microsoft","Google","Facebook","Apple"},
							{"Chandrayaan 1","Chandrayaan 2","Lunar Mission 1","Lunar Mission 2"},
							{"ICMR","AIIMS","JIPMER","CSIR"},
							{"Supercomputer","Robot","Drone","Missile"},
							{"Japan","India","America","China"},
							{"Twitter","Facebook","Google","Microsoft"},
							{"Space Satellite Launch Vehicle","Speed Satellite Launch Vehicle","Small Satellite Launch Vehicle","Solar Satellite Launch Vehicle"},
							{"Twitter","Facebook","Google","Microsoft"},
							{"2","3","4","5"},
							{"Personal Protective Equipment(PPE)","Mask","Testing Kit","Disinfectant"},
							{"my lab","swagene","aquitylabs","Pfizer"},
							{"facebook","google","amazon","apple"},
							{"drdo","Boeing","air bus","Dornier "},
							{"sana","feluda","magna","megha"},
							{"challenger","mars rover","osiris rex","navigator"},
							{"india","United States","united arab emirates","Russia"},
							{"isro","European space agency","nasa","cnsa "},
							{"Infosys","tata medical and diagnostics","biocon","wipro"},
							{"china","india","United States","Russia "},
							{"apple","google","xiaomi","Huawei "},
							{"gsat30","gsat29","gsat17","gsat11"},
							{"Andhra Pradesh","Telangana","Odisha","assam"},
							{"Japan","china","usa","russia"},
							{"e commerce web","malware","robot","electric vehicle"},
							{"at and t","Verizon","Vodafone","china mobile"},
							{"amazon","Microsoft","google","facebook"},
							{"agriculture","genetics","environment","energy"},
							{"xiaomi","realme","oppo","vivo"},
							{"mumbai","cochin","Indore","Nagpur "},
							{"facebook","google","amazon","apple"},
							{"four","six","ten","fifteen"},
							{"microsoft","amazon","google","facebook"},
							{"amazon","facebook","microsoft","google"},
							{"blue origin","Tesla","spacex","orbital"},
							{"United States","Japan","china","Germany "},
                            {"go video","reels","video ius","live"},
							{"Microsoft","google","amazon","apple"},
							{"ibm","dell","microsoft","apple "},
							{"plastic","nano composite","cucumber peels","banana peels"},
							{"apple","google","xiaomi","Huawei "}
							};
	char[] answers_org = 		{'B','B','A','A','A','C','C','C','C','C','A','B','B','B','C','B','C','B','C','B','A','B','C','B','B','C','B','B','C','B','C','C','B','C','B','B','B','D','C','B'};

	
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
		topic.setText("Science & Technology");
		
		
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
		String cat="Science and Technology";
		nam.result_display(result,cat);
	}
}