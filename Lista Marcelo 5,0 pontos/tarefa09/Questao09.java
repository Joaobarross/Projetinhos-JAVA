package tarefa09;

import java.util.Scanner;

public class  Questao09 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            double fahrenheit = 1;
            double celcius = 2;
            double opcao;
            
            System.out.println("1 = converter celsius para fahrenheit");
            System.out.println("2 = converter fahrenheit para celsius");
            opcao = scan.nextDouble();
            
            
            if(opcao == 1) {
            	
            	System.out.println("Insira o valor de celcius");
            	celcius = scan.nextInt();
            	
            	fahrenheit = 1.8 * celcius + 32;
            	
            	System.out.println("Sua converção de celcius para fahrenheit é="+fahrenheit);
            }
            
            else if(opcao == 2){
            	
            	System.out.println("Insira o valor de fahrenheit");
            	fahrenheit = scan.nextDouble();
            	
            	celcius = fahrenheit - 32 / 1.8;
            	
            	
            	System.out.println("Sua converção de fahrenheit para celsius é="+celcius);
            
            }
            
        }
}
