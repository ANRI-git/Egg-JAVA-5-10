package Guia_06_POO.Ejercicio_Extra_06;

public class Ahorcado {

    private char[] word;
    private Integer numC;
    private Integer plays;

    public Ahorcado() {
    }

    public Ahorcado(char[] word, Integer numC, Integer plays) {
        this.word = word;
        this.numC = numC;
        this.plays = plays;
    }

    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    public Integer getNumC() {
        return numC;
    }

    public void setNumC(Integer numC) {
        this.numC = numC;
    }

    public Integer getPlays() {
        return plays;
    }

    public void setPlays(Integer plays) {
        this.plays = plays;
    }

}
