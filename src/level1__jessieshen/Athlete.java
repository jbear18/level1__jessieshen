package level1__jessieshen;

public class Athlete {
	// static means just 1
	String name;
	int speed;
	static int runnerCount;
	int shirtNumber;
	String location= "Del Mar fairgrounds";
	static int raceTime;
	// constructor

	public Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		runnerCount++;
		shirtNumber=runnerCount;
	
	}

	public static void main(String[] args) {
		Athlete sean = new Athlete("Sean", 1000);
		Athlete john = new Athlete("John", 1002);
		Athlete jessie = new Athlete("Jessie", 1000000);
		System.out.println(sean.name + " has shirt number " + sean.shirtNumber);
		System.out.println(john.name + " has shirt number " + john.shirtNumber);
		System.out.println(jessie.name + " has shirt number " + jessie.shirtNumber);
		System.out.println("There are " + Athlete.runnerCount + " people in the race");
		System.out.println(sean.name+ " is running at "+ sean.location);
		System.out.println(john.name+ " is running at "+ john.location);
		System.out.println(jessie.name+ " is running at "+ jessie.location);
		sean.location= "Penguintown";
		System.out.println(sean.name+ " is running at "+ sean.location);
		System.out.println(john.name+ " is running at "+ john.location);
		System.out.println(jessie.name+ " is running at "+ jessie.location);
	}

}
