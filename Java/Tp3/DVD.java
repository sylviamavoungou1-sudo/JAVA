public class DVD extends Ouvrage {
    public String titre_DVD ; 
    public int duree ; 


    DVD(  int id , boolean emprunt , String titre_DVD , int duree){
        this.titre_DVD = titre_DVD; 
        this.duree = duree;
        super(id , emprunt);
    }

    @Override
public String toString() {
    String statut ;
    if ( emprunt ){
        statut = "emprunter";
    }
    else 
        statut = "Disponible";
    return "DVD { id : " + get_id() +" ,"+ " Titre : " + titre_DVD+" ," + " Duree : " + duree +" ,"+ " Statut : " + statut +  "}";
}

    void affiche(){
        super.affiche();
        System.out.println(" Les caractéristiques du DVD sont les suivantes : " + " Identifiant : " + get_id() + "Titre : "+ titre_DVD + "Durée : "+ duree + "Status : " + emprunt);
    }
}
