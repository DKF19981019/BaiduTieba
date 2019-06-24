package jiemian;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class CircleButton extends JButton {
	private static final long serialVersionUID = -2403661436220830630L; 
	public CircleButton(Icon picture16) {
		super(picture16);

		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);
		setPreferredSize(size);
		setContentAreaFilled(false);
		}
		public CircleButton(String string) {
		// TODO Auto-generated constructor stub
	}
	// ��Բ�İ�ť�ı����ͱ�ǩ
    protected void paintComponent(Graphics g) {
			if(getModel().isArmed()) {
				g.setColor(Color.lightGray); 		
		} 
			else{
		       g.setColor(getBackground());
		}
			g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
			super.paintComponent(g);
		}
    protected void paintBorder(Graphics g) {
		g.setColor(Color.white);
		// drawOval���������ε�������Բ��������䡣ֻ����һ���߽�
		g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
		}
		// shape�������ڱ��水ť����״�����������������ť�¼�
		Shape shape;
		public boolean contains(int x, int y) {
		if((shape == null) || (!shape.getBounds().equals(getBounds()))) {
		shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
	
		return shape.contains(x, y);
		}
    public static void main(String[] args) {
		JButton button = new CircleButton("");
		button.setBackground(Color.orange);
		JFrame frame = new JFrame("Բ�ΰ�ť");
		frame.getContentPane().setBackground(Color.pink);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		}

		

	

