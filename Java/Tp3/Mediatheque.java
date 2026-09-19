import java.util.ArrayList;
import java.util.Scanner;

public class Mediatheque {
    ArrayList<Ouvrage> e = new ArrayList<Ouvrage>()  ;


    public static void  ajouteOuvrage(ArrayList<Ouvrage> e){

        Scanner scanner= new Scanner(System.in); 

        System.out.println("Vous voulez saisir combien d'ouvrage ?");
        int nb_saisie = scanner.nextInt();
        scanner.nextLine(); 

        

        System.out.println( "Que voulez vous rajouter un livre ou un DVD ?"); 
        String saisie = scanner.nextLine();

        if( saisie.equals("livre")){
            System.out.println( "Quel est le numero d'identification du livre ? ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ce livre est t'il emprunter ? (oui/non) : ");
            String tf = scanner.nextLine(); 
            boolean emprunt = Boolean.parseBoolean(tf);

            if(tf.equals("oui")){
                emprunt = true;
            }
            else 
                emprunt = false;



            System.out.println( "Quel est le titre du livre ? ");
            String title = scanner.nextLine(); 

            System.out.println("Quel est le nom du livre ?");
            String nom = scanner.nextLine();

             e.add(new Livre(id , emprunt , title , nom ));
             
        }

        else if (saisie.equals("DVD")){

            System.out.println( "Quel est le numero d'identification du DVD ? ");
            int id = scanner.nextInt();
            scanner.nextLine();

            
            System.out.println("Ce DVD est t'il emprunter ? (oui/non) : ");
            String tf = scanner.nextLine(); 
            boolean ft = Boolean.parseBoolean(tf) ;

            if( tf.equals("oui")){
                 ft = true ; 
            }
            else {
                 ft = false ; 
            }
    

            System.out.println( "Quel est le titre du DVD ? ");
            String title = scanner.nextLine(); 

            System.out.println("Quel est la duree du DVD ?");
            int duree = scanner.nextInt();
            scanner.nextLine();

             e.add(new DVD(id , ft , title , duree ));

        }
        }

       public static  void affiche_ouvrage(ArrayList<Ouvrage> e){

            for ( int i = 0 ; i<e.size() ; i++){

                System.out.println(e.get(i));
            }
        }

        public static void main(String [] args){

            ArrayList<Ouvrage> e = new ArrayList<Ouvrage> (); 

            ajouteOuvrage(e);
            affiche_ouvrage(e);
        }
    
}