
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

import com.spun.util.parser.TemplateDate.FORMATS;

public class TurtlePond implements KeyEventDispatcher {

	
	int cookieX = new Random().nextInt(630); 	
	int cookieY = new Random().nextInt(440); 	
	Color color;
	
	int speed = 3;
	void setup() {
		color = Tortoise.getBackgroundWindow().getBackground();
		JOptionPane.showMessageDialog(null, "Move the turtle with the arrow keys to find the hidden cookie.\nYou'll get warmer the closer you get.\n\nHurry or she'll die of hunger!");
		
		// 4. For debugging purposes, show the cookie. The user won’t see this.
		showCookie();

	}

	private void goUp() {
		Tortoise.setAngle(0);
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.setAngle(180);
		Tortoise.move(speed);
	}

	private void goLeft() {
		
		Tortoise.setAngle(-90);
		Tortoise.move(speed);

		
	}

	private void goRight() {
		
		Tortoise.setAngle(90);
		Tortoise.move(speed);
		
		
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

	
		
		if(Math.abs(tortoiseLocationX - cookieX)<=100){
			if(Math.abs(tortoiseLocationY - cookieY)<=100){
			setBackgroundColor(Color.yellow);
			}
		}
		if(Math.abs(tortoiseLocationX - cookieX)<=50){
			if(Math.abs(tortoiseLocationY - cookieY)<=50){
			setBackgroundColor(Color.orange);
			}
		}
		
		if(Math.abs(tortoiseLocationX - cookieX)<=20){
			if(Math.abs(tortoiseLocationY - cookieY)<=20){
			setBackgroundColor(Color.red);
			}
		}
		if(Math.abs(tortoiseLocationX - cookieX)>100){
			
			setBackgroundColor(color);
			}
if(Math.abs(tortoiseLocationY - cookieY)>100){
			
			setBackgroundColor(color);
			}

		
		if(Math.abs(tortoiseLocationX - cookieX)<=5){
			if(Math.abs(tortoiseLocationY - cookieY)<=5){
				JOptionPane.showMessageDialog(null, "You found the cookie, now you don't die! :D");
				System.exit(0);
			}
		}
		
				
		// 11. If more than 20 seconds have elapsed, tell them the turtle died of hunger!
		if(getTimeElapsed()>=20){
			for (int i = 0; i < 40; i++) {
			
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			JLabel label = new JLabel();
			label.setText("FAILURE");
			label.setFont(label.getFont().deriveFont(32.0f));
			panel.add(label);
			frame.add(panel);
			frame.setVisible(true);
			frame.setLocation((new Random().nextInt(1500))+150,(new Random().nextInt(700))+150);
			Thread.sleep(30);
			}
		}

		// 12. If the Tortoise crosses it's own path, tell them they failed and move them back to the beginning

	}
	
	private long getTimeElapsed() {
		 Date currentTime = new Date();
		 return (currentTime.getTime() - startTime.getTime())/1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/*********************** don't worry about the stuff under here ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		TurtlePond feeder = new TurtlePond();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(PenColors.Purples.DarkMagenta);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}



