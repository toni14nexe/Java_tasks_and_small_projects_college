package lv5;
public class Macka extends Sisavac{
    String pasmina_macka;
    
    Macka(){
        pasmina_macka="";
    }
    
    public String getPasmina_macka(){
        return pasmina_macka;
    }
    
    public void setPasmina_macka(String pasmina1){
        pasmina_macka=pasmina1;
    }
    
    public void ispisMacka(){
        int dob1=getDob();
        int tezina1=getTezina();
        String pasmina1=getPasmina_macka();
        System.out.println("\nMacka\tDob: "+dob1+"\tTezina: "+tezina1+"\tPasmina: "+pasmina1);
    }
}
