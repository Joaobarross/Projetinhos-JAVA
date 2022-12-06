package terefa13;

import java.util.Scanner;

public class Questao13 {
	
	public static void main(String[] args) {
		
		
		ordemInverso();
	}
	
	public static void ordemInverso() {
		Scanner entrada = new Scanner(System.in);
		int[] solicitado = new int[20];
		System.out.println("Digite 20 numeros aleatorios");
		for(int i = 0; i < solicitado.length; i++){
			solicitado[i] = entrada.nextInt();
			int temporario = 0;
			
		}
		for (int i = 1; i < solicitado.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (solicitado[i] > solicitado[j]) {
		            int temporario = solicitado[i];
		            solicitado[i] = solicitado[j];
		            solicitado[j] = temporario;
		            System.out.println(solicitado[i] + "");
		        }
		    }
		
		for (int r = 0; r < solicitado.length; r++) {
		System.out.println("posição dos numeros " + r + "\n-->" + solicitado[r]);
			}
		}
	}
}
