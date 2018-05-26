package level1__jessieshen;

public class SuperheroRunner {
public static void main(String[] args) {
Superhero hero= new Superhero("Ironman", "Gadgets");


System.out.println(hero);
System.out.println(hero.getName());
System.out.println(hero.getSuperpower());
hero.setPower("Flying");
System.out.println(hero.getSuperpower());


}}

