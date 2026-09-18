public class Livre extends Ouvrage{
	private String nom ; 
	private String titre ; 

	Livre(int id , boolean emprunt  , String _nom , String _titre){
	
		super(id , emprunt);
		this.nom = _nom; 
		this.titre = _titre; 
	}

	@Override
public String toString() {
    return "Livre [id=" + get_id() + ", emprunte=" + emprunt + ", titre=" + titre + ", auteur=" + nom + "]";
}

	void affiche(){
		super.affiche();
		System.out.println(" Ce livre possède les caractéristique suivante : " + titre + nom +get_id()+ emprunt);
	}
}