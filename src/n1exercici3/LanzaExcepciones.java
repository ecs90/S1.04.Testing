package n1exercici3;

public class LanzaExcepciones {
    int[] numeros;

    public LanzaExcepciones() {
        this.numeros = new int[] {};
    }

    public void throwsArrayIndexException() {
        int num = this.numeros[1];
    }
}
