package lv4.pkg2;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZD2 {
    
    public static void main(String[]args){
        Student S = new Student();
        uDatoteku D = new uDatoteku();
        Citanje C = new Citanje();
        Student[] Studenti = new Student[2];
        for(int i=0; i<2; i++){
            Studenti[i] = S;
        }
        for(int i=0; i<2; i++){
            Studenti[i].Unos();
        }
        D.openFile();
        for(int i=0; i<2; i++){
            D.spremiStudent(Studenti[i]);
        }
        D.closeFile();
        C.openFile();
        float prosijek=0;
        int Suma = C.citanjeStudent();
        System.out.println("\n\nProsijek ocijena ta dva studenta je: "+Suma);
    }
}
