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
	String statut; 
	if(emprunt){
		statut = "Emprunter";
	}
	else
		statut = "Disponible";

    return "Livre { id: " + get_id() + " Titre : "+ titre+ "  Auteur : " + nom + " Statut: " + statut + "}";
}

	void affiche(){
		super.affiche();
		System.out.println(" Ce livre possède les caractéristique suivante : " + "Id : "+ get_id() +" Titre :" + titre +"Auteur :" + nom + "Statut : "+ emprunt);
	}
}
