package level1__jessieshen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
//	1. Make a UI with a button and a text field for a search term.			

	JPanel panel = new JPanel();
	JButton twitter= new JButton("Search Twitter");
	JTextField text= new JTextField(10);

public static void main(String[] args) {
GetLatestTweet t= new GetLatestTweet();	
t.makeButtons();
}
public void makeButtons(){
	JFrame frame= new JFrame("Get Your Latest Tweet Here");	
	frame.setSize(550, 180);
	frame.add(panel);
	panel.add(twitter);
	panel.add(text);
	frame.setVisible(true);
	twitter.addActionListener(this);
}
//	2. When the button is clicked, print “tweet tweet”.

	private String getLatestTweet(String searchingFor) {
	//	4. Use this method to get the latest tweet when the user clicks the button:
		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == twitter) {
		JTextField text= new JTextField();
		text.getText();

		
	}
	}
}




