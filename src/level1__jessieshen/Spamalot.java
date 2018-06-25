//package level1__jessieshen;
//
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class Spamalot implements ActionListener {
//	static final String FAKE_USERNAME = "i.bezerka824@gmail.com";
//	static final String FAKE_PASSWORD = "randomname";
//
//	// i.bezerka824@gmail.com password:randomname
//	// Sean: noummsmtgtrollsalt@gmail.com
//	JFrame frame = new JFrame("I SPAM A LOT");
//	JPanel panel = new JPanel();
//	JTextField textfield = new JTextField(30);
//	JButton good = new JButton("GOOD");
//	JButton bad = new JButton("BAD");
//
//	public static void main(String[] args) {
//		Spamalot spamalot = new Spamalot();
//		spamalot.run();
//	}
//
//	public void run() {
//		frame.add(panel);
//		panel.add(textfield);
//		panel.add(good);
//		panel.add(bad);
//		frame.setVisible(true);
//		frame.pack();
//		good.addActionListener(this);
//		bad.addActionListener(this);
//	}
//
//	private boolean sendSpam(String recipient, String subject, String content) {
//
//		Properties props = new Properties();
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtp.port", "587");
//
//		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
//			}
//		});
//
//		try {
//
//			Message message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(FAKE_USERNAME));
//			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
//			message.setSubject(subject);
//			message.setText(content);
//			Transport.send(message);
//			return true;
//
//		} catch (MessagingException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		JButton buttonPressed = (JButton) e.getSource();
//		if (buttonPressed == good) {
//			String email = textfield.getText();
//			boolean received = sendSpam(email, "Good News:", "we are not yet dead");
//			if (received == true) {
//				textfield.setBackground(Color.GREEN);
//
//			}
//		}
//		if (buttonPressed == bad) {
//			String email = textfield.getText();
//			boolean received = sendSpam(email, "OPEN THIS UP BEFORE THE WORLD ENDS", "beware of the killer bunny!!");
//			if (received == false) {
//				textfield.setBackground(Color.RED);
//			}
//		}
//	}
//
//}
