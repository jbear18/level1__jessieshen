package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	
	JFrame frame = new JFrame("Nasty Surprise!");
	JPanel panel = new JPanel();
	JButton trick = new JButton("trick");
	JButton treat = new JButton("treat");

	public static void main(String[] args) {
		NastySurprise nasty = new NastySurprise();
		nasty.makeButtons();
	}

	public void makeButtons() {
frame.add(panel);
		panel.add(treat);
		panel.add(trick);
		frame.setVisible(true);
		frame.pack();
		trick.addActionListener(this);
		treat.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == trick) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/c6/4c/e0/c64ce05bf01ccb3ea8af44de5980cbe4.jpg");
			
		}
			if(e.getSource() == treat) {
				showPictureFromTheInternet("https://i.pinimg.com/originals/a1/43/95/a143956e0872fb11aacc908021a596a5.jpg");
					
				
			}
		
		
		
	}

}
