package Guia_8_REL_Ejercicio_03;

import java.util.LinkedHashSet;

public class Cinema {

    private Movie movie;
    private LinkedHashSet<Spectator> room = new LinkedHashSet();
    private Double price;

    public Cinema() {
    }

    public Cinema(Movie movie, Double price) {
        this.movie = movie;
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LinkedHashSet<Spectator> getRoom() {
        return room;
    }

    public void setRoom(LinkedHashSet<Spectator> room) {
        this.room = room;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
