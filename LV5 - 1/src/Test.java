package lv5.pkgl;
import java.util.Scanner;
/**
 *
 * @author Toni
 */
public class Test {
    Scanner scan = new Scanner(System.in);
    Sisavac[] S = new Sisavac[1];
    Pas[] P = new Pas[1];
    Macka[] M = new Macka[1];
    int a = scan.nextInt();
    int b = scan.nextInt();
    S = new Sisavac(a, b);
    String c = scan.next();
    P = new Pas(a, b, c);
    M = new Macka(a, b, c);
    public int getDob(){
        return a;
    }
    public int getTezina(){
        return b;
    }
    public String getPasmina(){
        return c;
    }
    }

