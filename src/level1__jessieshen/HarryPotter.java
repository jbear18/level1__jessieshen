package level1__jessieshen;

public class HarryPotter {


		private boolean cloakOn;
		//constructor
		HarryPotter() {
			System.out.println("making Harry Potter...");
		}

		void castSpell(String spell){
	System.out.println("casting spell: " + spell);
		}

		void makeInvisible(boolean invisible) {
			this.cloakOn = invisible;
			
			if (cloakOn)
				System.out.println("Harry is invisible");
			else
				System.out.println("Harry is visible");
		}

		void spyOnSnape() {
			System.out.println("Harry sees Professor Snape doing nefarious things.");
		}


	}





