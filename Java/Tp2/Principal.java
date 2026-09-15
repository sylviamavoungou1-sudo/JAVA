import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main( String[] args){

		ArrayList<Etudiant> e = new ArrayList<Etudiant>();
		Remplirtab(e);
		//affiche_list(e);
		Etudiant meilleur = affiche_max(e);
		meilleur.affiche();

		ArrayList<Etudiant> etudiants_fauchés = affiche_tab(e);
		affiche_list(etudiants_fauchés);
		

		}
		

		
	

	public static void Remplirtab( ArrayList<Etudiant> e){


		    Scanner scanner = new Scanner (System.in);
			
			System.out.println ("combien d'etudiant voulez vous saisir ");
			int nb = scanner.nextInt();
			scanner.nextLine(); // consommer le retour à la ligne

				for (int i = 0 ; i< nb ; i ++){
			System.out.println ("Quelle est votre nom? ");

			String nom = scanner.nextLine(); 

			System.out.println ("Quelle est votre prenom? ");

			String prenom = scanner.nextLine(); 
			
			System.out.println ("Quelle est votre moyenne? ");

			 float moy = scanner.nextFloat(); 
			 scanner.nextLine(); // consommer le retour à la ligne

			  e.add(new Etudiant(nom , prenom , moy));
				//e.get(i).affiche();

			}

		}

		public static void  affiche_list( ArrayList<Etudiant>e ){
			for(Etudiant etu : e){
			etu.affiche();
		}
	}

	public static  Etudiant affiche_max(ArrayList<Etudiant> e){
		Etudiant etu = e.get(0);
		int index_max = 0;

		for(int i = 1 ; i<e.size() ; i++){
			if(e.get(i).get_moy() > etu.get_moy()){
				index_max = i;
				etu = e.get(i);
			}
		}
			return e.get(index_max);
	}



	public static ArrayList<Etudiant> affiche_tab(ArrayList<Etudiant> e){

		ArrayList <Etudiant> etudiants_nul = new ArrayList<Etudiant>(); ;

		for(int  i = 1 ; i <e.size(); i++){

			if(e.get(i).get_moy() <10){
				etudiants_nul.add(e.get(i));
			}

		}
		return etudiants_nul;
	}

	void affiche(){
	}

}
//e.add(new Etudiant)