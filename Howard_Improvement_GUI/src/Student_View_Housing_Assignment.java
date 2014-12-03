import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;


public class Student_View_Housing_Assignment {

	public JFrame frmHousingAssignment;
	private JTextField txtAssignment;
	public String ID;

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
	
	public Student_View_Housing_Assignment(String idNumber) {
		ID = idNumber;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHousingAssignment = new JFrame();
		frmHousingAssignment.setTitle("Housing Assignment");
		frmHousingAssignment.setResizable(false);
		frmHousingAssignment.setLocationRelativeTo(null);
		frmHousingAssignment.getContentPane().setBackground(new Color(204, 204, 204));
		frmHousingAssignment.getContentPane().setLayout(null);
		
		txtAssignment = new JTextField();
		txtAssignment.setForeground(new Color(0, 0, 102));
		txtAssignment.setEditable(false);
		txtAssignment.setText("You have not selected an assignment for this semester.");
		txtAssignment.setFont(new Font("Arial", Font.PLAIN, 13));
		txtAssignment.setBounds(32, 121, 382, 28);
		frmHousingAssignment.getContentPane().add(txtAssignment);
		txtAssignment.setColumns(10);
		
		JLabel lblAssignment = new JLabel("Assignment");
		lblAssignment.setForeground(new Color(0, 0, 102));
		lblAssignment.setFont(new Font("Arial", Font.BOLD, 13));
		lblAssignment.setBounds(32, 93, 110, 16);
		frmHousingAssignment.getContentPane().add(lblAssignment);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_View_Home homeFrame = new Student_View_Home(ID);
				homeFrame.frmHome.setVisible(true);
				frmHousingAssignment.dispose();
			}
		});
		btnBack.setForeground(new Color(0, 0, 102));
		btnBack.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBack.setBounds(42, 161, 160, 29);
		frmHousingAssignment.getContentPane().add(btnBack);
		
		JButton btnSelectAssignment = new JButton("Select Assignment");
		btnSelectAssignment.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_Temp student = new Student_Temp(ID);
				
				Student_View_Select_Assignment selectAssignmentFrame = new Student_View_Select_Assignment(ID);
				selectAssignmentFrame.frmSelectAssignment.setVisible(true);
				frmHousingAssignment.dispose();
				
				/*if (student.valid == true) {
					Student_View_Select_Assignment selectAssignmentFrame = new Student_View_Select_Assignment(ID);
					selectAssignmentFrame.frmSelectAssignment.setVisible(true);
					frmHousingAssignment.dispose();
				}
				else {
					JOptionPane.showMessageDialog(frmHousingAssignment, "You can't select an assignment, you are not valid.",
						    "Not Validated", JOptionPane.PLAIN_MESSAGE);
				}*/
			}
		});
		btnSelectAssignment.setForeground(new Color(0, 0, 102));
		btnSelectAssignment.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSelectAssignment.setBounds(239, 161, 160, 29);
		frmHousingAssignment.getContentPane().add(btnSelectAssignment);
		frmHousingAssignment.setBounds(100, 100, 450, 300);
		frmHousingAssignment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
