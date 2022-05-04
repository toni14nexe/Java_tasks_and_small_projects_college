package lv2.pkg1;
import java.util.Scanner;

public class Test {
    Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        Zarulja z = new Zarulja();
        z.Provjeri();
        z.PritisniPrekidac();
        z.Provjeri();
        z.PritisniPrekidac();
        z.Provjeri();
        
        
        Zaposlenik a = new Zaposlenik();
        a.Promijena();
        a.Provjeri();
        a.Zarada1();
        a.Zarada2(a.placa, a.staz);
    }
}
