public class Etape2 {
     enum etat{ debut,AccesAccorde,AccesReffuse,alarmeDeclancher }
     private etat etatCourant;

    public Etape2() {
        this.etatCourant =etat.debut ;
    }

    public void verification(boolean carteVrai,  boolean codeVrai){
        if(carteVrai==true&&codeVrai==true){
            System.out.println("Acces est accordé");

            this.etatCourant=etat.AccesAccorde;
        }
        else{
            this.etatCourant = etat.AccesReffuse;
            System.out.println("Acces est reffusé");


        }

    }

    public etat getEtatCourant() {
        return etatCourant;
    }

    public void declancherAlarme(){
        this.etatCourant = etat.alarmeDeclancher;
        System.out.println("vous etes au seuil de des tentatives.");
        System.out.println(" vous avez declanché l'alarme!!! ");
    }

}
