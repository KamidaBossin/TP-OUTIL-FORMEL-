import static org.junit.Assert.assertTrue;

public class testez {

  private Etape1 spe = new Etape1(true,true);
  private Etape1 Spf = new Etape1(true,false);
  private Etape1 Spg = new Etape1(false,false);
  private Etape1 Sph = new Etape1(false,true);
    @org.junit.Test
    public void test1(){
        Etape2 mi = new Etape2();
        mi.verification(spe.isCarte(),spe.isCode());
        assertTrue("ACCES ACCORDE",mi.getEtatCourant()== Etape2.etat.AccesAccorde);
    }
   @org.junit.Test
    public void test2(){
        Etape2 mi = new Etape2();
        mi.verification(Spf.isCarte(),Spf.isCode());

        assertTrue("ACCES REFUSE",mi.getEtatCourant()== Etape2.etat.AccesReffuse);

    }
    @org.junit.Test
    public void test3(){
        Etape2 mi = new Etape2();
        mi.verification(Spg.isCarte(),Spg.isCode());
        assertTrue("ACCES REFUSE",mi.getEtatCourant()== Etape2.etat.AccesReffuse);
    }
    @org.junit.Test
    public void test4(){
        Etape2 mi = new Etape2();
        mi.verification(Sph.isCarte(),Sph.isCode());
        assertTrue("ACCES REFUSE",mi.getEtatCourant()== Etape2.etat.AccesReffuse);
    }
    @org.junit.Test
    public void test5(){
        Etape2 mi = new Etape2();
        mi.verification(Spf.isCarte(),Spf.isCode());
        if (mi.getEtatCourant()== Etape2.etat.AccesReffuse){
            mi.declancherAlarme();
        }
        assertTrue("alarme",mi.getEtatCourant()== Etape2.etat.alarmeDeclancher);

    }



}
