package exercicio1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int i;
        int n;
        int valor;
        int quantC=0;
        int quantR=0;
        int quantS=0;
        String Tipo;
        
        n = in.nextInt();
        in.nextLine();
        
        valor = in.nextInt();
        in.nextLine();
        
        Tipo = in.next();
        in.nextLine();
        
        for(i=0; i<n; i++) {
            System.out.println("Digite o Tipo, C = Coelho, R = Rato, S = Sapo");
            
            quantC = Tipo.toUppercase().equals("C") ? quantC + valor = quantC;
            quantR = Tipo.toUpperCase().equals("R") ? quantR + valor = quantR;
            quantS = Tipo.toUpperCase().equals("S") ? quantS + valor = quantS;
           
        }
        System.out.println("Total"+ (quantC + quantR + quantS)+ "Cobaias");
        System.out.println("Total de Coelhos "+quantC);
        System.out.println("Total de Ratos "+quantR);
        System.out.println("Total de Sapos "+quantS);
        System.out.println("Percentual de Coelhos"+ (quantC * 100 / (quantC + quantR + quantS))+"%");
        System.out.println("Percentual de Ratos"+ (quantR * 100 / (quantC + quantR + quantS))+"%");
        System.out.println("Percentual de Sapos"+ (quantS * 100 / (quantC + quantR + quantS))+"%");
        
    }
}
