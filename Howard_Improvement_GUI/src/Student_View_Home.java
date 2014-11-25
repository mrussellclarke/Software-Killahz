import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;


public class Student_View_Home {

	public JFrame frmHome;
	private JTable table;
	public static String home;
	public String ID;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		DataConnector.main(args);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_View_Home window = new Student_View_Home();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_View_Home() {
		initialize();
	}
	
	public Student_View_Home(String idNumber) {
		ID = idNumber;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.getContentPane().setBackground(new Color(255, 51, 51));
		frmHome.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.setResizable(false);
		frmHome.setTitle("Home");
		frmHome.setBounds(400, 400, 850, 600);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(315, 162, 518, 399);
		table.setForeground(new Color(0, 0, 204));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Arial", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, "1"},
				{"2", "3", "4", "5", "6", "7", "8"},
				{"9", "10", "11", "12", "13", "14", "15"},
				{"16", "17", "18", "19", "20", "21", "22"},
				{"23", "24", "25", "26", "27", "28", "29"},
				{"30", null, null, null, null, null, null},
			},
			new String[] {
				"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmHome.getContentPane().add(table);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Validated");
		chckbxNewCheckBox.setBounds(175, 157, 128, 23);
		chckbxNewCheckBox.setForeground(new Color(0, 0, 204));
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxRsvpDeposit = new JCheckBox("RSVP Deposit");
		chckbxRsvpDeposit.setBounds(175, 197, 128, 23);
		chckbxRsvpDeposit.setForeground(new Color(0, 0, 204));
		chckbxRsvpDeposit.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(chckbxRsvpDeposit);
		
		JButton btnViewRsvpPoints = new JButton("View RSVP Points");
		btnViewRsvpPoints.setBounds(17, 196, 150, 29);
		btnViewRsvpPoints.setForeground(new Color(0, 0, 204));
		btnViewRsvpPoints.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				home = "View RSVP Points";
				Semester_Menu semesterFrame = new Semester_Menu();
				semesterFrame.frmSemesterMenu.setVisible(true);
				frmHome.dispose();
			}
		});
		btnViewRsvpPoints.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnViewRsvpPoints);
		
		JButton btnSubmitOrgDocs = new JButton("Submit Org Docs");
		btnSubmitOrgDocs.setBounds(17, 237, 150, 29);
		btnSubmitOrgDocs.setForeground(new Color(0, 0, 204));
		btnSubmitOrgDocs.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Semester_Menu semesterFrame = new Semester_Menu();
				semesterFrame.frmSemesterMenu.setVisible(true);
				home = "Submit Org Docs";
				frmHome.dispose();
			}
		});
		btnSubmitOrgDocs.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnSubmitOrgDocs);
		
		JButton btnHousingAssignment = new JButton("Housing Assignment");
		btnHousingAssignment.setBounds(17, 155, 150, 29);
		btnHousingAssignment.setForeground(new Color(0, 0, 204));
		btnHousingAssignment.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				Semester_Menu semesterFrame = new Semester_Menu();
				semesterFrame.frmSemesterMenu.setVisible(true);
				home = "Housing Assignment";
				frmHome.dispose();
			}
		});
		btnHousingAssignment.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnHousingAssignment);
		
		JButton btnCheckIn = new JButton("Check In");
		btnCheckIn.setBounds(17, 278, 150, 29);
		btnCheckIn.setForeground(new Color(0, 0, 204));
		btnCheckIn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				Semester_Menu semesterFrame = new Semester_Menu();
				semesterFrame.frmSemesterMenu.setVisible(true);
				home = "Check In";
				frmHome.dispose();
			}
		});
		btnCheckIn.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnCheckIn);
		
		JLabel lblAnnouncements = new JLabel("Announcements");
		lblAnnouncements.setBounds(17, 353, 150, 16);
		lblAnnouncements.setForeground(new Color(0, 0, 204));
		lblAnnouncements.setFont(new Font("Arial", Font.BOLD, 13));
		frmHome.getContentPane().add(lblAnnouncements);
		
		JLabel lblNovember = new JLabel("November");
		lblNovember.setBounds(315, 134, 128, 16);
		lblNovember.setForeground(new Color(0, 0, 204));
		lblNovember.setFont(new Font("Arial", Font.BOLD, 13));
		frmHome.getContentPane().add(lblNovember);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(716, 6, 117, 29);
		btnSignOut.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				SignIn signInFrame = new SignIn();
				signInFrame.frmSignIn.setVisible(true);
				frmHome.dispose();
			}
		});
		btnSignOut.setForeground(new Color(0, 0, 204));
		btnSignOut.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnSignOut);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(17, 381, 286, 180);
		frmHome.getContentPane().add(scrollPane);
		
		JTextArea list = new JTextArea();
		scrollPane.setViewportView(list);
		list.setWrapStyleWord(true);
		list.setLineWrap(true);
		list.setText("This is where the Announcements would go. I am working on making the calendar not look like a terrible mess. Other than that all of the buttons work except for the Select Assignment and the Check In. Also I am going to test for the different semester selections will show different information. Also the color choice was just because I was sick of looking at a whole bunch of gray. I hope you guys are reading these Announcements or else all of this work I'm putting into this section will have been for nothing so be considerate and take a minute to read this. Unless I've written too much and you can't even see it because we all know you are all most likely too lazy to scroll. I am now finished.");
		list.setToolTipText("");
		list.setForeground(new Color(0, 0, 204));
		list.setFont(new Font("Arial", Font.PLAIN, 13));
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblWelcomeSoftwareKillhaz = new JLabel("Welcome, " + DataConnector.getName(ID));
		lblWelcomeSoftwareKillhaz.setForeground(new Color(0, 0, 204));
		lblWelcomeSoftwareKillhaz.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeSoftwareKillhaz.setFont(new Font("Arial", Font.BOLD, 20));
		lblWelcomeSoftwareKillhaz.setBounds(17, 47, 816, 75);
		frmHome.getContentPane().add(lblWelcomeSoftwareKillhaz);
	}
	
	public static String getButton() {
		return home;
	}
}
