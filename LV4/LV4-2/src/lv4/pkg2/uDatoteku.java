package lv4.pkg2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class uDatoteku {
    private ObjectOutputStream output;
    
    public void openFile(){
        try {
            output = new ObjectOutputStream(new FileOutputStream( "studenti.ser" ) );
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void spremiStudent(Student St){
        try {
            output.writeObject(St);
        } catch (IOException ex) {
            Logger.getLogger(uDatoteku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeFile () {
        if (output != null)
            try {
                output.close();
        } catch (IOException ex) {
            Logger.getLogger(uDatoteku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    
    
    
    
 
