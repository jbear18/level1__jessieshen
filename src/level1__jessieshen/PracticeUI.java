package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PracticeUI implements ActionListener{

	
	
		
		
	JPanel panel= new JPanel();
		JButton button1= new JButton("term");
		JButton button2=new JButton("definition");
	
	
		public void makeButtons(){
			JFrame frame= new JFrame("Practice UI");
		frame.setVisible(true);
		frame.setSize(550, 330);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();;
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		
		}
		public static void main(String[] args) {
			PracticeUI practice= new PracticeUI();
		practice.makeButtons();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == button1) {
				JOptionPane.showMessageDialog(null, "what does lmfao mean???");
				
			}
				if(e.getSource() == button2) {
					
				JOptionPane.showMessageDialog(null, "definition: laughing my f***ing *** off");	
					
				}
		}	
}


