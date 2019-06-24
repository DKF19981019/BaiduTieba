package jiemian;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JWindow;

public class App_EWM extends JWindow implements MouseListener{
	BackgroundPanel bg;
	public App_EWM(){
		bg = new BackgroundPanel((new ImageIcon("./src/img/EWM.PNG")).getImage()); 
		bg.setBounds(0,0,165,162);
		bg.addMouseListener((MouseListener) this);
		this.add(bg);
		this.setLayout(null);
		this.setLocation(1530, 335);
		this.setSize(165,162);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new App_EWM();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
      if(e.getSource().equals(bg)){
			
			this.dispose();

			}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
