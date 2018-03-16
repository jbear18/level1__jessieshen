package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
 JFrame frame= new JFrame("Cuteness TV");
 JPanel panel = new JPanel();
 JButton a= new JButton("Ink in Motion");
 JButton b = new JButton("Singing Cats");
 JButton c = new JButton("It's Raining Tacos");

public static void main(String[] args) {
CutenessTV tv= new CutenessTV();
tv.makeButtons();
}
public void makeButtons(){	
	frame.setSize(550, 180);
	frame.add(panel);
	panel.add(a);
	panel.add(b);
	panel.add(c);
	frame.setVisible(true);
	a.addActionListener(this);
	b.addActionListener(this);
	c.addActionListener(this);
}
void showTacos() {
	playVideo("kI03kC_D2ko");
}

void showCats() {
	playVideo("a5JySIRcPFs");
}

void showInk() {
	playVideo("BmBh0NNEm00&t=61s");
}

void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource()==a) {
	showInk();
}
if(e.getSource()==b) {
	showCats();
}
if(e.getSource()==c) {
	showTacos();
}
}}


