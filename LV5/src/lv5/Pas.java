package lv5;

public class Pas extends Sisavac{
    private String pasmina_pas;
    
    Pas(){
        pasmina_pas = "";
    }
    
    public String getPasmina_pas(){
        return pasmina_pas;
    }
    
    public void setPasmina_pas(String pasmina1){
        pasmina_pas=pasmina1;
    }    
    
    public void ispisPas(){
        int dob1=getDob();
        int tezina1=getTezina();
        String pasmina1=getPasmina_pas();
        System.out.println("\nMacka\tDob: "+dob1+"\tTezina: "+tezina1+"\tPasmina: "+pasmina1);
    }      
}
