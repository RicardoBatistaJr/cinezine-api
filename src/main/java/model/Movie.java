package model;

import org.springframework.stereotype.Component;

@Component
public class Movie {

    private String name;
    private String genre;
    private String description;

    public Movie(){};
    public Movie(String name, String genre, String description) {
        this.name = name;
        this.genre = genre;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
