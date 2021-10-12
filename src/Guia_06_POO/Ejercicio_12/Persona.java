package Guia_06_POO.Ejercicio_12;

import java.time.LocalDate;
import java.util.Date;


public class Persona {
    private String name;
    private LocalDate nac;
    private Integer age;
    
    public Persona() {
    }

    public Persona(String name, LocalDate nac) {
        this.name = name;
        this.nac = nac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNac() {
        return nac;
    }

    public void setNac(LocalDate nac) {
        this.nac = nac;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}
