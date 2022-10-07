import java.util.*;
import java.lang.*;


public class Mesure {
    private long temps_ajout;
    private long memoire_ajout;
    private long temps_total;
    private long memoire_totale;
    private int val100;

    Mesure() {
    }


    public void setTemps_ajout(long temps_ajout) {
        this.temps_ajout = temps_ajout;
    }


    public void setMemoire_ajout(long memoire_ajout) {
        this.memoire_ajout = memoire_ajout;
    }


    public void setTemps_total(long temps_total) {
        this.temps_total = temps_total;
    }


    public void setMemoire_totale(long memoire_totale) {
        this.memoire_totale = memoire_totale;
    }


    public void setVal100(int val100) {
        this.val100 = val100;
    }

    public String toString(Collection C) {
        return "Collection = " + C.getClass() + "\n Temps ajout = " + this.temps_ajout + "\n temps total = " + this.temps_total + "\n ----" +
                "\n Memoire ajout = " + this.memoire_ajout + "\n Memoire totale = " + this.memoire_totale + "\n 100e valeur = " + this.val100 + "\n ---------------------";
    }
}
