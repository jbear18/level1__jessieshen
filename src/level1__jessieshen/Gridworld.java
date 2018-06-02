package level1__jessieshen;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	

	World w = new World();
	w.show();
	Bug b= new Bug();
	Location locate= new Location(1, 7);
	w.add(locate, b);
	b.setColor(Color.BLUE);
	Bug a= new Bug();
	Location locate2= new Location(4, 5);
	w.add(locate2, a);
	
	int newDirection= 90;
	b.setDirection(newDirection);
	
	Flower f= new Flower();
	Flower f2= new Flower();
	Location l3= new Location(1, 6);
	w.add(l3, f);
	Location l4= new Location(1, 8);
	w.add(l4, f2);
		
	
}
}
