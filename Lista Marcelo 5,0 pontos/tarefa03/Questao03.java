package tarefa03;

import java.util.Scanner;

public class Questao03 {
	Scanner entrada = new Scanner(System.in);
    int numero1;
    boolean par = ( numero1 % 2 ) == 0;
	
	public static void main(String[] args) {
		Questao03 ex03 = new Questao03();
		
		ex03.caucularRaio();

	}
	
	public void caucularRaio() {
        System.out.println("Digite seu numero: ");
        numero1 = entrada.nextInt();

        if(numero1 % 2 == 0) {
            System.out.println("Seu numero é par ");
        }
        else {
            System.out.println("Seu numero é impar ");
        }
    }

}
