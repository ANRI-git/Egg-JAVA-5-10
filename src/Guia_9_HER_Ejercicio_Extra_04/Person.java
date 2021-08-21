package Guia_9_HER_Ejercicio_Extra_04;

public abstract class Person {
    protected String name;
    protected String Surname;
    protected Long ID;
    protected String CivilStatus;

    public Person() {
    }

    public Person(String name, String Surname, Long ID, String CivilStatus) {
        this.name = name;
        this.Surname = Surname;
        this.ID = ID;
        this.CivilStatus = CivilStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCivilStatus() {
        return CivilStatus;
    }

    public void setCivilStatus(String CivilStatus) {
        this.CivilStatus = CivilStatus;
    }
    
}
