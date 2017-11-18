package level1__jessieshen;

public class Cat {


		private String name;
		private int lives = 9;

		Cat(String name) {
			this.name = name;
		}

		void meow() {
			System.out.println("meeeeeooooooooooowwwwwwwww!!");
		}

		public void printName() {
			if (name == null)
				System.out.println("i don't know my own name!");
			else
				System.out.println("My name is " + name);
		}

		void kill() {
			lives--;
			if (lives > 0)
				System.out.println("Nice try, but I still have " + lives + " lives left");
			else if (lives < 0)
				System.out.println("That's overkill yo!");
			else
				System.out.println("DEAD CAT :(");
		}

	
	}



