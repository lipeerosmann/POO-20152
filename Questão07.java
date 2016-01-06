package exercicio1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numerodeLesmas = 1;
        int velocidadeLesma;
        int Lesmarapida = 0;
        int contador;
       
        velocidadeLesma = in.nextInt();
        in.nextLine();
        
        numerodeLesmas = in.nextInt();
        in.nextLine();
        
        while(numerodeLesmas > 0) {
            for(contador = 0; contador<numerodeLesmas; contador++) {
                Lesmarapida = velocidadeLesma > Lesmarapida ? velocidadeLesma : Lesmarapida;
            }
    }
        if(Lesmarapida<10) 
            System.out.println("1");
        if(Lesmarapida<20 && Lesmarapida > 9)
            System.out.println("2");
        if(Lesmarapida > 19)
            System.out.println("3");
    }
    
}
