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

class World_Quiz implements ActionListener{
	
	String[] questions_org = 	{
							"Which country has launced world's first vaccine against Corona Virus.",
							"As per new classification of the World Bank(2020), Indian economy",
							"Which nation has planned to build 5-8 nuclear reactors per year from 2020?",
							"The 2021 Commonwealth Youth Games have been postponed to which year?",
							"Which city witnessed a horrific toxic gas tragedy on May 7, 2020?",
							"Which country recently became the first in South Asia to introduce e-passports?",
							"Which of the following country host the 2019 G7 summit?",
							"Which basketball icon died in a helicopter crash on 26th January 2020",
							"Khalid bin Khalifa has been recently appointed as the Prime Minister of_____",
							"Which country has announced to distribute 150 million Covid-19 test kits?",
						    "Umaro Cissoko Embalo was recently elected as the President of which country?", 
							"A devastating earthquake hit Puerto Rico recently. Which is the capital city of Puerto-Rico?", 
							"The United States recently signed the first phase of historic trade deal with which country?", 
							"Katerina Sakellaropoulou was recently elected as the first female President of which country?", 
							"Which country recently became the first in South Asia to introduce e- passports?", 
							"The International Summit on Women in STEM– 'Visualizing the Future: New Skylines', was recently held in which city?", 
							"When is the International Customs Day (ICD) celebrated annually across the world?", 
							"As per the recent WHO report, what is the investment required for the next decade, to save 7 million lives globally from cancer?", 
							"Britain’s Prince Charles has launched a new Children’s protection fund for which Asian country?", 
							"The storm ‘Ciara’ recently hit several countries of which continent?" ,
                            "Which international organisation released $15 million from its Central Emergency Response Fund, to battle outbreak of COVID-19?", 
							"Which country became the first in the world to make public transport free?", 
							"Denys Shmygal, who was in news recently, has been elected as the Prime Minister of which country?", 
							"India recently joined the Indian Ocean Commission (IOC) as observer. IOC comprises of how many member-nations?", 
							"India provided a grant of nearly INR 68 million to which neighbouring country for construction of school buildings?", 
							"Masatsugu Asakawa is the President of which international financial institution, which has also assured $2.2 billion assistance to India?", 
							"‘Which country has recently announced that it would stop the funding provided to the World Health Organisation (WHO)?", 
							"In the National assembly elections held amid the Covid-19 pandemic, who has been re-elected as the President of South Korea?", 
							"The headquarters of Organisation of Islamic Cooperation (OIC) is located in which city?", 
							"‘Leading journalism and research organisation Poynter Institute’s International Fact-Checking Network (IFCN) launched its chatbot on which social media handle?" ,
							"Which global association has asked the social media platforms to provide monthly report on their actions to combat fake news?", 
							"‘Which country warned against the renaming of the Senkaku islands by Japan?", 
							"Which financial institution has recently joined the Central Banks and Supervisors Network for Greening the Financial System (NGFS)?", 
							"Which country has passed the Expat quota bill, which could force about 8 lakh Indians to leave, when enacted?", 
							"Which country has launched a nation-wide campaign to clean up websites, that target users below the age of 18?",								           
							"Which country has banned free internet services for accessing social media?", 
							"What is the name of the global carbon-neutral consortium formed by major companies including Microsoft, Nike and Mercedes-Benz?", 
							"A France-based refinery has spilled toxic chemicals over 15 acres in which sea?", 
							"The Consumer regulator of Australia has accused which technology company of privacy breaches?", 
							"Which country has approved a law that gives more power to regulate social media content?" 
							};
	String[][] options_org = 	{
							{"China","USA","Russia","India"},
							{"Low Income Economy","Lower-Middle Income Ecomony","Upper-Middle Income Economy","High-Income Economy"},
							{"Russia","China","Iran","US"},
							{"2022","2023","2034","2025"},
							{"Patna","Vishakapatanam","Jamshedpur","Bhubaneshwar"},
							{"Bangladesh","Thailand","Cambodia","Vietnam"},
							{"Germany","UK","France","Italy"},
							{"Kobe Bryant","LeBron James","Anthony Davis","Jr Smith"},
							{"Qatar","Kuwait ","Bahrain","Oman"},
							{"UK","USA","India","France"},
							{"Gambia","senegal","guinea-bissau","guinea"},  
							{"Santo Domingo","san Juan","Kingston","Havana"},  
							{"India","china","russia","Switzerland"},  
							{"greece","serbia","turkey","Hungary"},  
							{"Bangladesh","thailand","cambodia","vietnam"},  
							{"Mumbai","New Delhi","Hyderabad","Kolkata "},  
							{"January 24","January 25","January 26","January 27"},  
							{"15 billion$","25 billion$","50 billion$","75 billion$"},  
							{"Sri Lanka","india","Bangladesh","nepal"},  
							{"asia","Europe","Australia","North America"},  
							{"WHO","world bank","United Nations","international monetary fund"},  
							{"thailand","Luxembourg","canada","brazil"},  
							{"austria","Hungary","ukraine","Romania"},  
							{"five","seven","ten","twelve"},  
							{"sri lanka","nepal","Bhutan","Myanmar"},  
							{"world economic forum","asian development bank","world bank","BRICS bank"},  
							{"china","Russia","United States","Italy"},  
							{"moon jae-in","Kim Jae ryong","Kim jong-un","nguyen phu trong"},  
							{"muscat","jeddah","riyadh","Dubai"},  
							{"telegram","WhatsApp","twitter","facebook"},
							{"United Nations","European Union","BRICS","G-20"},  
							{"South Korea","North Korea","china","Taiwan"},  
							{"BRICS bank","asian development bank","European central bank","BRICS bank"},  
							{"UAE","Kuwait","Oman","Bahrain"}, 
							{"india","china","Bangladesh","nepal "},  
                            {"china","Bangladesh","Pakistan","North Korea"},  
							{"global carbon-neutral","transform to net zero","free from carbon","zero carbon world"},  
							{"Mediterranean Sea","Red Sea","Pacific Ocean","Atlantic Ocean "},  
							{"facebook","google","microsoft","amazon"},  
							{"china","North Korea","turkey","Russia "} 
							};
	char[] answers_org = 		{'C','B','B','B','B','A','C','A','A','B','C','B','B','A','A','B','C','B','B','B','C','C','C','A','B','B','C','A','B','B','B','C','B','B','B','B','B','A','B','C' };
	
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
		topic.setText("World Affairs");
		
		
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
		String cat="World Affiars";
		nam.result_display(result,cat);
	}
}
