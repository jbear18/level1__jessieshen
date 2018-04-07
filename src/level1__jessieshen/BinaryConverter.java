package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

public class BinaryConverter implements ActionListener{
JFrame frame= new JFrame("Binary Converter");
JPanel panel= new JPanel();
JTextField input= new JTextField(20);
JButton button = new JButton("Convert");
JTextField output = new JTextField(20);
public static void main(String[] args) {
BinaryConverter bc= new BinaryConverter();
bc.makeButtons();

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
int convert(String binary) {
	if(binary.length() != 8){
		JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		return 0;
	}
	 if(!binary.matches("[01]+")) {
JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
	 }
	try {
		int asciiValue = Integer.parseInt(binary, 2);
		return asciiValue;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		//question.setText("");
		return 0;
	}
}
String convert1(int asciiValue) {
 
  	 char theLetter = (char) asciiValue;
  	 return "" + theLetter;
   }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
String in=	input.getText();
int out = convert(in);
String a= convert1(out);
output.setText(a);
}











}
