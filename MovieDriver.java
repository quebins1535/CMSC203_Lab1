import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		// New Scanner Object
		Scanner input = new Scanner(System.in);
		
		// New Movie Object
		Movie movieInfo = new Movie();
		
		String answer = "y";
		
		do {
			
		// Ask user for the title of the movie
		System.out.print("Enter the name of a movie: ");
		String movieName = input.nextLine();
		
		// Set the name of the movie
		movieInfo.setTitle(movieName);
		
		// Ask user for the rating of the movie
		System.out.print("Enter the rating of the movie: ");
		String movieRating = input.nextLine();
		
		// Set the rating of the movie
		movieInfo.setRating(movieRating);
		
		// Ask user for the number of tickets sold
		System.out.print("Enter the number of tickets sold for this movie: ");
		int ticketsSold = input.nextInt();
			
		// Set the number of tickets sold for the movie
		movieInfo.setSoldTickets(ticketsSold);
		
		// Display the information of the movie
		System.out.println(movieInfo.toString());
		
		// Ask user if they want to repeat loop
		System.out.print("Do you want to enter another? (y or n) ");
		answer = input.next();
		input.nextLine();
		
		} while(answer.equalsIgnoreCase("y"));
		
		
		System.out.print("\nGoodbye...");
		input.close();
		System.exit(0);

	}

}
