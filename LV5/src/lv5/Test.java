package lv5;
import java.util.Scanner;

public class Test {
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Sisavac sisavac1 = new Sisavac();
        Pas pas1 = new Pas();
        Macka macka1 = new Macka();
        int integer1, integer2;
        String string;
        
        System.out.println("Unesite dob sisavca: ");
        integer1 = scan.nextInt();
        sisavac1.setDob(integer1);
        System.out.println("Unesite težinu sisavca: ");
        integer2 = scan.nextInt();
        sisavac1.setTezina(integer2);
        System.out.println("\nSisavac\tDob: "+integer1+"\tTezina: "+integer2);
        
        System.out.println("Unesite dob psa: ");
        integer1 = scan.nextInt();
        pas1.setDob(integer1);
        System.out.println("Unesite težinu psa: ");
        integer2 = scan.nextInt();
        pas1.setTezina(integer2);
        System.out.println("Unesite pasminu psa: ");
        string = scan.next();
        pas1.setPasmina_pas(string);
        
        
        System.out.println("Unesite dob macke: ");
        integer1 = scan.nextInt();
        macka1.setDob(integer1);
        System.out.println("Unesite težinu macke: ");
        integer2 = scan.nextInt();
        macka1.setTezina(integer2);
        System.out.println("Unesite pasminu macke: ");
        string = scan.next();
        macka1.setPasmina_macka(string);
        
        pas1.ispisPas();
        macka1.ispisMacka();
    }
    
    
    
}
