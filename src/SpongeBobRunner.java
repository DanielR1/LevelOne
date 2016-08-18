
public class SpongebobRunner {
public static void main(String[] args) {
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	
	Spongebob.eat();
	Spongebob.laugh();
	
	SeaCreature Patrick = new SeaCreature("Patrick");
	String a = Patrick.getName();
	System.out.println(a);
	Patrick.eat();
	Patrick.laugh();
	SeaCreature Squidward = new SeaCreature("Squidward");
	String b = Squidward.getName();
	System.out.println(b);
	Squidward.eat();
	Squidward.laugh();
	
}
}
