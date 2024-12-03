public class Etape1 {
    private boolean code;
    private boolean carte;



    public Etape1(boolean code, boolean carte) {
        this.code = code;
        this.carte = carte;

    }
    // Getters

    public boolean isCode() {
        return code;
    }

    public boolean isCarte() {
        return carte;
    }

    // Methode
    public boolean ControleAcces() {
        if (code == true && carte == true) {
            System.out.println("l'acces vous est accordé");
            return true;
        } else if (code == false && carte == true) {

            return false;

        } else if (code == true && carte == false) {
            return false;
        } else {
            System.out.println("l'acces vous est reffusé");
        }return false;

    }
}







