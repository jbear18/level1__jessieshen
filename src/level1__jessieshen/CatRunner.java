package level1__jessieshen;

public class CatRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
Cat c=new Cat("Sean");
		// 1. Make the Cat meow
c.meow();		
		// 2. Get the Cat to print it's name
c.printName();
		// 3. Kill the Cat!
for (int i = 0; i < 10; i++) {
	c.kill();
}
	}
}
