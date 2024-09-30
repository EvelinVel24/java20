import java.util.ArrayList;

public class RentalManager {
    private ArrayList<Movie> movies;

    public RentalManager() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void rentMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title) && !movie.isRented()) {
                movie.rent();
                System.out.println("Película arrendada: " + movie);
                return;
            }
        }
        System.out.println("Película no disponible.");
    }

    public void returnMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title) && movie.isRented()) {
                movie.returnMovie();
                System.out.println("Película devuelta: " + movie);
                return;
            }
        }
        System.out.println("Película no está arrendada.");
    }

    public void listMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
