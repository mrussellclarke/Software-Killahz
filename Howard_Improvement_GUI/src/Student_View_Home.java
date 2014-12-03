import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;

import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPanel;


public class Student_View_Home {

	public JFrame frmHome;
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
		frmHome.getContentPane().setBackground(new Color(204, 204, 204));
		frmHome.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.setResizable(false);
		frmHome.setTitle("Home");
		frmHome.setBounds(400, 400, 850, 600);
		frmHome.setLocationRelativeTo(null);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(315, 162, 518, 399);
		frmHome.getContentPane().add(panel);
		panel.setLayout(null);
		
		BufferedImage wPic = null;
		try {
			wPic = ImageIO.read(this.getClass().getResource("December-2014-Calendar-Printable.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Image scaledImage = wPic.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
		JLabel wIcon = new JLabel(new ImageIcon(scaledImage));
		wIcon.setSize(518, 399);
		wIcon.setLocation(0, 0);

		panel.add(wIcon);
		
		Student_Temp student = new Student_Temp(ID);
		
		JRadioButton rdbtnValidated = new JRadioButton("Validated");
		rdbtnValidated.setSelected(true);
		if (rdbtnValidated.isSelected() == true)
		{
			student.valid = true;
		}
		else
		{
			student.valid = false;
		}
		rdbtnValidated.setBounds(175, 157, 128, 23);
		rdbtnValidated.setForeground(new Color(0, 0, 102));
		rdbtnValidated.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(rdbtnValidated);
		
		JRadioButton rdbtnRsvpDeposit = new JRadioButton("RSVP Deposit");
		rdbtnRsvpDeposit.setBounds(175, 197, 128, 23);
		rdbtnRsvpDeposit.setForeground(new Color(0, 0, 102));
		rdbtnRsvpDeposit.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(rdbtnRsvpDeposit);
		
		JButton btnViewRsvpPoints = new JButton("View RSVP Points");
		btnViewRsvpPoints.setBounds(17, 196, 150, 29);
		btnViewRsvpPoints.setForeground(new Color(0, 0, 102));
		btnViewRsvpPoints.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				home = "View RSVP Points";
				Semester_Menu semesterFrame = new Semester_Menu(ID);
				semesterFrame.frmSemesterMenu.setVisible(true);
				frmHome.dispose();
			}
		});
		btnViewRsvpPoints.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnViewRsvpPoints);
		
		JButton btnSubmitOrgDocs = new JButton("Submit Org Docs");
		btnSubmitOrgDocs.setBounds(17, 237, 150, 29);
		btnSubmitOrgDocs.setForeground(new Color(0, 0, 102));
		btnSubmitOrgDocs.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Semester_Menu semesterFrame = new Semester_Menu(ID);
				semesterFrame.frmSemesterMenu.setVisible(true);
				home = "Submit Org Docs";
				frmHome.dispose();
			}
		});
		btnSubmitOrgDocs.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnSubmitOrgDocs);
		
		JButton btnHousingAssignment = new JButton("Housing Assignment");
		btnHousingAssignment.setBounds(17, 155, 150, 29);
		btnHousingAssignment.setForeground(new Color(0, 0, 102));
		btnHousingAssignment.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				Semester_Menu semesterFrame = new Semester_Menu(ID);
				semesterFrame.frmSemesterMenu.setVisible(true);
				home = "Housing Assignment";
				frmHome.dispose();
			}
		});
		btnHousingAssignment.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnHousingAssignment);
		
		JButton btnCheckIn = new JButton("Check In");
		btnCheckIn.setBounds(17, 278, 150, 29);
		btnCheckIn.setForeground(new Color(0, 0, 102));
		btnCheckIn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				Semester_Menu semesterFrame = new Semester_Menu(ID);
				semesterFrame.frmSemesterMenu.setVisible(true);
				home = "Check In";
				frmHome.dispose();
			}
		});
		btnCheckIn.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome.getContentPane().add(btnCheckIn);
		
		JLabel lblAnnouncements = new JLabel("Announcements");
		lblAnnouncements.setBounds(17, 353, 150, 16);
		lblAnnouncements.setForeground(new Color(0, 0, 102));
		lblAnnouncements.setFont(new Font("Arial", Font.BOLD, 13));
		frmHome.getContentPane().add(lblAnnouncements);
		
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
		btnSignOut.setForeground(new Color(0, 0, 102));
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
		list.setForeground(new Color(0, 0, 102));
		list.setFont(new Font("Arial", Font.PLAIN, 13));
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblWelcome = new JLabel("Welcome, " + DataConnector.getName(ID));
		lblWelcome.setForeground(new Color(0, 0, 102));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Arial", Font.BOLD, 20));
		lblWelcome.setBounds(17, 47, 816, 75);
		frmHome.getContentPane().add(lblWelcome);
	}
	
	public static String getButton() {
		return home;
	}
}
