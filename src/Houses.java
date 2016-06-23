import java.awt.Color;
import java.util.Random;
import java.util.Set;

import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.getBackgroundWindow().setColor(Color.BLACK);
		Tortoise.setX(0);
		Tortoise.setY(435);
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(5);
		Tortoise.turn(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(21);
		Tortoise.turn(-90);
		
		
	
			
		
		building("small", Color.red);
		building("medium", Color.orange);
		building("large", Color.yellow);
		building("medium",Color.cyan);
		building("small", Color.blue);
		building("medium", Color.pink);
		building("large",Color.red);
		building("medium",Color.yellow);
		building("medium", Color.blue);
		building("small", Color.GRAY);


	}

	private static void building(String heighttype, Color color) {
		int height = new Random().nextInt(150);
		if(heighttype.equalsIgnoreCase("small")){
			Tortoise.setPenColor(color);
			Tortoise.move(height);
			drawPointyRoof();
			Tortoise.move(height);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(20);
			Tortoise.turn(-90);

		}
		if(heighttype.equalsIgnoreCase("medium")){
			height +=150;
			Tortoise.setPenColor(color);
			Tortoise.move(height);
			drawPointyRoof();
			Tortoise.move(height);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(20);
			Tortoise.turn(-90);

		}
		if(heighttype.equalsIgnoreCase("big")){
			height = new Random().nextInt(145);
			height +=300;
			Tortoise.setPenColor(color);
			Tortoise.move(height);
			drawFlatRoof();
			Tortoise.move(height);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(20);
			Tortoise.turn(-90);

		}
		if(heighttype.equalsIgnoreCase("large")){
			height = new Random().nextInt(145);
			height +=300;
			Tortoise.setPenColor(color);
			Tortoise.move(height);
			drawFlatRoof();
			Tortoise.move(height);
			Tortoise.turn(-90);
			Tortoise.setPenColor(Color.green);
			Tortoise.move(20);
			Tortoise.turn(-90);

		}
				
	}

	private static void drawPointyRoof() {
		Tortoise.turn(45);
		Tortoise.move(29);
		Tortoise.turn(90);
		Tortoise.move(29);
		Tortoise.turn(45);
	}
	private static void drawFlatRoof(){
		Tortoise.turn(90);
		Tortoise.move(40);
		Tortoise.turn(90);
	}

}
