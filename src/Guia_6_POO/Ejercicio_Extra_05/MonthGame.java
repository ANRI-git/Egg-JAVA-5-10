package Guia_6_POO.Ejercicio_Extra_05;

public class MonthGame {

    private String[] month = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
//    private String[] month = {"batman", "catwoman", "batwoman", "robin", "nightwing", "bane", "ivy"};
    private String secreteMonth;

    public MonthGame() {
    }

    public MonthGame(String[] month, String secreteMonth) {
        this.month = month;
        this.secreteMonth = secreteMonth;
    }

    public String[] getMonth() {
        return month;
    }

    public void setMonth(String[] month) {
        this.month = month;
    }

    public String getSecreteMonth() {
        return secreteMonth;
    }

    public void setSecreteMonth(String secreteMonth) {
        this.secreteMonth = secreteMonth;
    }

}
