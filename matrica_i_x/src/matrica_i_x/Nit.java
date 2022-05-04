package matrica_i_x;

public class Nit extends Thread {
    
    Nit(int[]polje, int x){
        int[] p1 = new int[polje.length-x];
        for(int i=x; i<polje.length; i++){
            p1[i] = polje[i];
            System.out.println(p1[i]);
        }        
    }

}
