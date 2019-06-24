/*
 * MainBlank.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import database.ModelFactory;
import database.Tip;
import database.Users;

/**
 *
 * @author  __USER__
 */
public class MainBlank extends javax.swing.JFrame {
	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	int day = calendar.get(Calendar.DATE);
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	int minute = calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);

	private Users player;
	private Tip tip1;
	private Tip tip2;
	private Tip tip3;
	private Tip tip4;
	private Tip tip5;
	private Tip tip6;

	/** Creates new form MainBlank 
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	public MainBlank(Users player2) throws SQLException, ClassNotFoundException {
		player = player2;
		int max = ModelFactory.chaTipIDMax();
		tip1 = ModelFactory.chatie(max);
		tip2 = ModelFactory.chatie(max - 1);
		tip3 = ModelFactory.chatie(max - 2);
		tip4 = ModelFactory.chatie(max - 3);
		tip5 = ModelFactory.chatie(max - 4);
		tip6 = ModelFactory.chatie(max - 5);
		initComponents();
		this.jTextField4.setEditable(false);
		this.jTextField8.setEditable(false);
		this.jTextField9.setEditable(false);
		this.jTextField10.setEditable(false);
		this.jTextField11.setEditable(false);
		this.jTextField12.setEditable(false);

		this.jTextField4.setText(tip1.getTipTitle());
		this.jLabel18.setText(String.valueOf(tip1.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel19.setText(ModelFactory.chaWritor(tip1.getUserid()));
		this.jLabel20.setText(tip1.getTipTime());

		this.jTextField8.setText(tip2.getTipTitle());
		this.jLabel29.setText(String.valueOf(tip2.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel30.setText(ModelFactory.chaWritor(tip2.getUserid()));
		this.jLabel31.setText(tip2.getTipTime());

		this.jTextField9.setText(tip3.getTipTitle());
		this.jLabel32.setText(String.valueOf(tip3.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel33.setText(ModelFactory.chaWritor(tip3.getUserid()));
		this.jLabel34.setText(tip3.getTipTime());

		this.jTextField10.setText(tip4.getTipTitle());
		this.jLabel35.setText(String.valueOf(tip4.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel36.setText(ModelFactory.chaWritor(tip4.getUserid()));
		this.jLabel37.setText(tip4.getTipTime());

		this.jTextField11.setText(tip5.getTipTitle());
		this.jLabel38.setText(String.valueOf(tip5.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel39.setText(ModelFactory.chaWritor(tip5.getUserid()));
		this.jLabel40.setText(tip5.getTipTime());

		this.jTextField12.setText(tip6.getTipTitle());
		this.jLabel41.setText(String.valueOf(tip6.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel42.setText(ModelFactory.chaWritor(tip6.getUserid()));
		this.jLabel43.setText(tip6.getTipTime());

		this.jLabel17.setText(player.getUsName());
		this.setLocationRelativeTo(null);

	}

	public MainBlank() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel4 = new jiemian.ImageJpanel();
		jButton4 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jTabbedPane4 = new javax.swing.JTabbedPane();
		jScrollPane4 = new javax.swing.JScrollPane();
		jPanel4 = new javax.swing.JPanel();
		jLabel18 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();
		jLabel29 = new javax.swing.JLabel();
		jLabel30 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jTextField10 = new javax.swing.JTextField();
		jLabel36 = new javax.swing.JLabel();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		jTextField11 = new javax.swing.JTextField();
		jLabel39 = new javax.swing.JLabel();
		jLabel40 = new javax.swing.JLabel();
		jLabel41 = new javax.swing.JLabel();
		jTextField12 = new javax.swing.JTextField();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		jPanel5 = new javax.swing.JPanel();
		jLabel21 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jScrollPane11 = new javax.swing.JScrollPane();
		jTextArea5 = new javax.swing.JTextArea();
		jScrollPane15 = new javax.swing.JScrollPane();
		jTextArea6 = new javax.swing.JTextArea();
		jTextField7 = new javax.swing.JTextField();
		jLabel26 = new javax.swing.JLabel();
		jLabel27 = new javax.swing.JLabel();
		jLabel28 = new javax.swing.JLabel();
		jScrollPane12 = new javax.swing.JScrollPane();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane13 = new javax.swing.JScrollPane();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane14 = new javax.swing.JScrollPane();
		jPanel6 = new javax.swing.JPanel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jTextField6 = new javax.swing.JTextField();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		imageJpanel4.setForeground(new java.awt.Color(255, 255, 255));
		imageJpanel4.setImage(new ImageIcon("./src/img/RBQ.jpg").getImage());

		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel16.setFont(new java.awt.Font("²Ö¶úÐ¡ÂþÂþÌå W02", 1, 36));
		jLabel16.setForeground(new java.awt.Color(255, 255, 255));
		jLabel16.setText("\u6b22\u8fce\u60a8\uff0c\u7528\u6237\uff1a");

		jLabel17.setFont(new java.awt.Font("²Ö¶úÐ¡ÂþÂþÌå W02", 1, 24));
		jLabel17.setForeground(new java.awt.Color(255, 255, 255));
		jLabel17.setText("\u7528\u6237\u540d");

		jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

		jScrollPane4.setBorder(null);

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jLabel18.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel18.setText("n\u6761\u8bc4\u8bba");

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField4.setForeground(new java.awt.Color(51, 51, 255));
		jTextField4.setText("\u6807\u9898");
		jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				showtieba(evt);
			}
		});
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jLabel19.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel19.setForeground(new java.awt.Color(0, 204, 204));
		jLabel19.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel20.setForeground(new java.awt.Color(0, 204, 204));
		jLabel20.setText("2018-12-23");

		jTextField8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField8.setForeground(new java.awt.Color(51, 51, 255));
		jTextField8.setText("\u6807\u9898");
		jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				show2(evt);
			}
		});

		jLabel29.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel29.setText("n\u6761\u8bc4\u8bba");

		jLabel30.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel30.setForeground(new java.awt.Color(0, 204, 204));
		jLabel30.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel31.setForeground(new java.awt.Color(0, 204, 204));
		jLabel31.setText("2018-12-23");

		jLabel32.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel32.setText("n\u6761\u8bc4\u8bba");

		jTextField9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField9.setForeground(new java.awt.Color(51, 51, 255));
		jTextField9.setText("\u6807\u9898");
		jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				show3(evt);
			}
		});
		jTextField9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jLabel33.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel33.setForeground(new java.awt.Color(0, 204, 204));
		jLabel33.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel34.setForeground(new java.awt.Color(0, 204, 204));
		jLabel34.setText("2018-12-23");

		jLabel35.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel35.setText("n\u6761\u8bc4\u8bba");

		jTextField10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField10.setForeground(new java.awt.Color(51, 51, 255));
		jTextField10.setText("\u6807\u9898");
		jTextField10
				.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				show4(evt);
			}
		});
		jTextField10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jLabel36.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel36.setForeground(new java.awt.Color(0, 204, 204));
		jLabel36.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel37.setForeground(new java.awt.Color(0, 204, 204));
		jLabel37.setText("2018-12-23");

		jLabel38.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel38.setText("n\u6761\u8bc4\u8bba");

		jTextField11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField11.setForeground(new java.awt.Color(51, 51, 255));
		jTextField11.setText("\u6807\u9898");
		jTextField11
				.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				show5(evt);
			}
		});
		jTextField11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jLabel39.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel39.setForeground(new java.awt.Color(0, 204, 204));
		jLabel39.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel40.setForeground(new java.awt.Color(0, 204, 204));
		jLabel40.setText("2018-12-23");

		jLabel41.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel41.setText("n\u6761\u8bc4\u8bba");

		jTextField12.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField12.setForeground(new java.awt.Color(51, 51, 255));
		jTextField12.setText("\u6807\u9898");
		jTextField12
				.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				show6(evt);
			}
		});
		jTextField12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		jLabel42.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel42.setForeground(new java.awt.Color(0, 204, 204));
		jLabel42.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel43.setForeground(new java.awt.Color(0, 204, 204));
		jLabel43.setText("2018-12-23");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel18)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jTextField4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				631,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel19)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel20))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel29)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jTextField8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				631,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel30)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel31))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel32)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jTextField9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				631,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel33)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel34))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel35)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jTextField10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				631,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel36)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel37))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel38)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jTextField11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				631,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel39)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel40))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel41)
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jTextField12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				631,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel42)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel43)))
										.addContainerGap(101, Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(95, 95, 95)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel18,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel19)
														.addComponent(jLabel20))
										.addGap(27, 27, 27)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel29,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel30)
														.addComponent(jLabel31))
										.addGap(28, 28, 28)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel32,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField9,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel33)
														.addComponent(jLabel34))
										.addGap(30, 30, 30)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel35,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel36)
														.addComponent(jLabel37))
										.addGap(31, 31, 31)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel38,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel39)
														.addComponent(jLabel40))
										.addGap(36, 36, 36)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel41,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel42)
														.addComponent(jLabel43))
										.addContainerGap(429, Short.MAX_VALUE)));

		jScrollPane4.setViewportView(jPanel4);

		jTabbedPane4.addTab("      \u770b\u5e16      ", jScrollPane4);

		jScrollPane5.setBorder(null);

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		jLabel21.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel21.setText("n\u6761\u8bc4\u8bba");

		jTextField5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField5.setForeground(new java.awt.Color(51, 51, 255));
		jTextField5.setText("\u6807\u9898");
		jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jLabel22.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel22.setForeground(new java.awt.Color(0, 204, 204));
		jLabel22.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel23.setForeground(new java.awt.Color(0, 204, 204));
		jLabel23.setText("2018-12-23");

		jTextArea5.setColumns(20);
		jTextArea5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jTextArea5.setRows(5);
		jScrollPane11.setViewportView(jTextArea5);

		jTextArea6.setColumns(20);
		jTextArea6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jTextArea6.setRows(5);
		jScrollPane15.setViewportView(jTextArea6);

		jTextField7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jTextField7.setForeground(new java.awt.Color(51, 51, 255));
		jTextField7.setText("\u6807\u9898");
		jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jLabel26.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 15));
		jLabel26.setText("n\u6761\u8bc4\u8bba");

		jLabel27.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel27.setForeground(new java.awt.Color(0, 204, 204));
		jLabel27.setText("\u53d1\u5e16\u4eba\u6635\u79f0");

		jLabel28.setForeground(new java.awt.Color(0, 204, 204));
		jLabel28.setText("2018-12-23");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel21)
																		.addGap(
																				28,
																				28,
																				28)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jScrollPane11,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField5,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								631,
																								Short.MAX_VALUE))
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel22)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jLabel23))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel26)
																		.addGap(
																				28,
																				28,
																				28)
																		.addGroup(
																				jPanel5Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jScrollPane15,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jTextField7,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								631,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel27)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel28)))
										.addContainerGap(117, Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(8, 8, 8)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel21,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel22)
														.addComponent(jLabel23))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane11,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												188,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(36, 36, 36)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel26,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																38,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel27)
														.addComponent(jLabel28))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane15,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												188,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(424, Short.MAX_VALUE)));

		jScrollPane5.setViewportView(jPanel5);

		jTabbedPane4.addTab("      \u7cbe\u54c1      ", jScrollPane5);

		jScrollPane12.setBackground(new java.awt.Color(255, 255, 255));
		jScrollPane12.setBorder(null);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 983,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 969,
				Short.MAX_VALUE));

		jScrollPane12.setViewportView(jPanel1);

		jTabbedPane4.addTab("      \u89c6\u9891     ", jScrollPane12);

		jScrollPane13.setBackground(new java.awt.Color(255, 255, 255));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 981,
				Short.MAX_VALUE));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 967,
				Short.MAX_VALUE));

		jScrollPane13.setViewportView(jPanel2);

		jTabbedPane4.addTab("     \u7fa4\u7ec4     ", jScrollPane13);

		jScrollPane14.setBorder(null);

		jPanel6.setBackground(new java.awt.Color(255, 255, 255));

		jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/picture_guideline.png"))); // NOI18N

		jLabel25.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel25.setForeground(new java.awt.Color(0, 204, 204));
		jLabel25
				.setText("\u672a\u5206\u7c7b\u56fe\u518c \u00b7 1\u4e2a\u56fe\u518c");

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/picture1.png"))); // NOI18N
		jButton6.setContentAreaFilled(false);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addComponent(jLabel24)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel25))
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addGap(
																				27,
																				27,
																				27)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				381,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(520, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel24,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																602,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel25)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton6)))
										.addContainerGap(350, Short.MAX_VALUE)));

		jScrollPane14.setViewportView(jPanel6);

		jTabbedPane4.addTab("      \u56fe\u7247       ", jScrollPane14);

		jButton5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u9000\u51fa\u8d26\u53f7");
		jButton5.setBorder(null);
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5jButton2ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u5173\u6ce8\u7684\u5427");
		jButton7.setBorder(null);
		jButton7.setContentAreaFilled(false);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7jButton3ActionPerformed(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton8.setForeground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u767e\u5ea6\u9996\u9875");
		jButton8.setBorder(null);
		jButton8.setContentAreaFilled(false);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8jButton4ActionPerformed(evt);
			}
		});

		jButton9.setBackground(new java.awt.Color(102, 102, 255));
		jButton9.setFont(new java.awt.Font("²Ö¶úÐ¡ÂþÂþÌå W02", 1, 30));
		jButton9.setForeground(new java.awt.Color(255, 255, 255));
		jButton9.setText("\u7b7e\u5230");
		jButton9.setBorder(null);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9jButton5ActionPerformed(evt);
			}
		});

		jTextField6.setFont(new java.awt.Font("²Ö¶úÊ¥µ®»¶¸èÌå W05", 0, 24));
		jTextField6.setForeground(new java.awt.Color(0, 204, 204));
		jTextField6.setText("6\u670824\u65e5");
		jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jButton10.setBackground(new java.awt.Color(51, 51, 255));
		jButton10.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton10.setForeground(new java.awt.Color(255, 255, 255));
		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/APP1.PNG"))); // NOI18N
		jButton10.setBorder(null);
		jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton10MouseEntered(evt);
			}
		});
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed1(evt);
			}
		});

		jButton11.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton11.setForeground(new java.awt.Color(255, 255, 255));
		jButton11.setText("\u4e2a\u4eba\u8d44\u6599");
		jButton11.setBorder(null);
		jButton11.setContentAreaFilled(false);
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11jButton8ActionPerformed(evt);
			}
		});

		jButton12.setBackground(new java.awt.Color(51, 51, 255));
		jButton12.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton12.setForeground(new java.awt.Color(255, 255, 255));
		jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/·¢Ìû1.PNG"))); // NOI18N
		jButton12.setBorder(null);
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton12fatie(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton12fatie2(evt);
			}
		});
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12jButton9ActionPerformed(evt);
			}
		});

		jButton13.setBackground(new java.awt.Color(45, 188, 235));
		jButton13.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton13.setForeground(new java.awt.Color(255, 255, 255));
		jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Ë¢ÐÂ.png"))); // NOI18N
		jButton13.setBorder(null);
		jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton13shuaxin(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton13shuaxin2(evt);
			}
		});
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton13jButton10ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton14.setBackground(new java.awt.Color(45, 188, 235));
		jButton14.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jButton14.setForeground(new java.awt.Color(255, 255, 255));
		jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Share1.png"))); // NOI18N
		jButton14.setBorder(null);
		jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton14fenxiang(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton14MouseExited(evt);
			}
		});

		javax.swing.GroupLayout imageJpanel4Layout = new javax.swing.GroupLayout(
				imageJpanel4);
		imageJpanel4.setLayout(imageJpanel4Layout);
		imageJpanel4Layout
				.setHorizontalGroup(imageJpanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel4Layout
										.createSequentialGroup()
										.addGap(183, 183, 183)
										.addGroup(
												imageJpanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTabbedPane4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																988,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																imageJpanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				92,
																				92,
																				92)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				115,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				imageJpanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jLabel17,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel16))
																		.addGap(
																				248,
																				248,
																				248)
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				116,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				1,
																				1,
																				1)
																		.addComponent(
																				jTextField6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(18, 18, 18)
										.addGroup(
												imageJpanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																93,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton12,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																93,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton14,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																93,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton13,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																93,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(164, 164, 164)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								imageJpanel4Layout.createSequentialGroup()
										.addContainerGap(1048, Short.MAX_VALUE)
										.addComponent(jButton8).addGap(35, 35,
												35).addComponent(jButton11)
										.addGap(27, 27, 27).addComponent(
												jButton7).addGap(32, 32, 32)
										.addComponent(jButton5)
										.addContainerGap()));
		imageJpanel4Layout
				.setVerticalGroup(imageJpanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												imageJpanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton7)
														.addComponent(jButton5)
														.addComponent(jButton11)
														.addComponent(jButton8))
										.addGroup(
												imageJpanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				imageJpanel4Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								108,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								imageJpanel4Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												13,
																												Short.MAX_VALUE)
																										.addGroup(
																												imageJpanel4Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addGroup(
																																imageJpanel4Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jLabel16,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				63,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(
																																				1,
																																				1,
																																				1)
																																		.addComponent(
																																				jLabel17))
																														.addGroup(
																																imageJpanel4Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				imageJpanel4Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.BASELINE)
																																						.addComponent(
																																								jTextField6,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								49,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								jButton9,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								51,
																																								javax.swing.GroupLayout.PREFERRED_SIZE))
																																		.addGap(
																																				1,
																																				1,
																																				1)))))
																		.addGap(
																				38,
																				38,
																				38)
																		.addComponent(
																				jTabbedPane4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				603,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				35,
																				35,
																				35))
														.addGroup(
																imageJpanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				193,
																				193,
																				193)
																		.addComponent(
																				jButton10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				87,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				87,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				36,
																				36,
																				36)
																		.addComponent(
																				jButton13,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				87,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton14,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				87,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void show6(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		try {
			new Show_tie(tip6, player).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void show5(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		try {
			new Show_tie(tip5, player).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void show4(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		try {
			new Show_tie(tip4, player).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void show3(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		try {
			new Show_tie(tip3, player).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void show2(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		try {
			new Show_tie(tip2, player).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void showtieba(java.awt.event.MouseEvent evt) {
		try {
			new Show_tie(tip1, player).setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
		new Show_tie().setVisible(true);
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {

		jTextField6.setText(month + "ÔÂ" + day + "ÈÕ");
	}

	private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {
		new App_EWM().setVisible(true);
	}

	private void jButton14MouseExited(java.awt.event.MouseEvent evt) {
		jButton14.setText("");
		jButton14.setBackground(new Color(45, 188, 235));
		jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Share1.png")));
	}

	private void jButton14fenxiang(java.awt.event.MouseEvent evt) {
		jButton14.setIcon(null);
		jButton14.setText("·ÖÏí");
		jButton14.setBackground(new Color(136, 159, 198));
	}

	private void jButton13jButton10ActionPerformed(
			java.awt.event.ActionEvent evt) throws SQLException,
			ClassNotFoundException {
		int max = ModelFactory.chaTipIDMax();
		tip1 = ModelFactory.chatie(max);
		tip2 = ModelFactory.chatie(max - 1);
		tip3 = ModelFactory.chatie(max - 2);
		tip4 = ModelFactory.chatie(max - 3);
		tip5 = ModelFactory.chatie(max - 4);
		tip6 = ModelFactory.chatie(max - 5);

		this.jTextField4.setEditable(false);
		this.jTextField8.setEditable(false);
		this.jTextField9.setEditable(false);
		this.jTextField10.setEditable(false);
		this.jTextField11.setEditable(false);
		this.jTextField12.setEditable(false);

		this.jTextField4.setText(tip1.getTipTitle());
		this.jLabel18.setText(String.valueOf(tip1.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel19.setText(ModelFactory.chaWritor(tip1.getUserid()));
		this.jLabel20.setText(tip1.getTipTime());

		this.jTextField8.setText(tip2.getTipTitle());
		this.jLabel29.setText(String.valueOf(tip2.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel30.setText(ModelFactory.chaWritor(tip2.getUserid()));
		this.jLabel31.setText(tip2.getTipTime());

		this.jTextField9.setText(tip3.getTipTitle());
		this.jLabel32.setText(String.valueOf(tip3.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel33.setText(ModelFactory.chaWritor(tip3.getUserid()));
		this.jLabel34.setText(tip3.getTipTime());

		this.jTextField10.setText(tip4.getTipTitle());
		this.jLabel35.setText(String.valueOf(tip4.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel36.setText(ModelFactory.chaWritor(tip4.getUserid()));
		this.jLabel37.setText(tip4.getTipTime());

		this.jTextField11.setText(tip5.getTipTitle());
		this.jLabel38.setText(String.valueOf(tip5.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel39.setText(ModelFactory.chaWritor(tip5.getUserid()));
		this.jLabel40.setText(tip5.getTipTime());

		this.jTextField12.setText(tip6.getTipTitle());
		this.jLabel41.setText(String.valueOf(tip6.getReplyCount()) + "ÌõÆÀÂÛ");
		this.jLabel42.setText(ModelFactory.chaWritor(tip6.getUserid()));
		this.jLabel43.setText(tip6.getTipTime());

	}

	private void jButton13shuaxin2(java.awt.event.MouseEvent evt) {
		jButton13.setText("");
		jButton13.setBackground(new Color(45, 188, 235));
		jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/Ë¢ÐÂ.png")));
	}

	private void jButton13shuaxin(java.awt.event.MouseEvent evt) {
		jButton13.setIcon(null);
		jButton13.setText("Ë¢ÐÂ");
		jButton13.setBackground(new Color(136, 159, 198));
	}

	private void jButton12jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		new Fatie(player).setVisible(true);
	}

	private void jButton12fatie2(java.awt.event.MouseEvent evt) {
		jButton12.setText("");
		jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/·¢Ìû1.PNG")));
	}

	private void jButton12fatie(java.awt.event.MouseEvent evt) {
		jButton12.setIcon(null);
		jButton12.setText("·¢Ìû");
		jButton12.setBackground(new Color(55, 133, 249));
	}

	private void jButton11jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		new User_Message(player).setVisible(true);
	}

	private void jButton10ActionPerformed1(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton9jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		jButton9.setText("ÒÑÇ©µ½");
		jButton9.setBackground(new Color(140, 186, 253));
		try {
			ModelFactory.setJifen(player.getUsId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton8jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		java.net.URI uri = java.net.URI.create("http://www.baidu.com/");
		java.awt.Desktop dp = java.awt.Desktop.getDesktop();
		if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
			try {
				dp.browse(uri);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private void jButton7jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new CareBar().setVisible(true);
	}

	private void jButton5jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Login_blank().setVisible(true);
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(this);
		File f = jfc.getSelectedFile();
		this.jButton6.setIcon(new ImageIcon(f.getAbsolutePath()));
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(this);
		File f = jfc.getSelectedFile();
		this.jButton4.setIcon(new ImageIcon(f.getAbsolutePath()));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				new MainBlank().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel4;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane12;
	private javax.swing.JScrollPane jScrollPane13;
	private javax.swing.JScrollPane jScrollPane14;
	private javax.swing.JScrollPane jScrollPane15;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTabbedPane jTabbedPane4;
	private javax.swing.JTextArea jTextArea5;
	private javax.swing.JTextArea jTextArea6;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField11;
	private javax.swing.JTextField jTextField12;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables

}