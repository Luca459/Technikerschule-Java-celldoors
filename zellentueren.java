import java.util.*;

public class zellentueren{
    public static void main(String[]args){

        //Feinde einlesen
        int enemies;

        //Objekt scan vom Typ scanner erstellen
        Scanner scan = new Scanner(System.in);


        System.out.println("Wie viele Feinde nam Dodon bei seinem Feldzug gefangen?: ");
         //Variable einlesen
        enemies = scan.nextInt();

        //Array vom Typ int deklarieren mit der groeße der eingelesenen Zahl
        boolean[] tueren = new boolean[enemies];

        //Schleife, die die Zustände wechselt
        for (int i = 1; i <= enemies; i++) {
           for(int z = i -1; z < enemies; z += i) {
               tueren[z] = !tueren[z];
           }
           if(tueren[i-1]){
                System.out.println(i + 5);
           }
        }
        scan.close();
    }
}