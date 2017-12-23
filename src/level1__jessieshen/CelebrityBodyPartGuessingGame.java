package level1__jessieshen;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CelebrityBodyPartGuessingGame {

	// Get 3 celebrity photos from the internet, save them to your computer, and
	// fill
	// in their paths here. To get the path, right click on the image, and copy its
	// Location.
	String firstImage = "/Users/league/Desktop/level1__jessieshen/src/level1__jessieshen/Mike Pence.jpg";
	String secondImage = "/Users/league/Desktop/level1__jessieshen/src/level1__jessieshen/Altaf Hussain .jpg";
	String thirdImage = "/Users/league/Desktop/level1__jessieshen/src/level1__jessieshen/JonathanCornick.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(1000, 800);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String ans = JOptionPane.showInputDialog("Who is this person? (first and last name )");
		// If they got the answer right:
		// -- Tell them they are correct.
		if (ans.equals("Mike Pence")) {
			JOptionPane.showMessageDialog(null, "Congratulations! You are correct!");
			score += 20;
		} else {
			score -= 10;
			JOptionPane.showMessageDialog(null, "•INCORRECT•");

		}
		showNextImage();
		
		// Ask the user who this person is and store their answer
		String ans1 = JOptionPane.showInputDialog("Who is this person? (first and last name )");
		// If they got the answer right:
		// -- Tell them they are correct.
		if (ans1.equals("Altaf Hussain")) {
			JOptionPane.showMessageDialog(null, "Congratulations! You are correct!");
			score += 20;
		} else {
			score -= 10;
			JOptionPane.showMessageDialog(null, "•INCORRECT•");
		}
		showNextImage();
		// Ask the user who this person is and store their answer
		String ans2 = JOptionPane.showInputDialog("Who's Twitter account is this? (first and last name)");
		// If they got the answer right:
		// -- Tell them they are correct.
		if (ans2.equals("Jonathan Cornick")) {
			JOptionPane.showMessageDialog(null, "Congratulations! You are correct!");
			score += 20;
		} else {
			score -= 10;
			JOptionPane.showMessageDialog(null, "•INCORRECT•");

		}

		JOptionPane.showMessageDialog(null, "You score is"+score+".");
		
		
		// -- Increase the score by 20

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		CelebrityBodyPartGuessingGame quiz = new CelebrityBodyPartGuessingGame();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
