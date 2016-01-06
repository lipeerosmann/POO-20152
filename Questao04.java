package exercicio1;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int linhasEscritas = 1;
        
        N = in.nextInt();
        in.nextLine();
        
        for(int i=0;(i<N);i++) {
            System.out.println("linhasEscritas++ "+ " linhasEscritas++ "+ " linhasEscritas++ "+ " IFPI");
                linhasEscritas++;
        }
    }
}
