package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public  String country;
    public  String title;
    public  String genre;
    public  String releaseDate;
    public  String director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        casts=new ArrayList<>();
    }

    public void addCast(String cast){
        casts.add(cast);
    }
    public void addCasts(String[] newCasts){casts.addAll(Arrays.asList(newCasts));}


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
