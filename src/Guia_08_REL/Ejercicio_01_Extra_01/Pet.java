package Guia_8_REL_Ejercicio_01_Extra_01;

public class Pet {

    private String name;
    private Integer age;
    private String race;
    private Double size;
    private Boolean adopted;

    public Pet() {
        adopted = false;
    }

    public Pet(String name, Integer age, String race, Double size, Boolean adopted) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.size = size;
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Boolean getAdopted() {
        return adopted;
    }

    public void setAdopted(Boolean adopted) {
        this.adopted = adopted;
    }

}
