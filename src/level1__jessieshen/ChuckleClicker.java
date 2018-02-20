package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JPanel panel= new JPanel();
	JButton joke= new JButton("joke");
	JButton punchline= new JButton("punchline");
 
	public void makeButtons(){
	JFrame frame= new JFrame("The Chuckle Clicker");
frame.setVisible(true);
frame.setSize(550, 330);
frame.add(panel);
panel.add(joke);
panel.add(punchline);
frame.pack();;
joke.addActionListener(this);
punchline.addActionListener(this);

	}
	//Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 
public static void main(String[] args) {
	ChuckleClicker c= new ChuckleClicker();
c.makeButtons();


	//Make a JFrame in makeButtons() method and get it to show (make it visible).

	//Add a JPanel and two JButtons and get them to show up like this:

	//*[Optional] Customize your GUI with setText, setSize, etc.

	//Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.

	//Check if the ActionEvent came from the joke button or the punchline button.  
	//if(arg0.getSource() == jokeButton)
	//You might need to move the declaration of your buttons above the the makeButtons() method.

	//Use JOptionPane to print the joke or the punchline depending on which button was clicked.

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == punchline) {
	JOptionPane.showMessageDialog(null, "Because he didn't have the guts to do it");
	
}
	if(e.getSource() == joke) {
		
	JOptionPane.showMessageDialog(null, "Why didn't skeleton cross the road?");	
		
	}
}
}
