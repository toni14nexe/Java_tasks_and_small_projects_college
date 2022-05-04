package lv5.pkgl;
/**
 *
 * @author Toni
 */
public class Macka extends Sisavac{
    private String pasmina_macka;
    Sisavac S2;
    Macka(){};
    
    Macka(int dob1, int tezina1, String pasmina1){
        S2.dob=dob1;
        S2.tezina=tezina1;
        pasmina_macka=pasmina1;
    }
    
    public String getPasmina_macka(){
        return pasmina_macka;
    }
    
    public String setPasmina_pas(){
        return pasmina_macka;
    }
}
