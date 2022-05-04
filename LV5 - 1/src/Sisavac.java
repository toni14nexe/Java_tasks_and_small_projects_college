package lv5.pkgl;
/**
 *
 * @author Toni
 */
public class Sisavac {
    int dob=0;
    int tezina=0;
    Sisavac(){}
    
    Sisavac(int dob0, int tezina0){
        dob = dob0;
        tezina = tezina0;
    }
    
    public int getDob(){
        return dob;
    }
    
    public int getTezina(){
        return tezina;
    }
    
    public int setDob(){
        return dob;
    }
    
    public int setTezina(){
        return tezina;
    }
}
