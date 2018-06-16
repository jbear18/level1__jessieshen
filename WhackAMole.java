package level1__jessieshen;

//make a 'miss' button, so that every time the player misses it counts

//the most times you can play is 14 to win. b/c you will lose on your 15th turn if you don't whack the mole
//cannot put a method inside of another method

// sound: whack-a-mole.wav already in default package
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	int count = 0;
	int miss = 0;

	JButton mole = new JButton("mole!");
	JFrame frame;
	JPanel panel;
	JButton button;

	Random rand = new Random();
	int n = rand.nextInt(24);

	public void makeButtons() {
		frame = new JFrame("Whack a Mole");
		panel = new JPanel();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(330, 330);
		frame.add(panel);
		drawButtons(n);
		button.addActionListener(this);

	}

	void drawButtons(int r) {
		for (int i = 0; i < 24; i++) {

			if (i == r) {

				panel.add(mole);
				mole.addActionListener(this);
			} else {
				button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
		}

	}

	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole();
		whack.makeButtons();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == button) {

			count++;
		}
		if (e.getSource() == mole) {
			count++;
			frame.dispose();

			makeButtons();

		}

		if (count == 10) {
			JOptionPane.showMessageDialog(null, "You've whacked 10 moles");
			JOptionPane.showMessageDialog(null, "You missed " + miss + " moles");
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			if (miss < 5) {
				JOptionPane.showMessageDialog(null, "You have won!!!!");
			} else {
				JOptionPane.showMessageDialog(null, "You failed.");
				JOptionPane.showMessageDialog(null, "Click the run button to play again");
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			}
		}
	}
}
