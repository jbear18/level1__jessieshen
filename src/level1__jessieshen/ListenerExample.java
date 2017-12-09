package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenerExample implements ActionListener {
	// 6. hover red underline and pick add unimplented methods
	public static void main(String[] args) {
		// 2. start run from main
		ListenerExample ex = new ListenerExample();
		ex.run();

	}

	// 1. make a run method
	public void run() {
		// 3. make our GUI
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("click me!!");
		frame.add(panel);
		panel.add(button);
		frame.pack();
		frame.setVisible(true);
		// 4. add action listener
		button.addActionListener(this);
		// "this" is a special word in Java Programming

		// 5. hover red underline and choose"implement" option

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 7. code that runs when the event happens
		System.out.println("•EVENT DETECTED•");
	}

}
