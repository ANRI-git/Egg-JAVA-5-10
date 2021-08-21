package Guia_6_POO.Ejercicio_05;

import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    
//    public void crearCuenta(Cuenta c){
          //Método ingresando solo DNI
//        System.out.println("Creando su cuenta:");
//        c.setNumeroCuenta((int) (Math.random()*100000));
//        System.out.println("Número de cuenta: "+c.getNumeroCuenta());
//        System.out.println("Ingrese su DNI:");
//        c.setDNI(sc.nextLong());
//        c.setSaldo(0.0);
//        System.out.println("Saldo actual: "+ Math.round(c.getSaldo()));
//    }
    
    public void crearCuenta(Cuenta c){
        //Metodo ingresando los valores
        System.out.println("Ingrese su número de cuenta: ");
        c.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese su DNI:");
        c.setDNI(sc.nextLong());
        System.out.println("Ingrese su saldo actual: ");
        c.setSaldo(sc.nextDouble());
    }
    
    public void ingresar(Cuenta c){
        System.out.println("¿Cuanto desea ingresar?:");
        Double ingresar = sc.nextDouble();
        c.setSaldo(c.getSaldo()+ingresar);
        System.out.println("Su nuevo saldo es: "+ c.getSaldo());
    }
    
    public void retirar(Cuenta c){
        if (c.getSaldo()==0.0){
            System.out.println("No tiene fondos suficientes, primero ingrese din"
                    + "ero a su cuenta:");
        }
        else{
            System.out.println("¿Cuento desea retirar?:");
            Double retirar = sc.nextDouble();
            if (c.getSaldo()<retirar){
                System.out.println("No tiene fondos suficientes, se retirarán "+
                        c.getSaldo());
                c.setSaldo(0.0);
                System.out.println("Saldo: "+ c.getSaldo());
                
            }
            else{
                c.setSaldo(c.getSaldo()-retirar);
                System.out.println("Su nuevo saldo es: "+ c.getSaldo());
            }
        }
    }
    
    public void extraccionRapida(Cuenta c){
        if (c.getSaldo()==0.0){
            System.out.println("No tiene fondos suficientes, primero ingrese din"
                    + "ero a su cuenta:");
        }
        else{
            System.out.println("Extracción rápida, ¿Cuanto desea retirar?:");
            System.out.println("Dinero disponible para retiro rápido: "+ 
                    c.getSaldo()*0.2);
            Double retirar;
            Double saldo = c.getSaldo()*0.2;
            do{
                retirar = sc.nextDouble();
                System.out.println(retirar);
                if (retirar<=(c.getSaldo()*0.2)&&c.getSaldo()>0&&retirar!=0.0){
                    c.setSaldo(c.getSaldo()-retirar);
                    System.out.println("Su nuevo saldo es: "+ c.getSaldo());
                }
                else{
                    System.out.println("La cantidad ingresada es incorrecta, int"
                            + "ente nuevamente:");
                }
            }while(retirar>saldo||retirar==0.0);
        }
        
    }
    
    public void consultarSaldo(Cuenta c){
        System.out.println("Consultando saldo:");
        System.out.println("Su saldo es: "+ c.getSaldo());
    }
    
    public void consultarDatos(Cuenta c){
        System.out.println("Consultando datos:");
        System.out.println("Datos:\nN° cuenta: "+c.getNumeroCuenta()+"\nDNI: "+c
                .getDNI()+"\nSaldo: "+c.getSaldo());
    }
}
