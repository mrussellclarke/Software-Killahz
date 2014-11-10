import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.Font;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Student_View_SignIn {

	public JFrame frmSignIn;
	public JPasswordField pwdPassword;
	private JTextField textField;
	public String idNumber;
	public char[] password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_View_SignIn window = new Student_View_SignIn();
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
	public Student_View_SignIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignIn = new JFrame();
		frmSignIn.getContentPane().setBackground(new Color(255, 51, 51));
		frmSignIn.setFont(new Font("Arial", Font.PLAIN, 13));
		frmSignIn.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmSignIn.setTitle("Sign In");
		frmSignIn.setBounds(100, 100, 450, 300);
		frmSignIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignIn.getContentPane().setLayout(null);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setForeground(new Color(0, 0, 204));
		btnLogIn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				idNumber = textField.getText();
				password = pwdPassword.getPassword();
				Student_View_Home homeFrame = new Student_View_Home();
				homeFrame.frmHome.setVisible(true);
				frmSignIn.dispose();
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
		lblIdNumber.setForeground(new Color(0, 0, 204));
		lblIdNumber.setBounds(108, 93, 108, 16);
		frmSignIn.getContentPane().add(lblIdNumber);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(0, 0, 204));
		lblPassword.setBounds(108, 132, 89, 16);
		frmSignIn.getContentPane().add(lblPassword);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.setForeground(new Color(0, 0, 204));
		btnForgotPassword.setBounds(186, 166, 144, 29);
		frmSignIn.getContentPane().add(btnForgotPassword);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				frmSignIn.dispose();
			}
		});
		btnExit.setForeground(new Color(0, 0, 204));
		btnExit.setFont(new Font("Arial", Font.PLAIN, 13));
		btnExit.setBounds(327, 243, 117, 29);
		frmSignIn.getContentPane().add(btnExit);
		frmSignIn.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmSignIn.getContentPane(), pwdPassword, btnLogIn}));
		
	}
}
