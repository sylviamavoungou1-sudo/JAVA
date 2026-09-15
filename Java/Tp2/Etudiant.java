
public class Etudiant {

	String nom ; 
	String prenom ; 
	float moy; 

	Etudiant ( String n , String p , float moy){
		this.nom = n; 
		this.prenom = p ; 
		this.moy = moy;
	};

	float get_moy(){
		return moy;
	}
	String get_nom(){
		return nom;
	}
	void affiche(){
	System.out.println( nom + prenom + " a une moyenne de " + moy);
	}

	
}