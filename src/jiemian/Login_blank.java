/*
 * Login_blank.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.awt.event.ItemEvent;

import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import database.ModelFactory;
import database.Users;

/**
 *
 * @author  __USER__
 */
public class Login_blank extends javax.swing.JFrame {

	/** Creates new form Login_blank */
	public Login_blank() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel1 = new jiemian.ImageJpanel();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		imageJpanel1.setImage(new ImageIcon("./src/img/login.jpg").getImage());

		jTextField1.setFont(new java.awt.Font("²Ö¶úÊ¥µ®»¶¸èÌå W05", 2, 24));
		jTextField1.setForeground(new java.awt.Color(0, 204, 204));
		jTextField1.setText("\u8bf7\u8f93\u5165\u60a8\u7684\u8d26\u53f7");
		jTextField1.setBorder(null);
		jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				cleartext(evt);
			}
		});
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jPasswordField1.setFont(new java.awt.Font("²Ö¶úÊ¥µ®»¶¸èÌå W05", 0, 24));
		jPasswordField1.setForeground(new java.awt.Color(0, 204, 204));
		jPasswordField1.setBorder(null);
		jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordField1ActionPerformed(evt);
			}
		});
		jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				clearpassword(evt);
			}
		});

		jCheckBox1.setBorder(null);
		jCheckBox1.setContentAreaFilled(false);
		jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				see(evt);
			}
		});
		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

		jButton1.setBorder(new javax.swing.border.MatteBorder(null));
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ Light", 0, 20));
		jButton2.setText("\u6ce8\u518c");
		jButton2.setBorder(new javax.swing.border.MatteBorder(null));
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ Light", 0, 20));
		jButton3.setText("\u5fd8\u8bb0\u5bc6\u7801");
		jButton3.setBorder(new javax.swing.border.MatteBorder(null));
		jButton3.setContentAreaFilled(false);

		jButton4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ Light", 0, 20));
		jButton4.setText("\u77ed\u4fe1\u9a8c\u8bc1\u767b\u5f55");
		jButton4.setBorder(new javax.swing.border.MatteBorder(null));
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

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
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				54,
																				54,
																				54)
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								imageJpanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jPasswordField1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												518,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												30,
																												30,
																												30)
																										.addComponent(
																												jCheckBox1))
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								585,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				76,
																				76,
																				76)
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								imageJpanel1Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton4,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												158,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												98,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												126,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								553,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(66, Short.MAX_VALUE)));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(298, 298, 298)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												48,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(62, 62, 62)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jCheckBox1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																55,
																Short.MAX_VALUE)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																55,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(34, 34, 34)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																35,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(27, 27, 27)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												61,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(25, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String id = jTextField1.getText();
		String pw = String.valueOf(this.jPasswordField1.getPassword());
		Users player;
		try {
			player = ModelFactory.login(id, pw);
			if (id.equals(player.getUsNo()) && pw.equals(player.getUsPwd())) {
				JOptionPane.showMessageDialog(this, "µÇÂ¼³É¹¦£¡");
				new MainBlank(player).setVisible(true);
				this.dispose();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "ÕËºÅ»òÕßÃÜÂë²»ÕýÈ·£¡");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Resgister().setVisible(true);
		this.dispose();
	}

	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void clearpassword(java.awt.event.KeyEvent evt) {

	}

	private void cleartext(java.awt.event.MouseEvent evt) {
		jTextField1.setText("");
	}

	private void see(java.awt.event.ItemEvent evt) {
		if (evt.getStateChange() == ItemEvent.SELECTED) {//±»Ñ¡ÖÐ
			jPasswordField1.setEchoChar((char) 0);
		} else {
			jPasswordField1.setEchoChar('*');
		}
	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login_blank().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}