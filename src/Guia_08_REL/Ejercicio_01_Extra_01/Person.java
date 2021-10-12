package Guia_8_REL_Ejercicio_01_Extra_01;

import java.util.LinkedHashSet;
import java.util.Objects;


public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Long document;
    private LinkedHashSet<Pet> pets = new LinkedHashSet();

    public Person() {
    }

    public Person(String name, String surname, Integer age, Long document) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

    public LinkedHashSet<Pet> getPets() {
        return pets;
    }

    public void setPets(LinkedHashSet<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.surname);
        hash = 79 * hash + Objects.hashCode(this.age);
        hash = 79 * hash + Objects.hashCode(this.document);
        hash = 79 * hash + Objects.hashCode(this.pets);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.document, other.document)) {
            return false;
        }
        if (!Objects.equals(this.pets, other.pets)) {
            return false;
        }
        return true;
    }
    
}
