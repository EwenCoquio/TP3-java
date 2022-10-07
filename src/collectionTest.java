import java.util.*;
import java.lang.*;

public class collectionTest {



    public static Mesure testCollection(Collection C) {
        Mesure testmes = new Mesure();
        long start = System.currentTimeMillis();
        long startMemory = Runtime.getRuntime().totalMemory();
        for (int i = 0; i < 999999; i++) {
            if (i % 3 == 0) {
                C.add(i);
                //System.out.println("Liste des multiples de 3 : " + C.toString());
            }
        }
        long mid = System.currentTimeMillis();
        testmes.setTemps_ajout(mid - start);
        long midMemory = Runtime.getRuntime().freeMemory();
        testmes.setMemoire_ajout(startMemory - midMemory);
        int val = (int) C.toArray()[99];
        testmes.setVal100(val);
        Iterator test = C.iterator();
        while(test.hasNext()){
            test.next();
            test.remove();
            //System.out.println("Liste des multiples de 3 : " + C.toString());
        }
        long end = System.currentTimeMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        testmes.setTemps_total(end-start);
        testmes.setMemoire_totale(startMemory - endMemory);
        return testmes;
    }
}
