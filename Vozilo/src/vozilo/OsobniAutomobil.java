package vozilo;
import java.util.Scanner;

public class OsobniAutomobil extends Automobil{
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        OsobniAutomobil auto = new OsobniAutomobil();
        System.out.println("Unesite broj šasije: ");
        auto.brojSasije = scan.next();
        System.out.println("Broj šasije je: ");
        System.out.println(auto.brojSasije);
        auto.pokreni();
        auto.stani();
    }
    
}
