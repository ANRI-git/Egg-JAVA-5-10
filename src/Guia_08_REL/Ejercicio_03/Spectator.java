package Guia_8_REL_Ejercicio_03;

public class Spectator {

    private String name;
    private Integer age;
    private Double moneyAv;
    private String seat;

    public Spectator() {
    }

    public Spectator(String name, Integer age, Double moneyAv, String seat) {
        this.name = name;
        this.age = age;
        this.moneyAv = moneyAv;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoneyAv() {
        return moneyAv;
    }

    public void setMoneyAv(Double moneyAv) {
        this.moneyAv = moneyAv;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

}
