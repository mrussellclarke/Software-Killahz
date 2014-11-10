import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;


public class Student_View_Submit_Org_Docs {

	public JFrame frmSubmitOrgDocs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_View_Submit_Org_Docs window = new Student_View_Submit_Org_Docs();
					window.frmSubmitOrgDocs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_View_Submit_Org_Docs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSubmitOrgDocs = new JFrame();
		frmSubmitOrgDocs.setResizable(false);
		frmSubmitOrgDocs.getContentPane().setBackground(new Color(255, 51, 51));
		frmSubmitOrgDocs.setTitle("Submit Org Docs");
		frmSubmitOrgDocs.getContentPane().setLayout(null);
		
		JTextArea frmtdtxtfldListOrganizationsseparate = new JTextArea();
		frmtdtxtfldListOrganizationsseparate.setLineWrap(true);
		frmtdtxtfldListOrganizationsseparate.setWrapStyleWord(true);
		frmtdtxtfldListOrganizationsseparate.setText("List Organizations (separate with a comma).");
		frmtdtxtfldListOrganizationsseparate.setForeground(new Color(0, 0, 204));
		frmtdtxtfldListOrganizationsseparate.setFont(new Font("Arial", Font.PLAIN, 13));
		frmtdtxtfldListOrganizationsseparate.setBounds(70, 33, 311, 191);
		frmSubmitOrgDocs.getContentPane().add(frmtdtxtfldListOrganizationsseparate);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Student_View_Home homeFrame = new Student_View_Home();
				homeFrame.frmHome.setVisible(true);
				frmSubmitOrgDocs.dispose();
			}
		});
		btnOk.setBounds(169, 236, 117, 29);
		frmSubmitOrgDocs.getContentPane().add(btnOk);
		frmSubmitOrgDocs.setTitle("Submit Org Docs");
		frmSubmitOrgDocs.setBounds(100, 100, 450, 300);
		frmSubmitOrgDocs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
