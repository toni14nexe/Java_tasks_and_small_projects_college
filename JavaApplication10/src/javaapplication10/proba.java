package javaapplication10;

public class proba {
public int[][] m(String args[]){
    int[][] M1 = new int[][] {
        new int[] { 1, 2, 3},
        new int[] { 4, 5, 6},
        new int[] { 4, 12, 6},
    };
    int[][] M2 = new int[][] {
        new int[] { 1, 2, 3},
        new int[] { 4, 5, 6},
        new int[] { 4, 12, 6},
    };

  int a1 = M1.length;
  int b1 = M1[0].length;
  int a2 = M2.length;
  int b2 = M2[0].length;
  int br=0;

    for(int i=0; i<a1 || i<a2; i++){
        for(int j=0; j<b1 || j<b2; j++){
            M1[i][j] += M2[i][j];
        }
    }
    System.out.println(br);
    return M1;
}
}
