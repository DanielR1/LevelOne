import java.util.Random;

import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);

		// 2. Add the panel to the frame
		frame.add(panel);
		frame.setSize(1200, 800);
		
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage(galapagosIslands);

		// 4. Instantiate a Turtle 
		Turtle bob = new Turtle();

// 5. Add the turtle to the panel 
		panel.addTurtle(bob);
		bob.show();
		
		// 6. Put 50 Turtles on the beach
		for (int i = 0;i<50;i++) {
			Turtle jay = new Turtle();
			panel.addTurtle(jay);
			jay.setX(600);
			jay.setY(600);
			for (int j = 0; j < i; j++) {
				
			jay.setSpeed(10);
			jay.move(20);
			jay.turn(7.2);
			}

	}
	}
}
