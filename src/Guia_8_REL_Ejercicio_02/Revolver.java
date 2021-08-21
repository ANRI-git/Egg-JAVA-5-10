package Guia_8_REL_Ejercicio_02;

public class Revolver {

    private Integer actPos;
    private Integer waterPos;

    public Revolver() {
    }

    public Revolver(Integer actPos, Integer waterPos) {
        this.actPos = actPos;
        this.waterPos = waterPos;
    }

    public Integer getActPos() {
        return actPos;
    }

    public void setActPos(Integer actPos) {
        this.actPos = actPos;
    }

    public Integer getWaterPos() {
        return waterPos;
    }

    public void setWaterPos(Integer waterPos) {
        this.waterPos = waterPos;
    }

}
