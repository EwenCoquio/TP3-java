import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList mul3 = new ArrayList();
        String list;
        for(int i =0;i<100;i++){
            if(i%3==0){
                mul3.add(i);
            }
        }
        System.out.println("Liste des multiples de 3 : " + mul3);

        list = mul3.toString();
        System.out.println("Liste des multiples de 3 : " + list);
    }
}


