package Guia_8_REL_Ejercicio_Extra_02;


public class Client {
    private String name;
    private String surname;
    private Long dni;
    private String mail;
    private String address;
    private Long celphone;

    public Client() {
    }

    public Client(String name, String surname, Long dni, String mail, String address, Long celphone) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.mail = mail;
        this.address = address;
        this.celphone = celphone;
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

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCelphone() {
        return celphone;
    }

    public void setCelphone(Long celphone) {
        this.celphone = celphone;
    }

}
