package jiemian;

import java.awt.Graphics;  

import java.awt.Image;  
  
   
  
import javax.swing.JPanel;  
  
   
  
public class ImageJpanel extends JPanel {  
  
      /** 
 
       *  
 
       */  
  
      private static final long serialVersionUID = -2403661436220830630L;  
  
      Image image =null;  
  
   
  
      public void setImage(Image image) {  
  
           this.image= image;  
  
      }  
  
   
  
      @Override  
  
      protected void paintComponent(Graphics g) {  
  
           super.paintComponent(g);  
  
           g.drawImage(image,0, 0,this);  
  
      }  
  
   
  
}  