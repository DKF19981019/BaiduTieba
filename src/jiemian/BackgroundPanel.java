package jiemian;

import java.awt.*;  

import javax.swing.*;  
 
class BackgroundPanel extends JPanel  
{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image im;  
    public BackgroundPanel(Image im)  
    {  
        this.im=im;  
        this.setOpaque(true);  
    }  
    //Draw the back ground.  
    public void paintComponent(Graphics g)  
    {  
        super.paintComponents(g);  
        g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);  
          
    }  
}  