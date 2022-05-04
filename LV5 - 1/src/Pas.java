package lv5.pkgl;
/**
 *
 * @author Toni
 */
public class Pas extends Sisavac{
    private String pasmina_pas;
    Sisavac S1;
    Pas(){};
    
    Pas(int dob0, int tezina0, String pasmina0){
        S1.dob=dob0;
        S1.tezina=tezina0;
        pasmina_pas=pasmina0;
    }
    
    public String getPasmina_pas(){
        return pasmina_pas;
    }
    
    public String setPasmina_pas(){
        return pasmina_pas;
    }
    
    
}
