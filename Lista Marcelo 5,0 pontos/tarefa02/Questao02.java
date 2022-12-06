package tarefa02;

import java.util.Scanner;

public class  Questao02 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int numeroUm;
            int numeroDois;

            System.out.println("informe o primeiro numero");
            numeroUm = scan.nextInt();

            System.out.println("informe o segundo numero");
            numeroDois = scan.nextInt();


            if (numeroUm==numeroDois){

               System.out.println("os numeros são iguais");
            }

            else if(numeroUm != numeroDois){

               System.out.println("os numeros são diferentes");

            }

            else if(numeroUm > numeroDois){

                System.out.println("o primeiro é maior");

            }

            else if (numeroUm < numeroDois){

                System.out.println("o segundo é maior");
            }
            else if (numeroUm >= numeroDois){

                System.out.println("o primeiro é maior");
            }
            else if (numeroUm <= numeroDois){

                System.out.println("o segundo é maior");
            }

        }
}
