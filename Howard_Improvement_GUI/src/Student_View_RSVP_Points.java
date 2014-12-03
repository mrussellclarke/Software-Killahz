import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JRadioButton;

import javax.swing.JButton;


public class Student_View_RSVP_Points {

	public JFrame frmRsvpPoints;
	public String ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_View_RSVP_Points window = new Student_View_RSVP_Points();
					window.frmRsvpPoints.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_View_RSVP_Points() {
		initialize();
	}
	
	public Student_View_RSVP_Points(String idNumber) {
		ID = idNumber;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRsvpPoints = new JFrame();
		frmRsvpPoints.setResizable(false);
		frmRsvpPoints.getContentPane().setBackground(new Color(204, 204, 204));
		frmRsvpPoints.setTitle("View RSVP Points");
		frmRsvpPoints.setBounds(400, 400, 650, 400);
		frmRsvpPoints.setLocationRelativeTo(null);
		frmRsvpPoints.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmRsvpPoints.getContentPane().setLayout(null);
		
		int counter = 0;
		
		JPanel panel = new JPanel();
		panel.setBounds(445, 22, 199, 315);
		frmRsvpPoints.getContentPane().add(panel);
		
		JLabel lblGpa = new JLabel("GPA");
		lblGpa.setBounds(6, 5, 187, 16);
		lblGpa.setForeground(new Color(0, 0, 102));
		lblGpa.setHorizontalAlignment(SwingConstants.CENTER);
		lblGpa.setFont(new Font("Arial", Font.BOLD, 13));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("3.80 - 4.00 (20 pts)");
		rdbtnNewRadioButton.setEnabled(false);
		rdbtnNewRadioButton.setBounds(6, 27, 142, 23);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("3.50 - 3.79 (18 pts)");
		rdbtnNewRadioButton_1.setSelected(true);
		counter+=18;
		rdbtnNewRadioButton_1.setBounds(6, 56, 142, 23);
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3.20 - 3.49 (16 pts)");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setBounds(6, 85, 142, 23);
		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_2.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("3.00 - 3.19 (14 pts)");
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_3.setBounds(6, 114, 142, 23);
		rdbtnNewRadioButton_3.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_3.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("2.80 - 2.99 (12 pts)");
		rdbtnNewRadioButton_4.setEnabled(false);
		rdbtnNewRadioButton_4.setBounds(6, 143, 142, 23);
		rdbtnNewRadioButton_4.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_4.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("2.60 - 2.79 (10 pts)");
		rdbtnNewRadioButton_5.setEnabled(false);
		rdbtnNewRadioButton_5.setBounds(6, 172, 142, 23);
		rdbtnNewRadioButton_5.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_5.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("2.40 - 2.59 (8 pts)");
		rdbtnNewRadioButton_6.setEnabled(false);
		rdbtnNewRadioButton_6.setBounds(6, 201, 135, 23);
		rdbtnNewRadioButton_6.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_6.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("2.20 - 2.39 (6 pts)");
		rdbtnNewRadioButton_7.setEnabled(false);
		rdbtnNewRadioButton_7.setBounds(6, 230, 135, 23);
		rdbtnNewRadioButton_7.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_7.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("2.00 - 2.19 (4 pts)");
		rdbtnNewRadioButton_8.setEnabled(false);
		rdbtnNewRadioButton_8.setBounds(6, 259, 135, 23);
		rdbtnNewRadioButton_8.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_8.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("0.00 - 1.99 (2 pts)");
		rdbtnNewRadioButton_9.setEnabled(false);
		rdbtnNewRadioButton_9.setBounds(6, 288, 187, 23);
		rdbtnNewRadioButton_9.setToolTipText("");
		rdbtnNewRadioButton_9.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_9.setFont(new Font("Arial", Font.PLAIN, 13));
		panel.setLayout(null);
		panel.add(lblGpa);
		panel.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_2);
		panel.add(rdbtnNewRadioButton_3);
		panel.add(rdbtnNewRadioButton_4);
		panel.add(rdbtnNewRadioButton_5);
		panel.add(rdbtnNewRadioButton_6);
		panel.add(rdbtnNewRadioButton_7);
		panel.add(rdbtnNewRadioButton_8);
		panel.add(rdbtnNewRadioButton_9);
		
		ButtonGroup gpaGroup = new ButtonGroup();
		gpaGroup.add(rdbtnNewRadioButton);
		gpaGroup.add(rdbtnNewRadioButton_1);
		gpaGroup.add(rdbtnNewRadioButton_2);
		gpaGroup.add(rdbtnNewRadioButton_3);
		gpaGroup.add(rdbtnNewRadioButton_4);
		gpaGroup.add(rdbtnNewRadioButton_5);
		gpaGroup.add(rdbtnNewRadioButton_6);
		gpaGroup.add(rdbtnNewRadioButton_7);
		gpaGroup.add(rdbtnNewRadioButton_8);
		gpaGroup.add(rdbtnNewRadioButton_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 170, 427, 167);
		frmRsvpPoints.getContentPane().add(panel_1);
		
		JLabel lblClassification = new JLabel("Classification (Credit Hours)");
		lblClassification.setBounds(6, 6, 415, 16);
		lblClassification.setForeground(new Color(0, 0, 102));
		lblClassification.setHorizontalAlignment(SwingConstants.CENTER);
		lblClassification.setFont(new Font("Arial", Font.BOLD, 13));
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Freshmen (0 - 29) (10 pts)");
		rdbtnNewRadioButton_10.setEnabled(false);
		rdbtnNewRadioButton_10.setBounds(6, 28, 415, 23);
		rdbtnNewRadioButton_10.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_10.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Sophomore (30 - 59) (8 pts)");
		rdbtnNewRadioButton_11.setEnabled(false);
		rdbtnNewRadioButton_11.setBounds(6, 63, 415, 23);
		rdbtnNewRadioButton_11.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_11.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Junior (60 - 89) (6 pts)");
		rdbtnNewRadioButton_12.setEnabled(false);
		rdbtnNewRadioButton_12.setBounds(6, 98, 415, 23);
		rdbtnNewRadioButton_12.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_12.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Senior (90 - above) (4 pts)");
		rdbtnNewRadioButton_13.setSelected(true);
		counter+=4;
		rdbtnNewRadioButton_13.setBounds(6, 133, 415, 23);
		rdbtnNewRadioButton_13.setForeground(new Color(0, 0, 102));
		rdbtnNewRadioButton_13.setFont(new Font("Arial", Font.PLAIN, 13));
		panel_1.setLayout(null);
		panel_1.add(lblClassification);
		panel_1.add(rdbtnNewRadioButton_10);
		panel_1.add(rdbtnNewRadioButton_11);
		panel_1.add(rdbtnNewRadioButton_12);
		panel_1.add(rdbtnNewRadioButton_13);
		
		ButtonGroup classGroup = new ButtonGroup();
		classGroup.add(rdbtnNewRadioButton_10);
		classGroup.add(rdbtnNewRadioButton_11);
		classGroup.add(rdbtnNewRadioButton_12);
		classGroup.add(rdbtnNewRadioButton_13);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 22, 177, 136);
		frmRsvpPoints.getContentPane().add(panel_2);
		
		JLabel lblDistanceFromCampus = new JLabel("Distance from Campus");
		lblDistanceFromCampus.setBounds(2, 5, 174, 16);
		lblDistanceFromCampus.setForeground(new Color(0, 0, 102));
		lblDistanceFromCampus.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistanceFromCampus.setFont(new Font("Arial", Font.BOLD, 13));
		
		JRadioButton rdbtnNewCheckBox = new JRadioButton("Within 25 mi (5 pts)");
		rdbtnNewCheckBox.setSelected(true);
		counter+=5;
		rdbtnNewCheckBox.setBounds(2, 33, 145, 23);
		rdbtnNewCheckBox.setForeground(new Color(0, 0, 102));
		rdbtnNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnMoreThan = new JRadioButton("More than 25 mi (10 pts)");
		rdbtnMoreThan.setEnabled(false);
		rdbtnMoreThan.setBounds(2, 68, 174, 23);
		rdbtnMoreThan.setForeground(new Color(0, 0, 102));
		rdbtnMoreThan.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JRadioButton rdbtnInternationalStudents = new JRadioButton("International (15 pts)");
		rdbtnInternationalStudents.setEnabled(false);
		rdbtnInternationalStudents.setBounds(2, 103, 169, 23);
		rdbtnInternationalStudents.setForeground(new Color(0, 0, 102));
		rdbtnInternationalStudents.setFont(new Font("Arial", Font.PLAIN, 13));
		panel_2.setLayout(null);
		panel_2.add(lblDistanceFromCampus);
		panel_2.add(rdbtnNewCheckBox);
		panel_2.add(rdbtnMoreThan);
		panel_2.add(rdbtnInternationalStudents);
		
		ButtonGroup distanceGroup = new ButtonGroup();
		distanceGroup.add(rdbtnNewCheckBox);
		distanceGroup.add(rdbtnMoreThan);
		distanceGroup.add(rdbtnInternationalStudents);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(195, 22, 238, 136);
		frmRsvpPoints.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCommunity = new JLabel("Student Involvement (MAX 10 pts)");
		lblCommunity.setForeground(new Color(0, 0, 102));
		lblCommunity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommunity.setBounds(6, 5, 226, 16);
		lblCommunity.setFont(new Font("Arial", Font.BOLD, 13));
		panel_3.add(lblCommunity);
		
		JRadioButton rdbtnUniversityOrganization = new JRadioButton("University Organization (2 pts)");
		rdbtnUniversityOrganization.setSelected(true);
		counter+=10;
		rdbtnUniversityOrganization.setForeground(new Color(0, 0, 102));
		rdbtnUniversityOrganization.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnUniversityOrganization.setBounds(6, 33, 226, 23);
		panel_3.add(rdbtnUniversityOrganization);
		
		JRadioButton rdbtnEmployment = new JRadioButton("Employment (2 pts)");
		rdbtnEmployment.setEnabled(false);
		rdbtnEmployment.setForeground(new Color(0, 0, 102));
		rdbtnEmployment.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnEmployment.setBounds(6, 65, 226, 23);
		panel_3.add(rdbtnEmployment);
		
		JRadioButton rdbtnCommunityOrganization = new JRadioButton("Community Organization (2 pts)");
		rdbtnCommunityOrganization.setEnabled(false);
		rdbtnCommunityOrganization.setForeground(new Color(0, 0, 102));
		rdbtnCommunityOrganization.setFont(new Font("Arial", Font.PLAIN, 13));
		rdbtnCommunityOrganization.setBounds(6, 100, 226, 23);
		panel_3.add(rdbtnCommunityOrganization);
		
		JLabel lblPointsBreakdown = new JLabel("Points Breakdown");
		lblPointsBreakdown.setFont(new Font("Arial", Font.BOLD, 13));
		lblPointsBreakdown.setForeground(new Color(0, 0, 102));
		lblPointsBreakdown.setBounds(6, 6, 113, 16);
		frmRsvpPoints.getContentPane().add(lblPointsBreakdown);
		
		JLabel lblPoints = new JLabel("Points: " + counter);
		lblPoints.setForeground(new Color(0, 0, 102));
		lblPoints.setFont(new Font("Arial", Font.BOLD, 13));
		lblPoints.setBounds(445, 5, 199, 16);
		frmRsvpPoints.getContentPane().add(lblPoints);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_View_Home homeFrame = new Student_View_Home(ID);
				homeFrame.frmHome.setVisible(true);
				frmRsvpPoints.dispose();
			}
		});
		btnBack.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBack.setForeground(new Color(0, 0, 102));
		btnBack.setBounds(527, 343, 117, 29);
		frmRsvpPoints.getContentPane().add(btnBack);
		
		/*JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSubmit.setForeground(new Color(0, 0, 102));
		btnSubmit.setBounds(6, 342, 117, 29);
		frmRsvpPoints.getContentPane().add(btnSubmit);
		frmRsvpPoints.setResizable(false);
		frmRsvpPoints.setTitle("RSVP Points");
		frmRsvpPoints.setBounds(200, 200, 650, 400);
		frmRsvpPoints.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
	}
}
