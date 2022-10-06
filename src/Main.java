import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Collection C1 = new ArrayList();
        Collection C2 = new LinkedList();
        Collection C3 = new TreeSet();
        Collection C4 = new HashSet();

        collectionTest.testCollection(C1);
        collectionTest.testCollection(C2);
        collectionTest.testCollection(C3);
        collectionTest.testCollection(C4);
    }
}


