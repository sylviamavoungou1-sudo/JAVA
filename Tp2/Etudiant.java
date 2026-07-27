public class Etudiant {
    public String nom ; 
    public String prenom;
    public int moyenne;
            public Etudiant ( String  nom , String prenom , int moyenne){

                this.nom = nom;
                this.prenom = prenom;
                this.moyenne = moyenne;
            }
   
    
        public void afficher(){
            System.out.println("l'étudiant s'appelle " + nom + " " + prenom + " et il a une moyenne de " + moyenne);
        }
    public static void main ( String[] args){

         Etudiant etudiant1 = new Etudiant ("NGANDJI", "ALEX" , 18);
         
     etudiant1.afficher();
    }

}