import java.util.*;

public class Annuaire {
    static Map<Integer,Contact> annuaire;
    static Contact res;

    public static void main(String[]args){
        String nom;
        String num;
        String mail;
        Boolean next = true;
        annuaire=new HashMap<Integer,Contact>();
        while(next) {
            ajouter();
            afficher();
        }
    }

    Annuaire(){//Petit constructeur des familles
        annuaire=new HashMap<Integer,Contact>();
    }

    public static void ajouter(){

        Scanner in=new Scanner(System.in);
        System.out.println("Combien de contact voulez-vous ajouter ?");
        int n=in.nextInt();
        in.nextLine();
        for(int i=1;i<=n;i++) {

            System.out.println("Nom du contact :");
            nom=in.nextLine();

            System.out.println("Numero du contact :");
            num=in.nextLine();

            System.out.println("Adresse mail du contact :");
            mail=in.nextLine();

            in.nextLine();

            Contact c=new Contact(nom,num,mail);
            annuaire.put(i, c);
        }
    }

    public static void afficher() {
        for(int i=1;i<=annuaire.size();i++) {
            System.out.println("Nom:"+annuaire.get(i).getName()+" Numero de téléphone: "+annuaire.get(i).getPhoneNumber()+" Adresse mail: "+annuaire.get(i).getEmail());
        }
    }

    public static Contact lookupContact(String nom){
        for(int i=1;i<=annuaire.size();i++) {
            if(annuaire.get(i).getName()==nom) {
                res=annuaire.get(i);
            }
        }
        return res;
    }

    public static String lookupByNumero(String numTel) {
        String res = null;
        for(int i=1;i<=annuaire.size();i++) {
            if(annuaire.get(i).getPhoneNumber()==numTel) {
                res=annuaire.get(i).getName();
            }
        }
        return res;
    }
}

