package tarefa12;


import java.util.Scanner;

public class Questao12 {

	public static void menu(){
		
        System.out.print("| Digite 1 - Aprender\n");
        System.out.print("| Digite 2 - Escrever\n");
        System.out.print("| Digite 3 - Falar\n");
        System.out.print("| Digite 0 - Sair\n");
        
        System.out.print("Digite uma opção: ");
    }
	
	public static void aprender(){
        System.out.println("Você entrou no método aprender.");
    }
    
    public static void escrever(){
        System.out.println("Você entrou no método escrever.");
    }
    
    public static void falar(){
        System.out.println("Você entrou no método falar.");
    }
      
	
	public static void main(String[] args) {

		Scanner menu = new Scanner (System.in);

        int opcao;
       
        do{
            menu();
            opcao = menu.nextInt();
            
            switch(opcao){
            case 1:
            	aprender();
                break;
                
            case 2:
            	escrever();
                break;
                
            case 3:
            	falar();
                break;                
            
            default:
                System.out.println("O programa foi encerrado!!!");
            }
        } while(opcao != 0);
    }
       
}
