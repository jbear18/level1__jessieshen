package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener{
	JFrame frame= new JFrame("Pig Latin Translater");
	JPanel panel= new JPanel();
	JTextField input= new JTextField(20);
	JButton button = new JButton("Translate");
	JTextField output = new JTextField(20);
	public static void main(String[] args) {
	PigLatin pg= new PigLatin();
	pg.makeButtons();
}
public void makeButtons() {
	frame.add(panel);
	frame.setVisible(true);
	panel.add(input);
	panel.add(button);
	panel.add(output);
	button.addActionListener(this);
	frame.setSize(1000, 200);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}