package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		
		Pencil pencil = new Pencil();
		pencil.putInBackpack(pencil);
		Ruler ruler = new Ruler();
		ruler.putInBackpack(ruler);
		Textbook Textbook = new Textbook();
		Textbook.putInBackpack(Textbook);
		new Backpack().packAndCheck();
	}
}
