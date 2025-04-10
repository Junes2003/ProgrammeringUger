package Uge9.Movie;

public class Movie {
    private String title;
    private String director;
    private double duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getMovieDetails() {
        return "Title: " + title + "\nDirector: " + director + "\nDuration: " + duration + " minutes";
    }
    }

