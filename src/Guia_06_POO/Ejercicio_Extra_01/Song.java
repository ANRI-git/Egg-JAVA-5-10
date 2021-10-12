package Guia_06_POO.Ejercicio_Extra_01;


public class Song {
    private String autor;
    private String title;

    public Song() {
    }

    public Song(String autor, String title) {
        this.autor = autor;
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
