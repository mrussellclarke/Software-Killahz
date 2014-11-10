import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;


public class Student_View_Housing_Assignment {

	public JFrame frmHousingAssignment;
	private JTextField txtAssignment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_View_Housing_Assignment window = new Student_View_Housing_Assignment();
					window.frmHousingAssignment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_View_Housing_Assignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHousingAssignment = new JFrame();
		frmHousingAssignment.setTitle("Housing Assignment");
		frmHousingAssignment.setResizable(false);
		frmHousingAssignment.getContentPane().setBackground(new Color(255, 51, 51));
		frmHousingAssignment.getContentPane().setLayout(null);
		
		txtAssignment = new JTextField();
		txtAssignment.setForeground(new Color(0, 0, 204));
		txtAssignment.setEditable(false);
		txtAssignment.setText("You have not selected an assignment for this semester.");
		txtAssignment.setFont(new Font("Arial", Font.PLAIN, 13));
		txtAssignment.setBounds(32, 121, 382, 28);
		frmHousingAssignment.getContentPane().add(txtAssignment);
		txtAssignment.setColumns(10);
		
		JLabel lblAssignment = new JLabel("Assignment");
		lblAssignment.setForeground(new Color(0, 0, 204));
		lblAssignment.setFont(new Font("Arial", Font.BOLD, 13));
		lblAssignment.setBounds(32, 93, 110, 16);
		frmHousingAssignment.getContentPane().add(lblAssignment);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_View_Home homeFrame = new Student_View_Home();
				homeFrame.frmHome.setVisible(true);
				frmHousingAssignment.dispose();
			}
		});
		btnBack.setForeground(new Color(0, 0, 204));
		btnBack.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBack.setBounds(42, 161, 160, 29);
		frmHousingAssignment.getContentPane().add(btnBack);
		
		JButton btnSelectAssignment = new JButton("Select Assignment");
		btnSelectAssignment.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//Student_View_Select_Assignment selectAssignmentFrame = new Student_View_Select_Assignment();
				//selectAssignmentFrame.frmSelectAssignment.setVisible(true);
				//frmHousingAssignment.dispose();
			}
		});
		btnSelectAssignment.setForeground(new Color(0, 0, 204));
		btnSelectAssignment.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSelectAssignment.setBounds(239, 161, 160, 29);
		frmHousingAssignment.getContentPane().add(btnSelectAssignment);
		frmHousingAssignment.setBounds(100, 100, 450, 300);
		frmHousingAssignment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
