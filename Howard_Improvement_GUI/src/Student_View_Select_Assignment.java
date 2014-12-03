import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Student_View_Select_Assignment {

	public JFrame frmSelectAssignment;
	public String ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_View_Select_Assignment window = new Student_View_Select_Assignment();
					window.frmSelectAssignment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_View_Select_Assignment() {
		initialize();
	}
	
	public Student_View_Select_Assignment(String idNumber) {
		ID = idNumber;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSelectAssignment = new JFrame();
		frmSelectAssignment.getContentPane().setBackground(new Color(204, 204, 204));
		frmSelectAssignment.getContentPane().setFont(new Font("Arial", Font.PLAIN, 13));
		frmSelectAssignment.setResizable(false);
		frmSelectAssignment.setTitle("Select Assignment");
		frmSelectAssignment.setBounds(400, 400, 850, 600);
		frmSelectAssignment.setLocationRelativeTo(null);
		frmSelectAssignment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSelectAssignment.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(301, 490, 244, 35);
		comboBox.setForeground(new Color(0, 0, 102));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"301", "303", "304", "309", "320", "321", "322", "323", "324", "325"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 13));
		frmSelectAssignment.getContentPane().add(comboBox);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(428, 524, 117, 29);
		btnOk.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmSelectAssignment, "You have successfully chosen your room.",
					    "Room Selection", JOptionPane.PLAIN_MESSAGE);
				Student_View_Housing_Assignment housingAssignmentFrame = new Student_View_Housing_Assignment(ID);
				housingAssignmentFrame.frmHousingAssignment.setVisible(true);
				frmSelectAssignment.dispose();
			}
		});
		btnOk.setFont(new Font("Arial", Font.PLAIN, 13));
		btnOk.setForeground(new Color(0, 0, 102));
		frmSelectAssignment.getContentPane().add(btnOk);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(301, 524, 117, 29);
		btnBack.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_View_Housing_Assignment housingAssignmentFrame = new Student_View_Housing_Assignment(ID);
				housingAssignmentFrame.frmHousingAssignment.setVisible(true);
				frmSelectAssignment.dispose();
			}
		});
		btnBack.setFont(new Font("Arial", Font.PLAIN, 13));
		btnBack.setForeground(new Color(0, 0, 102));
		frmSelectAssignment.getContentPane().add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 29, 783, 459);
		frmSelectAssignment.getContentPane().add(panel);
		
		BufferedImage wPic = null;
		try {
			wPic = ImageIO.read(this.getClass().getResource("December-2014-Calendar-Printable.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Image scaledImage = wPic.getScaledInstance(panel.getWidth(),panel.getHeight(),Image.SCALE_SMOOTH);
		JLabel wIcon = new JLabel(new ImageIcon(scaledImage));
		wIcon.setSize(783, 449);
		wIcon.setLocation(0, 0);

		panel.add(wIcon);
		
		JLabel lblNewLabel = new JLabel(DataConnector.getDorm(ID));
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 838, 22);
		frmSelectAssignment.getContentPane().add(lblNewLabel);
	}
}
