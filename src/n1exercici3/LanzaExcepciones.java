package n1exercici3;

public class LanzaExcepciones {
    private int[] numeros;

    public LanzaExcepciones() {
        this.numeros = new int[] {};
    }

    public void throwsArrayIndexException() {
        int num = this.numeros[1];
    }
}
