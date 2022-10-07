import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Collection C1 = new ArrayList();
        Collection C2 = new LinkedList();
        Collection C3 = new TreeSet();
        Collection C4 = new HashSet();

        System.out.println(collectionTest.testCollection(C1).toString(C1));
        //collectionTest.testCollection(C2);
        //collectionTest.testCollection(C3);
        //collectionTest.testCollection(C4);


        /*for (int i = 0; i < 9999; i++) {
            if (i % 3 == 0) {
                C1.add(i);

            }
        }
        System.out.println("Liste des multiples de 3 : " + C1.toString());*/

    }
}
