
public class SmurfRunner {
public static void main(String[] args) {
	/* 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
		 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
		 *
		 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
		 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
	Smurf handy = new Smurf("Handy", "White", "Boy");
	String name = handy.getName();
	System.out.println(name);
	handy.eat();
	String hatcolor = handy.getHatColor();
	System.out.println(hatcolor+" hat");
	String gender = handy.isGirlOrBoy();
	System.out.println(gender);
	Smurf papa = new Smurf("Papa","Red", "Hybrid");
	String name1 = papa.getName();
	System.out.println(name1);
	papa.eat();
	String hatcolor1 = papa.getHatColor();
	System.out.println(hatcolor1+" hat");
	String gender1 = papa.isGirlOrBoy();
	System.out.println(gender1);
	Smurf Smurfette = new Smurf("Smurfette","Disco", "Girl");
	String name2 = Smurfette.getName();
	System.out.println(name2);
	Smurfette.eat();
	String hatcolor2 = Smurfette.getHatColor();
	System.out.println(hatcolor2+" hat");
	String gender2 = Smurfette.isGirlOrBoy();
	System.out.println(gender2);
	
	
	
	
}
}
