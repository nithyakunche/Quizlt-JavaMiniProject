import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class New_Account implements ActionListener{
	JFrame frame = new JFrame("QuizIt");
	JButton button = new JButton();
	JTextField textfield = new JTextField();
	JLabel quizit = new JLabel();
	JLabel entername = new JLabel();
	JLabel password = new JLabel();
	JPasswordField pass = new JPasswordField();
	String username , passwd;
	
	public New_Account() {
		
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
		
		
		entername.setBounds(400,300,200,50);
		entername.setForeground(Color.WHITE);
		entername.setFont(new Font("SUKHUMVIT SET",Font.BOLD,25));
		entername.setText("Enter Name");
		entername.setHorizontalAlignment(JTextField.CENTER);
		

		textfield.setBounds(700,300,200,50);
		textfield.setForeground(new Color(25,25,0));
		textfield.setFont(new Font("SUKHUMVIT SET",Font.BOLD,25));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setEditable(true);
		
		
		password.setBounds(400,375,200,50);
		password.setForeground(Color.WHITE);
		password.setFont(new Font("SUKHUMVIT SET",Font.BOLD,25));
		password.setText("Password");
		password.setHorizontalAlignment(JTextField.CENTER);
		
		pass.setBounds(700, 375, 200, 50);
		pass.setForeground(new Color(25,25,0));
		pass.setFont(new Font("SUKHUMVIT SET",Font.BOLD,25));
		pass.setBorder(BorderFactory.createBevelBorder(1));
		
		
		button.setBounds(700,500,200,50);
		button.setFont(new Font("SUKHUMVIT SET",Font.BOLD,25));
		button.setFocusable(false);
		button.setForeground(Color.WHITE);
		button.setText("Create Account");
		button.addActionListener((ActionListener) this);

		
		frame.add(textfield);
		frame.add(password);
		frame.add(pass);
		frame.add(quizit);
		frame.add(entername);
		frame.add(button);
		frame.setVisible(true);
	}
	
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e){
		username = textfield.getText();
		passwd= pass.getText().toString();
		String query = "INSERT INTO Quiz values(?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Quizit","root","asdfghjkl;'");
			Statement st1 = con.createStatement();
			ResultSet rs1 = st1.executeQuery("Select * From Quiz where Username='"+username+"'");
			if(rs1.next()) {
				@SuppressWarnings("unused")
				Login l = new Login();
				JOptionPane.showMessageDialog(null, "User already exists!");
			}
			else {
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, username);
				st.setString(2, passwd);
				@SuppressWarnings("unused")
				int count =st.executeUpdate();
				st.close();
				frame.dispose();
				returning();
			}
			st1.close();
			con.close();
		}
		catch(Exception ex) {
			System.out.println("");
		
		}
		
		
	}
	
	public void returning() {
		@SuppressWarnings("unused")
		Login l = new Login();
	}

}