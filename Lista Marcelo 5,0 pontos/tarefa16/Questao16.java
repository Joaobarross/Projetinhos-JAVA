package tarefa16;

import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		
		int quantidade;
		Double opcao, opcao2;
		Scanner scan = new Scanner(System.in);
		Double calculo;
		Double pagamento;
		Double arroz = 4.8, feijao = 8.5, macarrao = 3.9, sardinha = 4.3, maionese = 2.5;
		
		
		System.out.println("escolha uma das opçoes a seguir");
		System.out.println("01 = Lista de Produtos");
		System.out.println("02 = Fazer compra");
		opcao = scan.nextDouble();
		
		if(opcao == 1) {
			
			System.out.println("1 = arroz - 4.80 estoque = 1000qnt");
			System.out.println("2 = feijao - 8.50 estoque = 1000qnt");
			System.out.println("3 = macarrão - 3.90 estoque = 1000qnt");
			System.out.println("4 = sardinha - 4.30 estoque = 1000qnt");
			System.out.println("5 = maionese - 2.50 estoque = 1000qnt");
			
		}
		
		else if(opcao==2) {
		
			
			System.out.println("Digite o codigo do produto que deseja comprar");
			opcao2 = scan.nextDouble();
			
			System.out.println("Digite a quantidade que você deseja");
			quantidade = scan.nextInt();
			
			
			if(opcao2==1) {
				calculo = 4.80 * quantidade;
				
				System.out.println("o total da compra é:"+ calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto = arroz");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto = arroz");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto = arroz");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Dinheiro");
				}
				
				
			}
		
			if(opcao2==2) {
				calculo = 8.5 * quantidade;
				
				System.out.println("o total da compra é:"+ calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto = feijão");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto = feijão");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto = feijão");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Dinheiro");
				}
		}
			
			if(opcao2==3) {
				calculo = 3.9 * quantidade;
				
				System.out.println("o total da compra é:"+ calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto = macarrão");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto = macarrão");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto = macarrão");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Dinheiro");
				}
		}
			
			if(opcao2==4) {
				calculo = 4.3 * quantidade;
				
				System.out.println("o total da compra é:"+ calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto = sardinha");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto = sardinha");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto = sardinha");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Dinheiro");
				}
		}
			
			if(opcao2==5) {
				calculo = 4.3 * quantidade;
				
				System.out.println("o total da compra é:"+ calculo);
				
				System.out.println("Como deseja pagar?\n 1 = Cartão\n 2 = Cheque\n 3 = Dinheiro");
				pagamento = scan.nextDouble();
				
				if (pagamento == 1) {
					System.out.println("Produto = maionese");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cartão");
				}
				
				else if (pagamento == 2){
					System.out.println("Produto = maionese");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Cheque");
				}
				else if(pagamento == 3) {
					System.out.println("Produto = maionese");
					System.out.println("Quantidade ="+quantidade);
					System.out.println("Total da compra ="+calculo);
					System.out.println("Forma de pagamento = Dinheiro");
				}
		}
	}
	}
}
		
	
	


