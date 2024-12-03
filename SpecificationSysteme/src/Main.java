import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner SC= new Scanner(System.in);


       System.out.println("veuillez entrer votre code svp !");
       String codeEntreprise = SC.next();

       boolean codeRecup =codeEntreprise.equals("mid_06");

       System.out.println("veuillez presenter la carte de l'entreprise");
       String carteEntreprise  = SC.next();



       boolean carteRecup =carteEntreprise.equals("ORANGE");

       Etape2 Automate = new Etape2();
       Automate.verification(carteRecup,codeRecup);



      int tentetiveEssais = 0;

          while ( Automate.getEtatCourant() == Etape2.etat.AccesReffuse&&tentetiveEssais<3) {
              System.out.println("veuillez entrer votre code svp !");
              codeEntreprise = SC.next();

              codeRecup = codeEntreprise.equals("mid_06");

              System.out.println("veuillez presenter la carte de l'entreprise");
              carteEntreprise = SC.next();


              carteRecup = carteEntreprise.equals("ORANGE");

              Automate = new Etape2();
              Automate.verification(carteRecup, codeRecup);
              tentetiveEssais++;

    }
          if (Automate.getEtatCourant() == Etape2.etat.AccesReffuse){
              Automate.declancherAlarme();
          }
    }
}