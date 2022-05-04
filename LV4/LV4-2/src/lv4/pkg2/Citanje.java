package lv4.pkg2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Citanje {
    private ObjectInputStream input;
    
    public void openFile() {
        try {
            input = new ObjectInputStream(new FileInputStream( "studenti.ser" ) );
        } catch (IOException ex) {
            Logger.getLogger(Citanje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public int citanjeStudent(){
        Student St = new Student();
        int suma=0, a;
        for(int i=0; i<2; i++){
            System.out.printf("%10d%10s%10s%10s%10s%1d%1d", St.getMaticniBroj(), St.getIme(), St.getPrezime(), St.getFakultet(), St.getSmjer(), St.getGodina(), St.getOcjena());
            System.out.print(St);
            suma += St.getOcjena();
        }
        return suma/2;
    }
    
    public void closeFile() {
        if (input != null) {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(Citanje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
}
