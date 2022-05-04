package vozilo;

public abstract class Automobil extends Vozilo{
    
    String brojSasije;
    
    void setBrojSasije(String broj){
        brojSasije = broj;
    }
    
    String getBrojSasije(){
        return brojSasije;
    }   
    
}
