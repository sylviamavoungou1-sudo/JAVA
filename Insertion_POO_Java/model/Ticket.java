package Insertion_POO_Java.model;
import java.util.Date;

public class Ticket {
    
    private String montant ;
    private  Vehicule vehicule;
    private Date heure_dentrer;
    private Date heure_sortie;

    public String getmontant(){
        return montant ;
    }

      public void setmontant( String montant ){
         this.montant = montant ;
    }

    public Vehicule getvehicule(){
        return vehicule ;
    }

    public void setVehicule( Vehicule vehicule ){
         this.vehicule = vehicule ;
    }

    public Date getheure_dentrer(){
        return heure_dentrer ;
    }

     public void setheure_dentrer( Date heure_dentrer ){
         this.heure_dentrer = heure_dentrer ;
    }

    public Date getheure_sortie(){
        return heure_sortie ;
    }

     public void setheure_sortie( Date heure_sortie ){
         this.heure_sortie = heure_sortie ;
    }
    
    public String toString(){

       return  "Ticket { " + " montant = " + montant + "/" + "Véhicule = " + vehicule + "/" + "Heure d'entrer ="
                    + heure_dentrer + "/" + "heure de sortie = " + heure_sortie + "}" ;
    }






}
