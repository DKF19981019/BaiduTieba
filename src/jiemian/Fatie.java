/*
 * Replay.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.sql.SQLException;

import database.ModelFactory;
import database.Users;

/**
 *
 * @author  __USER__
 */
public class Fatie extends javax.swing.JFrame {

	private Users user;

	/** Creates new form Replay */
	public Fatie(Users player2) {
		user = player2;
		initComponents();
		this.setLocationRelativeTo(null);
	}

	public Fatie() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel1 = new jiemian.ImageJpanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jCheckBox1 = new javax.swing.JCheckBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		imageJpanel1.setBackground(new java.awt.Color(246, 247, 249));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/��������.png"))); // NOI18N

		jTextField1.setFont(new java.awt.Font("΢���ź�", 0, 24));
		jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/����guideline.png"))); // NOI18N

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setBackground(new java.awt.Color(246, 247, 249));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/huati.png"))); // NOI18N
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setBackground(new java.awt.Color(55, 133, 249));
		jButton2.setFont(new java.awt.Font("΢���ź�", 0, 18));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u53d1\u8868");
		jButton2.setBorder(null);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jCheckBox1.setBackground(new java.awt.Color(246, 247, 249));
		jCheckBox1.setFont(new java.awt.Font("΢���ź�", 0, 16));
		jCheckBox1
				.setText("\u53d1\u8868\u540e\u81ea\u52a8\u5206\u4eab\u672c\u5e16");

		javax.swing.GroupLayout imageJpanel1Layout = new javax.swing.GroupLayout(
				imageJpanel1);
		imageJpanel1.setLayout(imageJpanel1Layout);
		imageJpanel1Layout
				.setHorizontalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(49, 49, 49)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox1)
																		.addContainerGap())
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								imageJpanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												72,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												766,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								imageJpanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												imageJpanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																301,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGap(
																																427,
																																427,
																																427))
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												imageJpanel1Layout
																														.createSequentialGroup()
																														.addComponent(
																																jLabel2,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																743,
																																Short.MAX_VALUE)
																														.addGap(
																																97,
																																97,
																																97))
																										.addGroup(
																												imageJpanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																imageJpanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jTextField1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				719,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jButton1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				112,
																																				Short.MAX_VALUE))
																														.addComponent(
																																jScrollPane1,
																																javax.swing.GroupLayout.Alignment.LEADING,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																838,
																																javax.swing.GroupLayout.PREFERRED_SIZE))))
																		.addGap(
																				96,
																				96,
																				96)))));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												65,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(35, 35, 35)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																54,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(9, 9, 9)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												268,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(3, 3, 3)
										.addComponent(jCheckBox1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String addd = this.jTextField1.getText();
		addd += "#����";
		this.jTextField1.setText(addd);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String tipTitle = this.jTextField1.getText();
		String tipContext = this.jTextArea1.getText();
		try {
			ModelFactory.FaTie(tipTitle, tipContext, user.getUsId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Fatie().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}