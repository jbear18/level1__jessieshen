package level1__jessieshen;


//make a 'miss' button, so that every time the player misses it counts
//make the frame draw the buttons anew so that the 'mole!' button moves


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
int count= 0;
	JFrame frame= new JFrame("Whack a Mole");
JPanel panel= new JPanel();
JButton button= new JButton();

Random rand= new Random();
int n = rand.nextInt(24);

public void makeButtons(){
frame.setVisible(true);
frame.setSize(550, 330);
frame.add(panel);
drawButtons(n);
button.addActionListener(this);
}
void drawButtons(int r) {
	for (int i = 0; i < 25; i++) {
		
		if(i==r) {
			JButton mole= new JButton("mole!");
			panel.add(mole);
			mole.addActionListener(this);
		}else {
			panel.add(new JButton());
			
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
	count ++;
	
	
	if(count==10) {
	JOptionPane.showMessageDialog(null, "You've whacked 10 moles");	
	JOptionPane.showMessageDialog(null, "You missed"+ miss+ "moles");
	
	if miss<5{
	JOptionPane.showMessageDialog(null, "You have won!!!!");
	}else {
		JOptionPane.showMessageDialog(null, "You failed. Click the run button the play again!");
	}
}
}
}
