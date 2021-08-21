package Guia_8_REL_Ejercicio_03;


public class Movie {
    private String title;
    private String director;
    private Double length;
    private Integer minAge;

    public Movie() {
    }

    public Movie(String title, String director, Double length, Integer minAge) {
        this.title = title;
        this.director = director;
        this.length = length;
        this.minAge = minAge;
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

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }
    
}
