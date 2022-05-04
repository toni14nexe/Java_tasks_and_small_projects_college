package lv4;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Toni
 */
public class LV4 {
    
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
    Scanner scan = new Scanner(System.in);
        int matbroj0;
        String ime0;
        String prezime0;
        String fakultet0;
        String smjer0;
        int godina0;
        int ocjena0;
        
        Student[] studenti = new Student[10];
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Studenti.txt"));
        
        for(int i=0; i<10; i++){
            System.out.println("\n\n"+(i+1)+". STUDENT\nUnesi matični broj: ");
            matbroj0 = scan.nextInt();
            System.out.println("Unesi ime: ");
            ime0 = scan.next();
            System.out.println("Unesi prezime: ");
            prezime0 = scan.next();
            System.out.println("Unesi fakultet: ");
            fakultet0 = scan.next();
            System.out.println("Unesi smjer: ");
            smjer0 = scan.next();
            System.out.println("Unesi godinu: ");
            godina0 = scan.nextInt();
            System.out.println("Unesi ocjenu: ");
            ocjena0 = scan.nextInt();
            
            studenti[i] = new Student(matbroj0, ime0, prezime0, fakultet0, smjer0, godina0, ocjena0);
            out.writeObject(studenti[i]);
        }
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Studenti.txt"));
        
        float prosijek=0;
        System.out.println("\n\n\nISPIS PODATAKA:");
        int i=0;
        while(i<10){
            System.out.println("\n"+(i+1)+". STUDENT\nMatični broj: ");
            Student studenti2 = (Student) in.readObject();
            System.out.println(studenti2.getMatbroj());
            System.out.println("Ime: ");
            System.out.println(studenti2.getIme());
            System.out.println("Prezime: ");
            System.out.println(studenti2.getPrezime());
            System.out.println("Fakultet: ");
            System.out.println(studenti2.getFakultet());
            System.out.println("Smjer: ");
            System.out.println(studenti2.getSmjer());
            System.out.println("Godina: ");
            System.out.println(studenti2.getGodina());
            System.out.println("Ocjena: ");
            System.out.println(studenti2.getOcjena());
            ocjena0 = studenti2.getOcjena();
            prosijek += ocjena0;
            i++;
        }
        
        System.out.println("\nZajednički prosijek je: "+prosijek/10);
}
