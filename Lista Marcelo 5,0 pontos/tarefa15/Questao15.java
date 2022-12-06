package tarefa15;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        
    	String livro, nome;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        nome = scan.nextLine();
        
        System.out.println("Digite o nome do livro que deseja");
        livro = scan.nextLine();
        
        
        System.out.println("  Aqui está = o livro " +livro+ "  será emprestado para: " +nome);
    }
}
