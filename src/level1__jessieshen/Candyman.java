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
import javax.swing.JPanel;

public class Candyman implements ActionListener{

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
