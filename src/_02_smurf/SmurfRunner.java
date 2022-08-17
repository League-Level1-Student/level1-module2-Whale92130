package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf smurf = new Smurf("Hardy");
		System.out.println(smurf.getName());
		smurf.eat();
		Smurf smurf1 = new Smurf("Papa");
		System.out.println(smurf1.getName());
		System.out.println(smurf1.isGirlOrBoy());
		System.out.println(smurf1.getHatColor());
		Smurf smurf2 = new Smurf("Smurfette");
		System.out.println(smurf2.getName());
		System.out.println(smurf2.isGirlOrBoy());
		System.out.println(smurf2.getHatColor());
	}

}
