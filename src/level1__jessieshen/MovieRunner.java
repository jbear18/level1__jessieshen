package level1__jessieshen;

import javax.swing.JOptionPane;

public class MovieRunner {
	public static void main(String[] args) {
		
	
Movie infinitywar= new Movie("Avengers: Infinity War", 5);
Movie blackpanther= new Movie("Black Panther", 4);
Movie jumanji= new Movie("Jumanji: Welcome to the Jungle", 4);
Movie sherlock= new Movie("Sherlock Gnomes", 2);
Movie watchman= new Movie("The Movie Watchman", 1);

infinitywar.getTicketPrice();
JOptionPane.showMessageDialog(null,"Avengers: Infinity War. "+ infinitywar.getTicketPrice() );

blackpanther.getTicketPrice();
JOptionPane.showMessageDialog(null, "Black Panther. "+ blackpanther.getTicketPrice());

jumanji.getTicketPrice();
JOptionPane.showMessageDialog(null, "Jumanji: Welcome to the Jungle. " + jumanji.getTicketPrice());

sherlock.getTicketPrice();
JOptionPane.showMessageDialog(null, "Sherlock Gnomes. "+ sherlock.getTicketPrice());

watchman.getTicketPrice();
JOptionPane.showMessageDialog(null, "The Movie Watchman. " + watchman.getTicketPrice());


NetflixQueue netflix= new NetflixQueue();
netflix.addMovie(infinitywar);
netflix.addMovie(blackpanther);
netflix.addMovie(jumanji);
netflix.addMovie(sherlock);
netflix.addMovie(watchman);

netflix.printMovies();
netflix.getBestMovie();
	}
}
