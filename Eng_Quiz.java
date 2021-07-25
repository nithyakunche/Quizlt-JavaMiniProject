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

class Eng_Quiz implements ActionListener{
		
		String[] questions_org = 	{
				"When the Principal entered the class, a student_____ on the blackboard.",
				"She ______ TV when her husband came.",
				"Which is the correct spelled word?",
				"They listened to him ____.",
				"Select the proper prefix for the word: Editor",
				"He has a ___ for writing.",
				"The Earth moves around the Sun.",
				"Rain falls from the cloud.",
				"Select the odd one out.",
				"Select the odd one out.",
				"Find the correctly spelt word.",
				"Antonym of foremost:",
				"Find the error: Ram was / senior to / Sam in college.",
				"One who abandons his religious faith is called:",
				"Even is it rains I shall come means: ",
				"Select the pair which has the same relationship: diva:opera",
				"Select the pair which has the same relationship: light:blind",
				"Catching the earlier train will give us the……..to do some shopping",
				"I saw a …….. of cows in the field",
				"The grapes are now………enough to be picked.",
				"If I had money, I ____ it now.",
				"I enjoy ____ tennis.",
				"Katherine made her children ____ chores on Sunday.",
				"Choose the word that is most nearly similar in meaning to the word: beseech",
				"Choose the word most nearly opposite to the word Tragic ”",
				"Choose the word most nearly opposite to the word Attain",
				"Select the pair which has the same relationship: bird:fly::snake: ?",
				"Select the pair which has the same relationship: milk:emulsion::butter: ?",
				"Find the error: by this time/ next year / I had completed/ my phd",
				"Select the correctly spelled word",
				"Select the most effective word from the options given below to fill in the blank and complete the sentence meaningfully. (Collective nouns) A  _____ of eggs.",
				"Pick the word/phrase which is most nearly opposite in meaning to OBSCURE",
				"Choose the appropriate meaning of the idiom: Make up one's mind.",
				"Pick the word/phrase which is most nearly opposite in meaning to ASPIRATION",
				"The diagram I am referring __ is given ___ page twenty.",
				"Choose the word most nearly opposite to the  word BENEVOLENCE",
				"Select the pair which has the same relationship: soldiers:army ?",
				"Kate's mother had firm ____  in her. ?",
				"Birds of feather ______",
				"Choose the pair of words which have a relationship similar to that between the given pair of Management: CEO"
				};


		String[][] options_org = 	{
				{"wrote","was writing","writes","is writing"},
				{"watch","was watching","is watching","watched"},
				{"Reannaisance","Renaissance","Rennaissance","Renaissance"},
				{"spellbinded","spellbind","spellbinding","spellbound"},
				{"bye","sub","joint","bi"},
				{"flare","flairs","flair","fare"},
				{"simple past","past perfect","simple present","past future perfect"},
				{"past continuous","future continuous","simple present","present continous"},
				{"hardware","keyboard","ink","monitor"},
				{"actor","director","camera man","micro oven"},
				{"Adulation","Adlation","Aduletion","Addulation"},
				{"Hindmost","Unimportant","Disposed","Mature"},
				{"Ram was","Senior to","Sam in college","No error"},
				{"Apostate","Prostate","Profane","Agnostic"},
				{"if I come it will not rain","if it rains I shall not come","I will certainly come whether it rains or not","whenever there is rain I shall come"},
				{"producer:theatre","director:drama","conductor:bus","thespian play"},
				{"speech:dumb","language:deaf","tongue:sound","voice:vibration"},
				{"chance","luck","possibility","occasion"},
				{"group","herd","swarm","flock"},
				{"ready","mature","ripe","advanced"},
				{"will purchase","would purchase","would have purchased","have purchased"},
				{"to play","plays","playing","to playing"},
				{"make some","take some","do some","does some"},
				{"starving","implore","weak","highly skilled"},
				{"boring","mysterious","comic","incredulous"},
				{"crave","lose","harbor","credit"},
				{"hole","crawl","stroll","clatter"},
				{"aerosol","suspension","sol","gel"},
				{"by this time","next year","I had completed","my phd"},
				{"dilogue ","dialouge ","dilouge ","dialogue"},
				{"collection","clutch","quiver","brood"},
				{"confusing","straight forward","vague","concealed"},
				{"to be prepared","to make someone happy","make a decision ","to criticize someone"},
				{"dislike","eagerness","passion","objective"},
				{"to, on","to, at","at, on","at, in"},
				{"hate","generosity","bifurcate","abandoned"},
				{"ships:crew","elephants:herd","sailors:fleet","keys:bundle"},
				{"believed","believing","belief","believes"},
				{"fly together","flock together","dance together","tweet together"},
				{"journalism: managing director","office:clerk","hospital:paramedic ","none of the above"}
								};
		char[] answers_org = {'B','B','B','D','B','C','C','C','C','D','A','B','D','A','C','D','A','A','B','C','B','C','C','B','C','B','B','D','C','D','B','B','C','A','B','A','B','C','B','A'};
		
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
		JLabel topic = new JLabel();
		JButton buttonA = new JButton();
		JButton buttonB = new JButton();
		JButton buttonC = new JButton();
		JButton buttonD = new JButton();
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
			topic.setText("English");
			
			
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
			String cat ="English";
			nam.result_display(result,cat);
		}
}