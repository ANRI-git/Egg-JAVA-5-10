package Guia_9_HER_Ejercicio_Extra_02;

public class SportCenter extends Building{

    private String name;
    private Boolean instalationType;

    public SportCenter() {
    }

    public SportCenter(String name, Boolean instalationType) {
        this.name = name;
        this.instalationType = instalationType;
    }

    public SportCenter(String name, Boolean instalationType, Double height, Double width, Double length) {
        super(height, width, length);
        this.name = name;
        this.instalationType = instalationType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getInstalationType() {
        return instalationType;
    }

    public void setInstalationType(Boolean instalationType) {
        this.instalationType = instalationType;
    }

    @Override
    public Double calculateSurface() {
        Double surface = this.width * this.length;
        return surface;
    }

    @Override
    public Double calculateVolume() {
        Double volume = this.width * this.length * this.height;
        return volume;
    }

    @Override
    public String toString() {
        return "Sport Center";
    }
    
}
