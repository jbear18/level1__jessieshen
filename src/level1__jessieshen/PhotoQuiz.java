package level1__jessieshen;

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String blob = "https://i.imgur.com/pOMKdLl.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component c;
		// 3. use the "createImage()" method below to initialize your Component
		c = createImage(blob);
		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("What is this fish?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equals("blobfish")) {
			JOptionPane.showMessageDialog(null, "Correct!");

		}

		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect:(");

		}

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
		String bloblobster = "https://i.pinimg.com/originals/b4/18/ff/b418ff6e3d93f2db73dd50e6790abe8f.jpg";
		// 11. add the second image to the quiz window
		Component l;
		l = createImage(bloblobster);
		// 12. pack the quiz window
		quizWindow.add(l);
		quizWindow.pack();
		// 13. ask another question
		String user = JOptionPane.showInputDialog("Who is this guy in the picture?");
		// 14. check answer, say if correct or incorrect, etc.
		if (user.equals("Voldemort")) {
			JOptionPane.showMessageDialog(null, "Correct!");

		} else {

			JOptionPane.showMessageDialog(null, "Incorrect:(");

		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
