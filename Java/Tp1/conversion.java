
public class conversion {

    public static void main(String[] args){

        if( args.length == 1){
            double celsuis = Double.parseDouble(args[0]);
            double far = ((celsuis * 9) /5) + 32;

        System.out.println(" La convertion de " + celsuis + " en Fahrenheit est de " + far);
        }

        else {
            System.out.println( " Il y'a une erreur velliez saisir le degré en celsuis à convertir ");
        }
        
    }

}