package tarefa01; 

import java.util.Scanner;

public class  Questao01 {
	Scanner scan = new Scanner(System.in);

	double Distancia;
	double VelocidadeMedia;
	double TempoGasto;
	double LitrosUsados;
	double Autonomia = 12;
	
	public static void main(String[] args) {
		Questao01 ex01 = new Questao01();
		
		System.out.println("Programa que calcula a quantidade de litros de combustível gasta \n\n");
		ex01.medias();
	}
    public void medias() {


        System.out.println("Digita o tempo que você gastou em sua viagem (horas): ");
        TempoGasto = scan.nextDouble();

        System.out.println("Digite o Velocidade Média em que você você fez o percurso (Km/h): ");
        VelocidadeMedia = scan.nextDouble();


        Distancia = VelocidadeMedia * TempoGasto;
        LitrosUsados = Distancia / Autonomia;


        System.out.print("\nnResultados:\n");
        System.out.print("Velocidade média do trajeto = " + VelocidadeMedia + " Km/h\n");
        System.out.print("Tempo gasto durante o percurso = " + TempoGasto + " horas\n");
        System.out.print("Distancia Percorrida = " + Distancia + " Km\n");
        System.out.print("Combustível gasto = " + LitrosUsados + " litros\n");

    }

}
