import java.io.*;

public class Repertoire {
    public static void main(String[] args){

        if(args.length != 1){
            System.out.println(" Vous n'avez pas donner le répertoire");
        }
        File repertoire = new File(args[0]);

          if (repertoire.exists() && repertoire.isDirectory()) {
            System.out.println("Répertoire trouvé  ");
          }
        
        String[] liste_fichiers ;
        liste_fichiers = repertoire.list();

    for(int i=0; i<liste_fichiers.length; i++)
    System.out.println(liste_fichiers[i]);
        
    }
    
}
