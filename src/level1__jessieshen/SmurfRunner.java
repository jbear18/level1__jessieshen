package level1__jessieshen;

public class SmurfRunner {
	/* 
	 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 * 
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
	 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
	
	
	
	public static void main(String[] args) {
		Smurf s=new Smurf("Handy");
			System.out.println(s.getName());
		s.eat();
	System.out.println(s.getHatColor());	
		Smurf p=new Smurf("Papa");

	System.out.println(p.getName());	
	System.out.println(p.getHatColor());
	System.out.println(p.isGirlOrBoy());
	
	
	Smurf fe=new Smurf("Smurfette");
	System.out.println(fe.getName());
	System.out.println(fe.getHatColor());
	System.out.println(fe.isGirlOrBoy());
	
		
	}
}
