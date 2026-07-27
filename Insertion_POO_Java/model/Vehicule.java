package Insertion_POO_Java.model;

public class Vehicule {
    
    private String numeroplaque ;
    private String categorie_voiture;

    public String getnumeroplaque(){
        return numeroplaque;
    }

      public void setnumeroplaque( String numeroplaque ){
         this.numeroplaque = numeroplaque ;
    }

    public String getcategore_voiture(){
        return categorie_voiture ;
    }

      public void setcategorie_voiture( String categorie_voiture ){
         this.categorie_voiture = categorie_voiture ;
    }

    public String toString(){

        return " Véhicule {" + "Numero de plaque = "+ numeroplaque + "/" + "Catégorie de la voiture = " + categorie_voiture + "}";
    }

}
