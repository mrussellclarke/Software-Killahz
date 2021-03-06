import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import java.awt.Color;


public class Semester_Menu extends Student_View_Home {

	public JFrame frmSemesterMenu;
	public String ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semester_Menu window = new Semester_Menu();
					window.frmSemesterMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Semester_Menu() {
		initialize();
	}
	
	public Semester_Menu(String idNumber) {
		ID = idNumber;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSemesterMenu = new JFrame();
		frmSemesterMenu.setResizable(false);
		frmSemesterMenu.getContentPane().setBackground(new Color(0, 0, 102));
		frmSemesterMenu.setTitle("Semester Menu");
		frmSemesterMenu.setBounds(100, 100, 450, 300);
		frmSemesterMenu.setLocationRelativeTo(null);
		frmSemesterMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSemesterMenu.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 102));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Spring 2015", "Fall 2014 (View Only)", "Spring 2014 (View Only)", "Fall 2013 (View Only)", "Spring 2013 (View Only)", "Fall 2012 (View Only)"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		comboBox.setBounds(90, 108, 265, 27);
		frmSemesterMenu.getContentPane().add(comboBox);
		
		JButton btnOkButton = new JButton("OK");
		btnOkButton.setForeground(new Color(0, 0, 102));
		btnOkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String button = Student_View_Home.getButton();
				String temp = "Housing Assignment";
				String temp2 = "View RSVP Points";
				String temp3 = "Submit Org Docs";
				String temp4 = "Check In";
				if (button.equals(temp)) {
					Student_View_Housing_Assignment housingAssignmentFrame = new Student_View_Housing_Assignment(ID);
					housingAssignmentFrame.frmHousingAssignment.setVisible(true);
					frmSemesterMenu.dispose();
				}
				if (button.equals(temp2)) {
					Student_View_RSVP_Points rsvpPointsFrame = new Student_View_RSVP_Points(ID);
					rsvpPointsFrame.frmRsvpPoints.setVisible(true);
					frmSemesterMenu.dispose();
				}
				if (button.equals(temp3)) {
					Student_View_Submit_Org_Docs submitOrgDocsFrame = new Student_View_Submit_Org_Docs(ID);
					submitOrgDocsFrame.frmSubmitOrgDocs.setVisible(true);
					frmSemesterMenu.dispose();
				}
				if (button.equals(temp4)) {
					JOptionPane.showMessageDialog(frmSemesterMenu, "You have successfully checked in.",
						    "Check In", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnOkButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnOkButton.setBounds(238, 146, 117, 29);
		frmSemesterMenu.getContentPane().add(btnOkButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_View_Home homeFrame = new Student_View_Home(ID);
				homeFrame.frmHome.setVisible(true);
				frmSemesterMenu.dispose();
			}
		});
		btnBack.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBack.setForeground(new Color(0, 0, 102));
		btnBack.setBounds(100, 146, 117, 29);
		frmSemesterMenu.getContentPane().add(btnBack);
	}
}
