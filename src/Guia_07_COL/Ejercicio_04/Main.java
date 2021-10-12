package Guia_07_COL.Ejercicio_04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> mL = new ArrayList();
        Service serv = new Service();
        serv.menuMovie(mL);
        serv.showMovies(mL);
    }

}
