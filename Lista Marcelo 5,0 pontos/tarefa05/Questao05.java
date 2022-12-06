package terefa05;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
	
	double selector;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o valor de 1 a 9");
	selector = scan.nextDouble();
	
	if(selector>9) {
		
		System.out.println("numero invalido!!!");
	}
	
	else if(selector == 1) {
	
		System.out.println("Parabéns você ganhou um carro");
	}

	else if (selector == 2){
		System.out.println("Parabéns você ganhou uma bicicleta");
	}
	
	else if (selector == 3){
		System.out.println("Parabéns você ganhou uma moto");
	}
	
	else if (selector == 4){
		System.out.println("Parabéns você ganhou uma bola");
	} 
	
	else if (selector == 5){
		System.out.println("Parabéns você ganhou uma panela");
	}
	
	else if (selector == 6){
		System.out.println("Parabéns você ganhou um videogame");
	}
	else if (selector == 7){
		System.out.println("Parabéns você ganhou uma TV");
	}
	else if (selector == 8){
		System.out.println("Parabéns você ganhou um computador");
	}
	
	else {
		System.out.println("Parabéns você ganhou um computador");
	
	}
}
}
