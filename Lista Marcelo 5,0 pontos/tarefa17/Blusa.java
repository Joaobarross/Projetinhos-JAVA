package tarefa17;

public class Blusa extends Roupa{
	String regata;
	String supreme;
	
	public Blusa(String tamanho, String cor, String marca, String regata, String mangaLonga) {
		super(tamanho, cor, marca);
		
	}
	
	public String Imprimir(){
        System.out.println("Tamanho: " + super.getTamanho() + "\n" + "Cor: " + super.getCor() + "\n" +
        	       "Marca: " + super.getMarca() +"\n" + "Tipo: " + regata + "\n" + supreme);
		return regata;
	}
	
}
