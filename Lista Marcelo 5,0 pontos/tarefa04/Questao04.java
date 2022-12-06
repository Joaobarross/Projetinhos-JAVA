package terefa04;

import java.util.Scanner;

public class Questao04 {
    Scanner entrada = new Scanner(System.in);
    int[] solicitado = new int[4];
    int temporario = 0;

       public static void main(String[] args) {
        Questao04 q04 = new Questao04();

        q04.ordemCrescente();
    }

    public void ordemCrescente() {
        System.out.println("insira 4 numeros aleatorios");
        for(int i = 0; i < solicitado.length; i++){
            solicitado[i] = entrada.nextInt();

        }
        for (int i = 0; i < solicitado.length; i++) {
            for (int j = 0; j < solicitado.length - 1; j++) {
                if (solicitado[j] > solicitado[j + 1]) {
                    temporario = solicitado[j];
                    solicitado[j] = solicitado[j + 1];
                    solicitado[j + 1] = temporario;
                }
            }
        }

        for (int i = 0; i < solicitado.length; i++) {
        System.out.println("posição " + i + "\n===>" + solicitado[i]);
        }
    }

}
