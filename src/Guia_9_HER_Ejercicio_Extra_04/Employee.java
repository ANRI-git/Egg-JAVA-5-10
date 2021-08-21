package Guia_9_HER_Ejercicio_Extra_04;

public class Employee extends Person{
    private Integer year;
    private Integer dispatchNum;

    public Employee() {
    }

    public Employee(Integer year, Integer dispatchNum) {
        this.year = year;
        this.dispatchNum = dispatchNum;
    }

    public Employee(Integer year, Integer dispatchNum, String name, String Surname, Long ID, String CivilStatus) {
        super(name, Surname, ID, CivilStatus);
        this.year = year;
        this.dispatchNum = dispatchNum;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getDispatchNum() {
        return dispatchNum;
    }

    public void setDispatchNum(Integer dispatchNum) {
        this.dispatchNum = dispatchNum;
    }    
    
}
