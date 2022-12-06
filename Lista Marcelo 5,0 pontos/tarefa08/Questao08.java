package tarefa08;
import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		

		        Double raio;
		        Double volume;
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("insira o raio da esfera");
		        raio = scan.nextDouble();

		        volume = 4 * 3.14 * raio * raio *raio / 3;

		    if  (raio < 0){
		        System.out.println("valor invalido!!!");
		    }


		    else{
		        System.out.println("o volume da esfera é ="+volume);
		    }

		}



	}


