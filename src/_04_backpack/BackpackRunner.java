package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		
		Backpack backpack = new Backpack();
		Pencil pencil = new Pencil();
		backpack.putInBackpack(pencil);
		Ruler ruler = new Ruler();
		backpack.putInBackpack(ruler);
		Textbook textbook = new Textbook();
		backpack.putInBackpack(textbook);
		
		backpack.packAndCheck();
	}
}
