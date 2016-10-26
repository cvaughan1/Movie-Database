package movies;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieListApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Movie List Application\n");

        ArrayList<Movie> allMovies = MovieDB.getAllMovies();

        System.out.println("There are " + allMovies.size() + 
                " movies in the list.\n");

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String category = Console.getRequiredString(
                    "What category are you interested in? ");
            System.out.println();
            // to access Movie DB class to get categories
            ArrayList<Movie> movies = MovieDB.getMovies(category);
            
            for (Movie m : movies) {
                System.out.println(m.getTitle());
            }
            System.out.println();
            
            choice = Console.getChoice("Continue? (y/n): ", "y", "n");
            System.out.println();            
        }
    }
}