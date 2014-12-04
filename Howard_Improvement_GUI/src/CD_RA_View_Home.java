import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;


public class CD_RA_View_Home {

	private JFrame frmHome2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CD_RA_View_Home window = new CD_RA_View_Home();
					window.frmHome2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CD_RA_View_Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome2 = new JFrame();
		frmHome2.getContentPane().setBackground(new Color(204, 204, 204));
		frmHome2.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome2.setResizable(false);
		frmHome2.setTitle("Home");
		frmHome2.setBounds(400, 400, 850, 600);
		frmHome2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome2.getContentPane().setLayout(null);
		
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
		frmHome2.getContentPane().add(table);
		
		JLabel lblWelcomeAdministrator = new JLabel("Welcome, Administrator!");
		lblWelcomeAdministrator.setForeground(new Color(0, 0, 204));
		lblWelcomeAdministrator.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeAdministrator.setFont(new Font("Arial", Font.BOLD, 20));
		lblWelcomeAdministrator.setBounds(17, 47, 816, 75);
		frmHome2.getContentPane().add(lblWelcomeAdministrator);
		
		JLabel lblAnnouncements = new JLabel("Announcements");
		lblAnnouncements.setBounds(17, 441, 150, 16);
		lblAnnouncements.setForeground(new Color(0, 0, 204));
		lblAnnouncements.setFont(new Font("Arial", Font.BOLD, 13));
		frmHome2.getContentPane().add(lblAnnouncements);
		
		JLabel lblNovember = new JLabel("November");
		lblNovember.setBounds(315, 134, 128, 16);
		lblNovember.setForeground(new Color(0, 0, 204));
		lblNovember.setFont(new Font("Arial", Font.BOLD, 13));
		frmHome2.getContentPane().add(lblNovember);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(716, 6, 117, 29);
		btnSignOut.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent a) {
				SignIn signInFrame = new SignIn();
				signInFrame.frmSignIn.setVisible(true);
				frmHome2.dispose();
			}
		});
		btnSignOut.setForeground(new Color(0, 0, 204));
		btnSignOut.setFont(new Font("Arial", Font.PLAIN, 13));
		frmHome2.getContentPane().add(btnSignOut);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(17, 330, 286, 92);
		frmHome2.getContentPane().add(scrollPane);
		
		JTextArea list = new JTextArea();
		scrollPane.setViewportView(list);
		list.setWrapStyleWord(true);
		list.setLineWrap(true);
		list.setText("This is where the Announcements would go. I am working on making the calendar not look like a terrible mess. Other than that all of the buttons work except for the Select Assignment and the Check In. Also I am going to test for the different semester selections will show different information. Also the color choice was just because I was sick of looking at a whole bunch of gray. I hope you guys are reading these Announcements or else all of this work I'm putting into this section will have been for nothing so be considerate and take a minute to read this. Unless I've written too much and you can't even see it because we all know you are all most likely too lazy to scroll. I am now finished.");
		list.setToolTipText("");
		list.setForeground(new Color(0, 0, 204));
		list.setFont(new Font("Arial", Font.PLAIN, 13));
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(17, 469, 286, 92);
		frmHome2.getContentPane().add(scrollPane_1);
		
		JTextArea txtrThisIsWhere = new JTextArea();
		txtrThisIsWhere.setWrapStyleWord(true);
		txtrThisIsWhere.setToolTipText("");
		txtrThisIsWhere.setText("This is where the Announcements would go.");
		txtrThisIsWhere.setLineWrap(true);
		txtrThisIsWhere.setForeground(new Color(0, 0, 204));
		txtrThisIsWhere.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrThisIsWhere.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane_1.setViewportView(txtrThisIsWhere);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(17, 469, 286, 92);
		frmHome2.getContentPane().add(scrollPane_1);
		
		JTextArea textArea2 = new JTextArea();
		txtrThisIsWhere.setWrapStyleWord(true);
		txtrThisIsWhere.setToolTipText("");
		txtrThisIsWhere.setText("This is where the Announcements would go. I am working on making the calendar not look like a terrible mess. Other than that all of the buttons work except for the Select Assignment and the Check In. Also I am going to test for the different semester selections will show different information. Also the color choice was just because I was sick of looking at a whole bunch of gray. I hope you guys are reading these Announcements or else all of this work I'm putting into this section will have been for nothing so be considerate and take a minute to read this. Unless I've written too much and you can't even see it because we all know you are all most likely too lazy to scroll. I am now finished.");
		txtrThisIsWhere.setLineWrap(true);
		txtrThisIsWhere.setForeground(new Color(0, 0, 204));
		txtrThisIsWhere.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrThisIsWhere.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane_1.setViewportView(txtrThisIsWhere);
		
		JLabel label2 = new JLabel("Dorms");
		
		JLabel label_1 = new JLabel("Announcements");
		label_1.setForeground(new Color(0, 0, 204));
		label_1.setFont(new Font("Arial", Font.BOLD, 13));
		label_1.setBounds(17, 302, 150, 16);
		frmHome2.getContentPane().add(label_1);
	}
}
