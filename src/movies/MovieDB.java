package movies;

import java.util.ArrayList;

public class MovieDB {

    private static ArrayList<Movie> allMovies = new ArrayList<>(100);
    
    public static ArrayList<Movie> getAllMovies() {
    	
        allMovies.add(new Movie("Citizen Kane", "drama"));
        allMovies.add(new Movie("Casablanca", "drama"));
        allMovies.add(new Movie("The Godfather", "drama"));
        allMovies.add(new Movie("Gone With The Wind", "drama"));
        allMovies.add(new Movie("Lawrence Of Arabia", "drama"));
        allMovies.add(new Movie("The Wizard Of Oz", "musical"));
        allMovies.add(new Movie("The Graduate", "drama"));
        allMovies.add(new Movie("On The Waterfront", "drama"));
        allMovies.add(new Movie("Schindler's List", "drama"));
        allMovies.add(new Movie("Singin' In The Rain", "musical"));
        allMovies.add(new Movie("It's A Wonderful Life", "drama"));
        allMovies.add(new Movie("Sunset Boulevard", "drama"));
        allMovies.add(new Movie("The Bridge On The River Kwai", "drama"));
        allMovies.add(new Movie("Some Like It Hot", "drama"));
        allMovies.add(new Movie("Star Wars", "scifi"));
        allMovies.add(new Movie("All About Eve", "drama"));
        allMovies.add(new Movie("The African Queen", "drama"));
        allMovies.add(new Movie("Psycho", "horror"));
        allMovies.add(new Movie("Chinatown", "drama"));
        allMovies.add(new Movie("One Flew Over The Cuckoo's Nest", "drama"));
        allMovies.add(new Movie("The Grapes Of Wrath", "drama"));
        allMovies.add(new Movie("2001: A Space Odyssey", "scifi"));
        allMovies.add(new Movie("The Maltese Falcon", "drama"));
        allMovies.add(new Movie("Raging Bull", "drama"));
        allMovies.add(new Movie("E.T. The extra-terrestrial", "scifi"));
        allMovies.add(new Movie("Dr. Strangelove", "drama"));
        allMovies.add(new Movie("Bonnie And Clyde", "drama"));
        allMovies.add(new Movie("Apocalypse Now", "drama"));
        allMovies.add(new Movie("Mr. Smith Goes to Washington", "drama"));
        allMovies.add(new Movie("The Treasure Of The Sierra Madre", "drama"));
        allMovies.add(new Movie("Annie Hall", "comedy"));
        allMovies.add(new Movie("The Godfather Part II", "drama"));
        allMovies.add(new Movie("High Noon", "drama"));
        allMovies.add(new Movie("To Kill A Mockingbird", "drama"));
        allMovies.add(new Movie("It Happened One Night", "drama"));
        allMovies.add(new Movie("Midnight Cowboy", "drama"));
        allMovies.add(new Movie("The Best Years Of Our Lives", "drama"));
        allMovies.add(new Movie("Double Indemnity", "drama"));
        allMovies.add(new Movie("Doctor Zhivago", "drama"));
        allMovies.add(new Movie("North By Northwest", "drama"));
        allMovies.add(new Movie("West Side Story", "musical"));
        allMovies.add(new Movie("Rear Window", "drama"));
        allMovies.add(new Movie("King Kong", "horror"));
        allMovies.add(new Movie("The Birth Of A Nation", "drama"));
        allMovies.add(new Movie("A Streetcar Named Desire", "drama"));
        allMovies.add(new Movie("A Clockwork Orange", "scifi"));
        allMovies.add(new Movie("Taxi Driver", "drama"));
        allMovies.add(new Movie("Jaws", "horror"));
        allMovies.add(new Movie("Snow White And The Seven Dwarfs", "animated"));
        allMovies.add(new Movie("Butch Cassidy And The Sundance Kid", "drama"));
        allMovies.add(new Movie("The Philadelphia Story", "drama"));
        allMovies.add(new Movie("From Here To Eternity", "drama"));
        allMovies.add(new Movie("Amadeus", "drama"));
        allMovies.add(new Movie("All Quiet On The Western Front", "drama"));
        allMovies.add(new Movie("The Sound Of Music", "musical"));
        allMovies.add(new Movie("M*A*S*H", "comedy"));
        allMovies.add(new Movie("The Third Man", "drama"));
        allMovies.add(new Movie("Fantasia", "animated"));
        allMovies.add(new Movie("Rebel Without A Cause", "drama"));
        allMovies.add(new Movie("Raiders Of The Lost Ark", "drama"));
        allMovies.add(new Movie("Vertigo", "drama"));
        allMovies.add(new Movie("Tootsie", "comedy"));
        allMovies.add(new Movie("Stagecoach", "drama"));
        allMovies.add(new Movie("Close Encounters Of The Third Kind", "scifi"));
        allMovies.add(new Movie("The Silence Of The Lambs", "horror"));
        allMovies.add(new Movie("Network", "drama"));
        allMovies.add(new Movie("The Manchurian Candidate", "drama"));
        allMovies.add(new Movie("An American In Paris", "drama"));
        allMovies.add(new Movie("Shane", "drama"));
        allMovies.add(new Movie("The French Connection", "drama"));
        allMovies.add(new Movie("Forrest Gump", "drama"));
        allMovies.add(new Movie("Ben-Hur", "drama"));
        allMovies.add(new Movie("Wuthering Heights", "drama"));
        allMovies.add(new Movie("The Gold Rush", "drama"));
        allMovies.add(new Movie("Dances With Wolves", "drama"));
        allMovies.add(new Movie("City Lights", "drama"));
        allMovies.add(new Movie("American Graffiti", "drama"));
        allMovies.add(new Movie("Rocky", "drama"));
        allMovies.add(new Movie("The Deer Hunter", "drama"));
        allMovies.add(new Movie("The Wild Bunch", "drama"));
        allMovies.add(new Movie("Modern Times", "drama"));
        allMovies.add(new Movie("Giant", "drama"));
        allMovies.add(new Movie("Platoon", "drama"));
        allMovies.add(new Movie("Fargo", "drama"));
        allMovies.add(new Movie("Duck Soup", "comedy"));
        allMovies.add(new Movie("Mutiny On The Bounty", "drama"));
        allMovies.add(new Movie("Frankenstein", "horror"));
        allMovies.add(new Movie("Easy Rider", "drama"));
        allMovies.add(new Movie("Patton", "drama"));
        allMovies.add(new Movie("The Jazz Singer", "drama"));
        allMovies.add(new Movie("My Fair Lady", "musical"));
        allMovies.add(new Movie("A Place In The Sun", "drama"));
        allMovies.add(new Movie("The Apartment", "drama"));
        allMovies.add(new Movie("Goodfellas", "drama"));
        allMovies.add(new Movie("Pulp Fiction", "drama"));
        allMovies.add(new Movie("The Searchers", "drama"));
        allMovies.add(new Movie("Bringing Up Baby", "drama"));
        allMovies.add(new Movie("Unforgiven", "drama"));
        allMovies.add(new Movie("Guess Who's Coming To Dinner", "drama"));
        allMovies.add(new Movie("Yankee Doodle Dandy", "musical"));
        
        return allMovies;
    }
    
    public static ArrayList<Movie> getMovies(String category) {
        ArrayList<Movie> movies = new ArrayList<>();
        for (Movie m : allMovies) {            
            if (m.getCategory().equalsIgnoreCase(category)) {
                movies.add(m);
            }
        }
        return movies;
    }    
}