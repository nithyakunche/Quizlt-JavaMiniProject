import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Result implements ActionListener{
	
	static String usrname;
	int res;
	JFrame frame = new JFrame();
	JLabel results = new JLabel();
	JLabel number_right = new JLabel();
	JLabel quizit = new JLabel();
	JLabel printname = new JLabel();
	JButton retest = new JButton();
	JButton exiting = new JButton();
	JButton prev = new JButton();
	
	public static void main(String args[]) {
		
	}
	public void display(int result) {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1300,650);
		frame.getContentPane().setBackground(new Color(0,153,76));
		frame.setLayout(null);
		frame.setResizable(false);
		
		
		quizit.setBounds(0,0,1300,150);
		quizit.setForeground(Color.WHITE);
		quizit.setFont(new Font("SUKHUMVIT SET",Font.BOLD,100));
		quizit.setHorizontalAlignment(JTextField.CENTER);
		quizit.setText("QuizIt");
		
		
		results.setBounds(0,150,1300,100);
		results.setForeground(Color.WHITE);
		results.setFont(new Font("SUKHUMVIT SET",Font.BOLD,75));
		results.setHorizontalAlignment(JTextField.CENTER);
		results.setText("RESULTS!");
		
		
		printname.setBounds(0,300,1300,100);
		printname.setForeground(Color.WHITE);
		printname.setFont(new Font("SUKHUMVIT SET",Font.PLAIN,45));
		printname.setHorizontalAlignment(JTextField.CENTER);
		printname.setText("Congratulations, you scored:");
		
		
		number_right.setBounds(0,450,1300,100);
		number_right.setForeground(Color.WHITE);
		number_right.setFont(new Font("SUKHUMVIT SET",Font.BOLD,50));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setText("("+result+"/10)");
		
		
		retest.setBounds(100,550,300,50);
		retest.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		retest.setFocusable(false);
		retest.setForeground(Color.WHITE);
		retest.setText("Retry");
		retest.addActionListener((ActionListener) this);
		
		
		prev.setBounds(500,550,300,50);
		prev.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		prev.setFocusable(false);
		prev.setForeground(Color.WHITE);
		prev.setText("Previous Score");
		prev.addActionListener((ActionListener) this);
		

		exiting.setBounds(900,550,300,50);
		exiting.setFont(new Font("SUKHUMVIT SET",Font.BOLD,35));
		exiting.setFocusable(false);
		exiting.setForeground(Color.WHITE);
		exiting.setText("Exit");
		exiting.addActionListener((ActionListener) this);
		
		
		frame.add(prev);
		frame.add(retest);
		frame.add(exiting);
		frame.add(quizit);
		frame.add(printname);
		frame.add(number_right);
		frame.add(results);
		frame.setVisible(true);
		
	}
	public void naming(String username) {
		usrname= username;
	}
	
	 void record(int result, String category) {
		
		String query = "INSERT INTO Result values(?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Quizit","root","asdfghjkl;'");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, usrname);
			st.setString(2, category);
			st.setInt(3, result);
			@SuppressWarnings("unused")
			int count = st.executeUpdate();
			st.close();
			frame.dispose();
			con.close();
		}
		catch(Exception ex) {
			System.out.println("");
		
		}
		display(result);
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==retest) {
			@SuppressWarnings("unused")
			Choice ch = new Choice();
			frame.dispose();
		}
		if(e.getSource()==exiting) {
			System.exit(0);
			frame.setVisible(false);
			frame.dispose();
		}
		if(e.getSource()==prev) {
			@SuppressWarnings("unused")
			Prev_Score ps = new Prev_Score(usrname);
			frame.dispose();
		}
		
	}
}