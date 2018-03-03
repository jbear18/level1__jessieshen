package level1__jessieshen;

import java.net.URL;
import java.util.Random;
import java.awt.GridLayout;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CardGame implements ActionListener{
public static void main(String[] args) {
	CardGame cg = new CardGame();
	cg.run();

}
JLabel health= new JLabel();
JLabel enemyhealth= new JLabel();
int hp= 100;
int ehp= 100;
// 1. make a run method
public void run() {
	JFrame frame = new JFrame("Guardians of Ambition");
	JPanel panel = new JPanel();
	JPanel secondpanel = new JPanel();
	JPanel thirdpanel= new JPanel();
	JLabel you= new JLabel("Kim Jong Un");

	you= loadImageFromComputer("Kim Jong Un.jpg");
	JLabel enemy= new JLabel("Donald J. Trump");
	enemy=loadImageFromComputer("Donald-Trump.jpg");
	
	JButton attack= new JButton("Attack!!");
	health.setText("Your HP:"+ hp);
	enemyhealth.setText("Enemy HP:"+ ehp);
	frame.setLayout(new GridLayout(2, 2));
	frame.add(panel);
	frame.add(secondpanel);
	frame.add(thirdpanel);
	thirdpanel.add(attack);
	secondpanel.add(enemyhealth);
panel.add(health);
secondpanel.add(enemy);
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

	Random gen= new Random();
	int youattack= gen.nextInt(30);
	int enemyattack= gen.nextInt(30);
	hp=hp-enemyattack;
	ehp=ehp-youattack;
	health.setText("Your HP:"+ hp);
	enemyhealth.setText("Enemy HP:"+ ehp);
	if(hp<=0) {
		JOptionPane.showMessageDialog(null, "YOU HAVE DIED. I THOUGHT I COULD TRUST YOU");
		String ans= JOptionPane.showInputDialog("Do you want to play again?");
		if(ans=="yes");
	}
	if(ehp<=0) {
		JOptionPane.showMessageDialog(null, "CONGRATS. YOU HAVE NOT FAILED ME");
		String ans= JOptionPane.showInputDialog("Do you want to play again?");
		if(ans=="yes");
	}
	if(hp==0&&ehp==0) {
		
		JOptionPane.showMessageDialog(null, "YOU HAVE BOTH DIED, AND FAILED ME");
		String ans= JOptionPane.showInputDialog("Do you want to play again?");
		if(ans=="yes") {
		JOptionPane.showMessageDialog(null, "Then exit out of this game, and press the green play button at the top");
		
	}
	 {
		
		
	}
}
}}

