package level1__jessieshen;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingExample {

	// 1. Make components
	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		JPanel myPanel = new JPanel();
		JButton myButton = new JButton("Sean kills doge and pig");
		JTextField myTextField = new JTextField(10);
		// 2. Add them together
		myFrame.add(myPanel);
		myPanel.add(myButton);
		JLabel myLabel = new JLabel();
		myPanel.add(myLabel);
		myPanel.add(myTextField);
		// 3. Pack the Frame
		myFrame.pack();
		myLabel.setText("doge kills pig:(");
		// 4. Set Visible
		myFrame.setVisible(true);
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
