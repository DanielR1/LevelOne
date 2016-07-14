import javax.swing.JOptionPane;

public class SpongeBobRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("Spongebob");
	SeaCreature patrick = new SeaCreature("Patrick");
	SeaCreature squidward = new SeaCreature("Squidward");
	String lol = JOptionPane.showInputDialog("Which is your favorite spongebob character?");
	if(lol.equalsIgnoreCase("spongebob")){
		JOptionPane.showMessageDialog(null, "Well you won't like spongebob anymore! >:D");
		for (int i = 0; i < 10000; i++) {
			spongebob.laugh();
		}
	}
		if(lol.equalsIgnoreCase("patrick")){
			JOptionPane.showMessageDialog(null, "Well you won't like patrick anymore! >:D");
			for (int i = 0; i < 10000; i++) {
				patrick.laugh();
			}
		}
			if(lol.equalsIgnoreCase("squidward")){
				JOptionPane.showMessageDialog(null, "Well you won't like squidward anymore! >:D");
				for (int i = 0; i < 10000; i++) {
					squidward.laugh();
				}
			}
	spongebob.eat();
	spongebob.laugh();
	
	
	System.out.println(patrick.getName());
	patrick.eat();
	patrick.laugh();

	System.out.println(squidward.getName());
	squidward.eat();
	squidward.laugh();
	
	}
		}


