package Guia_08_REL.Ejercicio_04;


public class Card {
    private Integer number;
    private String suit;

    public Card() {
    }

    public Card(Integer number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return number + " of " + suit;
    }
    
    
}
