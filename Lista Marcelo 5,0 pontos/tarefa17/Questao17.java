package tarefa17;

import javax.swing.JOptionPane; 

public class Questao17 {
	public static void main(String[] jao) {
		String cor;
		String tamanho;
		String marca;
		int calculo = 0;
		
		calculo = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja executar?" + "\n"
	                + "1 - Registrar roupa" + "\n" + "2 - Imprimir informaçoes da roupa" + "\n" + "0-sair"));
		
		while(calculo!=0){

            
	        
            switch (calculo) {
                 case 1: {
                    marca = JOptionPane.showInputDialog(null, "Digite a marca");
                    tamanho = JOptionPane.showInputDialog(null, "Digite o tamanho");
                    cor = JOptionPane.showInputDialog(null, "Digite a cor");
                    Roupa rp1 = new Roupa(tamanho, cor, marca);
                    JOptionPane.showInputDialog(null, rp1.Imprimir());
                     break;

                } 
                case 2: {
                    tamanho = JOptionPane.showInputDialog(null, "Digite o tamanho");
                    cor = JOptionPane.showInputDialog(null, "Digite a cor");
                    marca = JOptionPane.showInputDialog(null, "Digite a marca");
                    
                  
                    Roupa rp = new Roupa(tamanho, cor, marca);
                    break;

                }
                case 0:{
                    break;
                }
                
            }
            calculo = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja execultar?" + "\n"
        + "1-Registrar roupa" + "\n" + "2- Imprimir informaçoes da roupa" + "\n" + "sair"));
		}
	}
}
