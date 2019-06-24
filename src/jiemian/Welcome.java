package jiemian;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JWindow;

public class Welcome extends JWindow implements MouseListener{
	BackgroundPanel bg;
	public Welcome(){
		bg = new BackgroundPanel((new ImageIcon("./src/img/welcome.jpg")).getImage()); 
		bg.setBounds(0,0,1186,700);
		bg.addMouseListener((MouseListener) this);
		this.add(bg);
		this.setLayout(null); 
		this.setLocation(380, 150);
		this.setSize(1186,700);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Welcome();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
      if(e.getSource().equals(bg)){
			new Login_blank().setVisible(true);
			this.dispose();

			}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
