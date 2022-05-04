
package lv4;
import java.io.Serializable;
/**
 *
 * @author Toni
 */
    public class Student implements Serializable{
            private int matbroj;
            private String ime;
            private String prezime;
            private String fakultet;
            private String smjer;
            private int godina;
            private int ocjena;

            public Student(int mb, String a, String b, String c, String d, int god, int ocj){
                matbroj=mb;
                ime=a;
                prezime=b;
                fakultet=c;
                smjer=d;
                godina=god;
                ocjena=ocj;
            }
            
            public int getMatbroj(){
                return matbroj;
            }
            
            public String getIme(){
                return ime;
            }
            
            public String getPrezime(){
                return prezime;
            }
            
            public String getFakultet(){
                return fakultet;
            }
            
            public String getSmjer(){
                return smjer;
            }
            
            public int getGodina(){
                return godina;
            }
            
            public int getOcjena(){
                return ocjena;
            }
    }
