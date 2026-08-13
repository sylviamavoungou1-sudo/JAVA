import java.util.ArrayList; // Nous permet d'utiliser ArrayList
import java.util.Scanner; 

public class Etudiant {
    public String nom ; 
    public String prenom;
    public int moyenne;
            public Etudiant ( String  nom , String prenom , int moyenne){

                this.nom = nom;
                this.prenom = prenom;
                this.moyenne = moyenne;
            }
   
    
        public void afficher(){
            System.out.println("l'étudiant s'appelle " + nom + " " + prenom + " et il a une moyenne de " + moyenne);
        }

        public static void remplirtab( ArrayList<Etudiant> etudiants, Scanner saisie ){


            String yes = "oui";
            String reponse ;

            
           do{ System.out.println( "Quelle est votre nom ? ");

             String nom = saisie.nextLine();

            System.out.println( "Quelle est votre prenom ? ");

             String prenom = saisie.nextLine();


            System.out.println( "Quelle est votre moyenne ? ");

             int moyenne = saisie.nextInt();
             saisie.nextLine();
             
    
         Etudiant etudiant1 = new Etudiant (nom , prenom , moyenne);
         
         etudiant1.afficher();
         etudiants.add(etudiant1);

             System.out.println( "Voulez vous donner un autre étudiant ? Répondez par oui ou non ");
            reponse = saisie.nextLine();
    
           } while ( reponse.equals(yes) );
    

        }
       
    public static void main ( String[] args){

        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
        
         Scanner saisie = new Scanner(System.in);

         remplirtab(etudiants, saisie);
           
      System.out.println(etudiants.size());
    }

}