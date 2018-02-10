package level1__jessieshen;

import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardGame implements ActionListener{
public static void main(String[] args) {
	CardGame cg = new CardGame();
	cg.run();

}

// 1. make a run method
public void run() {
	JFrame frame = new JFrame("Guardians of Ambition");
	JPanel panel = new JPanel();
	JLabel you= new JLabel("Kim Jong Un");
	you= loadImageFromComputer("Kim Jong Un.jpg");
	JLabel enemy= new JLabel("Donald J. Trump");
	enemy=loadImageFromComputer("Donald-Trump.jpg");
	JLabel health= new JLabel("Your Health");
	JLabel enemyhealth= new JLabel("Enemy Health");
	JButton attack= new JButton("Attack");
	frame.add(panel);
	panel.add(attack);
	panel.add(enemyhealth);
panel.add(health);
panel.add(enemy);
panel.add(you);
	frame.setVisible(true);
attack.addActionListener(this);
frame.pack();
}
public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}

@Override
public void actionPerformed(ActionEvent e) {
	
	// TODO Auto-generated method stub
	System.out.println();
}
}
