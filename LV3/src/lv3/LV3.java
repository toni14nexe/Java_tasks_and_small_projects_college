package lv3;
import java.util.Scanner;

public class LV3 {
    Scanner scan = new Scanner(System.in);
    int n, m;
    
    LV3(){
        n = 0;
        m = 0;
    }
    
    int Izbornik(){
        System.out.println("1) Izračunati aritmetičku sredinu sporedne dijagonale\n2) Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice\n3) Ispisati sve brojeve na parnim indeksima vektora V");
        int b;
        b = scan.nextInt();
        return b;
    }
    
    float SporednaM(){
        float as=-1;
        do{
            System.out.println("Unesite vrijednost matrice m: ");
            m = scan.nextInt();
        }while(m<1 || m>5);
        int[][] M = new int[m][m];
        for(int i=0; i<m; i++){
            as=0;
            for(int j=0; j<m; j++){
                System.out.println("Matrica X["+i+"]["+j+"]: ");
                M[i][j] = scan.nextInt();
                if(i+j == m-1){
                    as += M[i][j];
                }
            }
        }
        as = as/m;
        System.out.println("Artitmetička sredina sporedne dijagonale je: " +as);
        return as/m;
    }
    
    int SumaneparnihelM(){
        int suma=-1;
        do{
            System.out.println("Unesite vrijednost matrice m: ");
            m = scan.nextInt();
        }while(m<1 || m>5);
        int[][] M = new int[m][m];
        if(m==1){
            System.out.println("Nije moguće izračunati sumu na jednome elementu!");
        }
        else{
            suma=0;
            for(int i=0; i<m; i++){
                for(int j=0; j<m; j++){
                    System.out.println("Matrica X["+i+"]["+j+"]: ");
                    M[i][j] = scan.nextInt();
                    if(i == 1){
                        if(M[i][j]%2 == 1){
                            suma += M[i][j];
                        }
                    }
                    if(j == 1){
                        if(M[i][j]%2 == 1){
                            suma += M[i][j];
                        }
                    }
                }
            }
            System.out.println("Suma svih neparnih elemenata u prvome retku i stupcu je: "+suma);
        }
        return suma;
    }
    
    void ParnibrojeviN(){
        do{
            System.out.println("Unesite vrijednost vektora n: ");
            n = scan.nextInt();
        }while(n<2 || n>10);
        int[] N = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Unesite u vektoru u stupac "+(i)+": ");
            N[i] = scan.nextInt();
        }
        System.out.print("\nBrojevi na parnim indexima: ");
        for(int i=2; i<n; i++){
            if(i%2 == 1){
                continue;
            }
            System.out.print(N[i]+"   ");
        }
    }
    
    public static void main(String[]args){
        LV3 lv3 = new LV3();
        int a, rezint = -1;
        float rezfloat = -1;
        a = lv3.Izbornik();
        switch(a){
            case 1:
                try{
                    rezfloat = lv3.SporednaM();
                }catch(Exception greska){
                    System.out.println("Dogodila se greška!");
                }
            case 2:
                try{
                rezint = lv3.SumaneparnihelM();
                }catch(Exception greska){
                System.out.println("Dogodila se greška!");
                }
            case 3:
                lv3.ParnibrojeviN();
        }
    }
}

