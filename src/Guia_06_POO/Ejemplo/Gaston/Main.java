package Guia_6_POO.Ejemplo.Gaston;

public class Main {

    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        Perro pNull = new Perro();
        Perro perro1 = new Perro("Messi", "Golden", 4);
        
//        servicio.pasear(perro1);
//        servicio.alimentar(perro1);

        System.out.println(pNull.toString());
        servicio.setearValores(pNull);
        System.out.println(pNull.toString());
        
        Perro perroAtrapado = servicio.crearPerro();
    }
    
}
