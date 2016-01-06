package exercicio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        
        a = in.nextInt();
        in.nextLine();
        
        b = in.nextInt();
        in.nextLine();
        
        c = in.nextInt();
        in.nextLine();
        
        d = in.nextInt();
        in.nextLine();
        
        if(b>c && d>a && c+d > a+b && c>0 && d>0 && a%2 == 0) {
            System.out.println("Valores Aceitos");
        } else
        System.out.println("Valores não Aceitos");
    }
    
}
