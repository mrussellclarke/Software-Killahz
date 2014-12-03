import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;


public class SignIn {

	public JFrame frmSignIn;
	public JPasswordField pwdPassword;
	private JTextField textField;
	public String idNumber;
	public char[] password;
	public String name;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		DataConnector.main(args);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn window = new SignIn();
					window.frmSignIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SignIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignIn = new JFrame();
		frmSignIn.getContentPane().setBackground(new Color(0, 0, 102));
		frmSignIn.setFont(new Font("Arial", Font.PLAIN, 13));
		frmSignIn.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmSignIn.setTitle("Sign In");
		frmSignIn.setBounds(100, 100, 450, 300);
		frmSignIn.setLocationRelativeTo(null);
		frmSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignIn.getContentPane().setLayout(null);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(new Color(0, 0, 102));
		btnLogIn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				idNumber = textField.getText();
				password = pwdPassword.getPassword();
				String tempString = new String(password);
				boolean logIn = false;
				try {
					logIn = DataConnector.validateLogIn(idNumber, tempString);
					if (logIn == true) {
						name = DataConnector.getName(idNumber);
						Student_View_Home homeFrame = new Student_View_Home(idNumber);
						homeFrame.frmHome.setVisible(true);
						frmSignIn.dispose();
					}
					else {
						JOptionPane.showMessageDialog(frmSignIn, "Your credentials are not in the database.",
							    "Incorrect ID or Password.", JOptionPane.PLAIN_MESSAGE);
					}
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidKeySpecException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLogIn.setFont(new Font("Arial", Font.PLAIN, 13));
		btnLogIn.setBounds(118, 167, 74, 29);
		frmSignIn.getContentPane().add(btnLogIn);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Arial", Font.PLAIN, 13));
		pwdPassword.setBounds(186, 127, 154, 28);
		frmSignIn.getContentPane().add(pwdPassword);
		
		textField = new JTextField();
		textField.setBounds(186, 87, 154, 28);
		frmSignIn.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIdNumber = new JLabel("ID Number:");
		lblIdNumber.setForeground(new Color(255, 255, 255));
		lblIdNumber.setBounds(108, 93, 108, 16);
		frmSignIn.getContentPane().add(lblIdNumber);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(108, 132, 89, 16);
		frmSignIn.getContentPane().add(lblPassword);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setForeground(new Color(0, 0, 102));
		btnForgotPassword.setBounds(186, 166, 144, 29);
		frmSignIn.getContentPane().add(btnForgotPassword);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				frmSignIn.dispose();
			}
		});
		btnExit.setForeground(new Color(0, 0, 102));
		btnExit.setFont(new Font("Arial", Font.PLAIN, 13));
		btnExit.setBounds(327, 243, 117, 29);
		frmSignIn.getContentPane().add(btnExit);
		frmSignIn.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSignIn.getContentPane(), pwdPassword, btnLogIn}));
		
	}
}
