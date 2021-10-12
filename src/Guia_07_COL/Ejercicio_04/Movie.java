package Guia_07_COL.Ejercicio_04;


public class Movie {
    private String title;
    private String director;
    private Double length;

    public Movie() {
    }

    public Movie(String title, String director, Double length) {
        this.title = title;
        this.director = director;
        this.length = length;
    }

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

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    
}
