import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static void main(String [] args){

        Mediatheque objt = new Mediatheque();

            ArrayList<Ouvrage> e = new ArrayList<Ouvrage> (); 

            System.out.println( "BIENVENUE DANS LE MENU "); 
            System.out.println("Choisissez le numéro d'accès de votre choix");
            System.out.println(" 1. Ajouter un Ouvrage");
            System.out.println("2. Afficher les ouvrage");

            Scanner scanner = new Scanner(System.in);

            int i = scanner.nextInt();
            switch(i){

            case 1 :
                  objt.ajouteOuvrage(e);
                  break;

            case 2 : 

             objt.affiche_ouvrage(e);
            break;
            default :
                System.out.println("Choix invalide");
        }
    
    }
}
