package exercicio1;

import java.util.Scanner;


public class Exercicio5 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int senha;
        
        senha = in.nextInt();
        in.nextLine();
        
        for( x=0; x<3; x++) {
            if(senha == 2002) {
                System.out.println("Acesso Garantido");
                break;
            }else
                System.out.println("Senha inválida");
        }
        
        if(x>=3) {
            System.out.println("Acesso negado");
        }
    }
    
}
