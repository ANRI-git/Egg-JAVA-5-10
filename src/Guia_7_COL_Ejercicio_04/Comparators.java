package Guia_7_COL_Ejercicio_04;

import java.util.Comparator;


public class Comparators {
    public static Comparator<Movie> sortMaxLength = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t1.getLength().compareTo(t.getLength());
        }
    };
    public static Comparator<Movie> sortMinLength = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t.getLength().compareTo(t1.getLength());
        }
    };
    public static Comparator<Movie> sortTitle = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t.getTitle().compareTo(t1.getTitle());
        }
    };
    public static Comparator<Movie> sortDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie t, Movie t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

}
