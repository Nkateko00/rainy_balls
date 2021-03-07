/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainy_days;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rainy_days extends JComponent implements ActionListener,KeyListener{
		Timer t =null;
        int i =310,q = 290;
	int y =100;
	int x =220;
        int a = 160;
        int z = 330;
        int f = 10,d = 150;
        int v =370,r = 200;
        int u = 90, p= 300;
        int  velF = 3,velD =3;
	int velX = 3,velY =3;
        int velA = 3,velZ =3;
        int velI = 3,velQ =3;
        int velC = 2,velH =2;
        int velR =3, velV =3;
        int velU =3,velP =3;
	int c =250;
	int h =310;
        int prrr;
public Rainy_days(){
	addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
}

public void paintComponent(Graphics g){
        Rectangle r1 = new Rectangle(c,h,20,20); //BLUE
        Rectangle r2 = new Rectangle(x,y,20,20); //PINK
        Rectangle r3 = new Rectangle(a,z,20,20); 
        Rectangle r4 = new Rectangle(f,d,20,20); 
        Rectangle r5 = new Rectangle(i,q,20,20);
        Rectangle r6 = new Rectangle(v,r,20,20);
        Rectangle r7 = new Rectangle(u,p,20,20);

            
        
        
        
        
        g.setColor(Color.ORANGE);
        g.fillRect(0,0,600,400);
	g.setColor(new Color(255,105,180)); 
	g.fillOval(r2.x,r2.y,r2.width,r2.height);
	g.setColor(new Color(135,206,250));
	g.fillOval(r1.x,r1.y,r1.width,r1.height);
        g.setColor(new Color(255,105,180));
        g.fillOval(r3.x,r3.y,r3.width,r3.height);
        g.setColor(new Color(255,105,180)); 
        g.fillOval(r4.x,r4.y,r4.width,r4.height);
        g.setColor(new Color(255,105,180));
        g.fillOval(r5.x,r5.y, r5.width, r5.height);
        g.setColor(new Color(255,105,180));
        g.fillOval(r6.x,r6.y, r6.width, r6.height);
        g.setColor(new Color(255,105,180));
        g.fillOval(r7.x,r7.y, r7.width, r7.height);
        
        
        if(r1.intersects(r2)){
            gameover();
        }
        if(r1.intersects(r3)){
            gameover();
            
        }
        if(r1.intersects(r4)){
            gameover();
        }
        if(r1.intersects(r5)){
            gameover();
        }
        if(r1.intersects(r6)){
            gameover();
        }
        if(r1.intersects(r7)){
            gameover();
}
	
}
public void actionPerformed(ActionEvent e){
	if(x <0 || x >560){
		velX = -velX;
		repaint();
                //System.out.println("x = "+x);
	}
	if( y <0 || y >360){
		velY = -velY;
		repaint();
                //System.out.println("y = "+y);
	}
        if(f <0 || f >560){
            velF = -velF;
            repaint();
        }
        if(d <0 ||d >360){
            velD = -velD;
            repaint();
            
        }
        if( a<0 || a>560){
            velA = -velA;
            repaint();
        }
        if(z<0 || z>360){
            velZ = -velZ;
            repaint();
        }
        if(i<0 || i>560){
            velI = -velI;
            repaint();
        }
            
        if(q<0 || q>360){
            velQ = -velQ;
            repaint();
        }
        if(v<0 || v >560){
            velV = -velV;
            repaint();
        }
        if(r<0 || r>360){
            velR = - velR;
            repaint();
        }
       if(u<0 || u >560){
           velU = -velU;
           repaint();
       }
       if(p<0 || p >360){
           velP = -velP;
           repaint();
       }
       	x =x + 0;
        repaint();
	//System.out.print("X cordinates = "+x);
	y = y +velY;
	repaint();
	//System.out.print("Y cordinates = "+y);
        a = a+0;
        repaint();
        z = z +velZ;
        repaint();
        f = f +0;
        repaint(); 
        d = d+velD;
        repaint();
        i =i+0;
        repaint();
        q = q +velQ;
        repaint();
        v = v+0;
        repaint();
        r =r +velR;
        repaint();
        u = u +0;
        repaint();
        p = p +velP;
        repaint();
}
public void keyPressed(KeyEvent e){
	int code = e.getKeyCode();
         
	if(code == KeyEvent.VK_SPACE){
	        c = c +0;
		h = h -80;
                perimeter();
		repaint();
                    System.out.println("X value +" +c +"Y value =" +h);
		}   
        if(code ==KeyEvent.VK_RIGHT){
                c = c+20;
                h = h +0;
                repaint(); 
                perimeter();
                System.out.println("X value ="+c +"Y Vslue ="+h);
        }
        if(code == KeyEvent.VK_LEFT){
               c = c-20;
               h = h +0;
               perimeter();
               repaint();
        }
        if(code ==KeyEvent.VK_DOWN){
               c = c+0;
               h = h+20;
               perimeter();
               repaint();
        }

	
}
public void perimeter(){
   if(c>=560){
       c =560;
   }
   if(c<=0){
       c=0;
   }
   if(h<=0){
        h = 0;      
  }
   if ( h>=340){
       h =340;
    }
   	}
public void gameover(){
    t.stop();
    prrr = JOptionPane.showConfirmDialog((this),"RETRY ?","GAMEOVER :(",JOptionPane.YES_NO_OPTION);
   if(prrr==JOptionPane.YES_OPTION){
       JFrame goo = new JFrame();
       Rainy_days s = new Rainy_days();
       s.t = new Timer(4,s);
       s.t.start();
       goo.add(s);
       goo.setVisible(true);
       goo.setSize(600,400);
       // JOptionPane.showMessageDialog((null),"Sorry we are unable to execute your this command rn :)");
   }
   if(prrr ==JOptionPane.NO_OPTION){
       System.exit(0);
   }
}
public void keyReleased(KeyEvent e){
	

}

public void keyTyped(KeyEvent e){

 }
public static void main (String []args){
	JFrame f = new JFrame();
	Rainy_days sd = new Rainy_days();
	sd.t = new Timer(4,sd);
	sd.t.start();
	f.add(sd);
	f.setSize(600,400);
	f.setTitle("Game");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);

}
}