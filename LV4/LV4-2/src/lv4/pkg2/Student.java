package lv4.pkg2;
import java.util.Scanner;
import java.io.Serializable;

public class Student implements Serializable{
    private int maticniBroj;
    private String ime, prezime, fakultet, smjer;
    private int godina, ocjena;
    
    /*public Student(){
        this(0,"","","","",0,0);
    
    public Student(int mat, String ime1, String prezime1, String fakultet1, String smjer1, int god, int ocj){
        setMaticniBroj(mat);
        setIme(ime1);
        setPrezime(prezime1);
        setFakultet(fakultet1);
        setSmjer(smjer1);
        setGodina(god);
        setOcjena(ocj);
    }*/
    
    public void setMaticniBroj(int mat){
        maticniBroj = mat;
    }
    
    public int getMaticniBroj(){
        return maticniBroj;
    }
    
    public void setIme(String ime1){
        ime = ime1;
    }
    
    public String getIme(){
        return ime;
    }
    
    public void setPrezime(String prezime1){
        prezime = prezime1;
    }
    
    public String getPrezime(){
        return prezime;
    }
    
    public void setFakultet(String fakultet1){
        fakultet = fakultet1;
    }
    
    public String getFakultet(){
        return fakultet;
    }
    
    public void setSmjer(String smjer1){
        smjer = smjer1;
    }
    
    public String getSmjer(){
        return smjer;
    }
    
    public void setGodina(int god){
        godina = god;
    }
    
    public int getGodina(){
        return godina;
    }
    
    public void setOcjena(int ocj){
        ocjena = ocj;
    }
    
    public int getOcjena(){
        return ocjena;
    }
    
    public Student Unos(){
        Student S = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.print("MATIČNI BROJ: ");
        S.maticniBroj = scan.nextInt();
        System.out.print("\nIME: ");
        S.ime = scan.next();
        System.out.print("\nPREZIME: ");
        S.prezime = scan.next();
        System.out.print("\nFAKULTET: ");
        S.fakultet = scan.next();
        System.out.print("\nSMJER: ");
        S.smjer = scan.next();
        System.out.print("\nGODINA: ");
        S.godina = scan.nextInt();
        System.out.print("\nOCJENA: ");
        S.ocjena = scan.nextInt();
        System.out.print("\n\n");
        return S;
    }
}
