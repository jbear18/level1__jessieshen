package level1__jessieshen;


	import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;
import org.teachingextensions.logo.MultiTurtlePanel;
	import org.teachingextensions.logo.Turtle;

	public class LandOfTurtles {
		public static void main(String[] args) {
			MultiTurtlePanel turtlepanel = new MultiTurtlePanel();
			String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

	// 1. Create a frame & make it visible
JFrame frame = new JFrame("Land of Turtles");

			// 2. Add the panel to the frame
		frame.add(turtlepanel);
			frame.setVisible(true);
			frame.setSize(900, 900);
			// 3. Set the background image of the panel to the Galapagos Islands 
turtlepanel.setBackgroundImage(galapagosIslands);

			// 4. Instantiate a Turtle 

	// 5. Add the turtle to the panel 
for (int i = 0; i < 51; i++) {

	Random rand = new Random();
int value= rand.nextInt(1000);
	
	Turtle turtle = new Turtle();
	turtlepanel.addTurtle(turtle);
turtle.setX(value);
turtle.setY(value);
}

			// 6. Put 50 Turtles on Galapagos Islands

		}
	}



