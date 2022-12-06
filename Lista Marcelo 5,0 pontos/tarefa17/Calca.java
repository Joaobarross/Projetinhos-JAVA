package tarefa17;

public class Calca extends Roupa {
	String jeans;
	String nike;
	
	public Calca(String tamanho, String cor, String marca, String regata, String mangaLonga) {
		super(tamanho, cor, marca);
	}
	
	public String Imprimir(){
        return"Tamanho: " + super.getTamanho() + "\n" + "Cor: " + super.getCor() + "\n" +
        	       "Marca: " + super.getMarca() +"\n" + "Tipo: " + jeans + "\n" + nike;
	}
}
