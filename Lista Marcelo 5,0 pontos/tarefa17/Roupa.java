package tarefa17;

public class Roupa {
	String cor;
	String tamanho;
	String marca;
		
	public Roupa (String tamanho, String cor, String marca){
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
        
    }
    public String Imprimir(){
        return"Tamanho: " + getTamanho() + "\n" + "Cor: " + getCor() + "\n" +
        	       "Marca: " + getMarca(); 
    }
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
    
}
