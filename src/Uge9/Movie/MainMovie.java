package Uge9.Movie;

public class MainMovie {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("Tis");
        myMovie.setDirector("Junes El-Sayed");
        myMovie.setDuration(150);


        System.out.println(myMovie.getMovieDetails());
    }
}
