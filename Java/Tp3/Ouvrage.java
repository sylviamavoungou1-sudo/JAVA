public class Ouvrage{

	private int id ; 
	protected boolean emprunt; 

	public Ouvrage(int _id , boolean _emprunt){
		this.id = _id ; 
		this.emprunt = _emprunt;
	}

	int get_id( ){
		 return this.id ;
	}

	void affiche(){
		System.out.println("L'ouvrage possède ces caractéristiques : " + id + " et " + emprunt); 
	}
}