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
    return "DVD [id=" + get_id() + ", emprunte=" + emprunt + ", titre=" + titre_DVD+ ", duree=" + duree + "]";
}

    void affiche(){
        super.affiche();
        System.out.println(" Les caractéristiques du DVD sont les suivantes " + titre_DVD + duree + get_id() + emprunt);
    }
}
