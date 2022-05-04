package lv2.pkg1;

public class Zarulja {
    boolean Stanje;
    
    Zarulja(){
        Stanje = false;
    }
    
    void PritisniPrekidac(){
        if(Stanje == false){
            Stanje = true;
        }
        else{
            Stanje = false;
        }
    }
    
    void Provjeri(){
        if(Stanje == false){
            System.out.println("Ugašena");
        }
        else{
            System.out.println("Upaljena");
        }
    }
    
    public static void main(String[]args){
        Zarulja Osram = new Zarulja();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
        Osram.PritisniPrekidac();
        Osram.Provjeri();
    }
}
