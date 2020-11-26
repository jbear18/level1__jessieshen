package level1__jessieshen;
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    JFrame frame = new JFrame();

    int frameWidth = 1100;
    int frameHeight = 1100;

    FortuneTeller() throws Exception {
   	 fortuneTellerImage = ImageIO.read(getClass().getResource("fortuneteller.jpeg"));
frame.addMouseListener(this);
    }

    static void begin() {
  String ans= JOptionPane.showInputDialog("What is your name?");  
  JOptionPane.showMessageDialog(null, "Welcome to Fisherman's Fortune Telling Hut, "+ ans + ". The key is hidden in a dark and mysterious place");
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
System.out.println("x: "+ mouseX);
System.out.println("y: "+ mouseY);

   	 int secretLocationX = 620;
   	 int secretLocationY = 396;
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		

AudioClip sound = JApplet.newAudioClip(getClass().getResource("fortune.wav"));
   		
sound.play();
  
pause(5);
Random r= new Random();
int v= r.nextInt(4);
System.out.println(v);
JOptionPane.showInputDialog("Please ask a question for Madame Desdemona. Your question will soon be answered.");

if(v==0) {
	
	JOptionPane.showMessageDialog(null, "As I see it, yes.");
}

if(v==1) {
	JOptionPane.showMessageDialog(null, "To your dissapointment, no.");
}

if(v==2) {
	
	JOptionPane.showMessageDialog(null, "Madame Desdemona says to ask later. It is not the right time to ask.");
}
if(v==4){
	
	JOptionPane.showMessageDialog(null, "Madame Desdemona has no time to answer petty questions.");
}
   	 }

    }

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
   
    
    BufferedImage fortuneTellerImage;

    public static void main(String[] args) throws Exception {
   	 SwingUtilities.invokeLater(new FortuneTeller());
   	 begin();
    }

    @Override
    public void run() {
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}






