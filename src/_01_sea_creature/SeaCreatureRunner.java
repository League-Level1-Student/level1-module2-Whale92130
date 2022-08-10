package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature creature = new SeaCreature("Spongebob");
		SeaCreature creature1 = new SeaCreature("Patrick");
		SeaCreature creature2 = new SeaCreature("Squidward");
		creature.eat();
		creature.laugh();
		System.out.println(creature1.getName());
		System.out.println(creature2.getName());
		creature1.eat();
		creature1.laugh();
		creature2.eat();
		creature2.laugh();
	}

}
