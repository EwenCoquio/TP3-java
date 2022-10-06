import java.util.*;
import java.lang.*;

public class collectionTest {
    public static void testCollection(Collection C) {
        System.out.println("Collection : " + C.getClass());
        long start = System.currentTimeMillis();
        long startMemory = Runtime.getRuntime().totalMemory();
        for (int i = 0; i < 999999; i++) {
            if (i % 3 == 0) {
                C.add(i);
                //System.out.println("Liste des multiples de 3 : " + C.toString());
            }
        }
        long mid = System.currentTimeMillis();
        long timeInter = mid - start;
        long midMemory = Runtime.getRuntime().totalMemory();
        long interMemory = startMemory - midMemory;
        System.out.println("temps ajout = " + timeInter);
        System.out.println("memoire utilisee pour l'ajout = " + interMemory);
        Iterator test = C.iterator();
        while(test.hasNext()){
            test.next();
            test.remove();
            //System.out.println("Liste des multiples de 3 : " + C.toString());
        }
        long end = System.currentTimeMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        long time = end-start;
        long memory = startMemory - endMemory;
        System.out.println("temps totale = " + time);
        System.out.println("memoire utilisee = " + memory);
        System.out.println("---------------------");
    }
}
