package lv2.pkg1;
import java.util.Scanner;

public class Zaposlenik {
    Scanner scan = new Scanner(System.in);
    int staz, starost, placa;
    
    Zaposlenik(){
        staz=0;
        starost=0;
        placa=0;
    }
    
    void Promijena(){
        System.out.println("Unesite staž: ");
        staz = scan.nextInt();
        System.out.println("Unesite starost: ");
        starost = scan.nextInt();
        System.out.println("Unesite placu: ");
        placa = scan.nextInt();
    }
    
    void Provjeri(){
        System.out.println("Staz: " + staz);
        System.out.println("Starost: " + starost);
        System.out.println("Placa: " + placa);
    }
    
    void Zarada1(){
        System.out.println("Zarada1::Do sada zaradio: " + (staz*12*placa));
    }
    
    void Zarada2(int a, int b){
        System.out.println("Zarada2::Do sada zaradio: " + (a*12*b));
    }
}