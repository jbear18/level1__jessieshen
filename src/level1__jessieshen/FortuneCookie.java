package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
	JPanel panel= new JPanel();
	

	
	
	
	
	public void showButtons(){
	

JFrame frame= new JFrame("Get Your Ultimate Fortune Here");
frame.setVisible(true);
frame.setSize(550, 330);
JButton f= new JButton("Show me my fortune now!");
frame.add(panel);
panel.add(f);
frame.pack();;
f.addActionListener(this);
	}
	public static void main(String[] args) {
		FortuneCookie fortune= new FortuneCookie();
	fortune.showButtons();
//	Fortune Cookie recipe: Create a button that gives one of five random fortunes when clicked.
 
//	Make a class, main method and showButton method. Put a printout in the showButton method. Instantiate your class and see that your printout works. 

	

	//Make a JFrame in showButton method and get it to show.

	//Make a JButton and add it to the JFrame.

	//Add an action listener to the button (auto fix the errors!!). When the button is clicked, say “Woohoo”.

	//Generate a random number between 0 and 4. Depending on the random number, show on of five fortunes.
	
	
	
	
	
	
	
	
	
	
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	Random gen= new Random();
	int random= gen.nextInt(8);
	if(random==0) {
		JOptionPane.showMessageDialog(null, "Error 404: Fortune not found");
	}
	if(random==1) {
		JOptionPane.showMessageDialog(null, "Wouldn't it be ironic..... to die in the living room?");
	}
	if(random==2) {
		
		JOptionPane.showMessageDialog(null, "Choose another fortune cookie");
	}
	if(random==3) {
		
		JOptionPane.showMessageDialog(null, "You will never surpass anyone for a month");
	}
	if(random==4) {
		
		JOptionPane.showMessageDialog(null, "Congratulations. You get to meet seanthepig right now");
	}
	if(random==5) {
		JOptionPane.showMessageDialog(null, "You shall die of hiccups in 7 minutes");
	}
	if(random==6) {
		
		JOptionPane.showMessageDialog(null, "Today you will surpass nobody. Not even yourself");
	}
	if(random==7) {
		
		JOptionPane.showMessageDialog(null, "You can meet the latest celebrity, Jonathan Cornick.");
	}
}}


