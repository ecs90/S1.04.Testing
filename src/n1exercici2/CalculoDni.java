package n1exercici2;

public class CalculoDni {
    private int number;
    private Character lletra;
    private static final String LISTA_LETRA_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public CalculoDni(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Character getLletra() {
        return lletra;
    }

    public void calcularLletra(){
        int resto = this.number%23;
        /*switch (resto){
            case 0:
                lletra = 'T';
                break;
            case 1:
                lletra = 'R';
                break;
            case 2:
                lletra = 'W';
                break;
            case 3:
                lletra = 'A';
                break;
            case 4:
                lletra = 'G';
                break;
            case 5:
                lletra = 'M';
                break;
            case 6:
                lletra = 'Y';
                break;
            case 7:
                lletra = 'F';
                break;
            case 8:
                lletra = 'P';
                break;
            case 9:
                lletra = 'D';
                break;
            case 10:
                lletra = 'X';
                break;
            case 11:
                lletra = 'B';
                break;
            case 12:
                lletra = 'N';
                break;
            case 13:
                lletra = 'J';
                break;
            case 14:
                lletra = 'Z';
                break;
            case 15:
                lletra = 'S';
                break;
            case 16:
                lletra = 'Q';
                break;
            case 17:
                lletra = 'V';
                break;
            case 18:
                lletra = 'H';
                break;
            case 19:
                lletra = 'L';
                break;
            case 20:
                lletra = 'C';
                break;
            case 21:
                lletra = 'K';
                break;
            case 22:
                lletra = 'E';
                break;
        }*/
        lletra = LISTA_LETRA_DNI.charAt(resto);
    }
}
