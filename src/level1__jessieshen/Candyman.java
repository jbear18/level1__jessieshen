package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener{

	int count= 0;
	
	public static void main(String[] args) {
		Candyman c = new Candyman();
		c.run();
	}

	void run() {
		JFrame frame = new JFrame("Candyman");
		JPanel panel = new JPanel();
		JButton candy = new JButton("Candyman");
		frame.add(panel);
		panel.add(candy);
		frame.pack();
		frame.setVisible(true);
		
candy.addActionListener(this);
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;
	
public static void playSound(int whichSound) {
	File soundFile = null;
   	 if (whichSound == CREEPY)
   		 soundFile = new File(
   				 "/Users/Guest/Google Drive/league-sounds/creepysound.wav");
   	 else if (whichSound == SCREAM)
   		 soundFile = new File(
   				 "/Users/League/Google Drive/league-sounds/scream.wav");
   	 try {
   		 AudioInputStream audioInputStream = AudioSystem
   				 .getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
   	 } catch (Exception ex) {
   		 ex.printStackTrace();
   	 }
    }
    

// use creepydoll.jpg and creepysound.wav
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count ++;
			
		if(count<5) {
			System.out.println("Candyman");
		}
		if(count==5) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/a1/43/95/a143956e0872fb11aacc908021a596a5.jpg");
			playSound(0);	
		}
		
	}

}
