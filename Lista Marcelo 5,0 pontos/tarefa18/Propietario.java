package tarefa18;

public class Proprietario {
	    private String Nome;
	    private String Rg;
	    private String Cpf;
	    private String Datadenascimento;
	    private String Rua;
	    private String Bairro;
	    private String Cidade;
	    private String Estado;

	    
	    
	    public void cadastroP(String Nome, String Rg,String Cpf,String Datadenascimento,String Rua,String Bairro,String Cidade,String Estado) {
	    	this.Nome=Nome;
	    	this.Rg=Rg;
	    	this.Cpf=Cpf;
	    	this.Datadenascimento=Datadenascimento;
	    	this.Rua=Rua;
	    	this.Bairro=Bairro;
	    	this.Cidade=Cidade;
	    	this.Estado=Estado;
	    }
	        
	    
	    public String getNome() {
	        return Nome;
	    }
	    public String getRg() {
	        return Rg;
	    }
	    public String getCpf() {
	        return Cpf;
	    }
	    public String getDatadenascimento() {
	        return Datadenascimento;
	    }
	    public String getRua() {
	        return Rua;
	    }
	    public String getBairro() {
	        return Bairro;
	    }
	    public String getCidade() {
	        return Cidade;
	    }
	    public String getEstado() {
	        return Estado;
	    }


	    public void setNome(String Nome) {
	        this.Nome=Nome;
	    }
	    public void setRg(String Rg) {
	        this.Rg=Rg;
	    }
	    public void setCpf(String Cpf) {
	        this.Cpf=Cpf;
	    }
	    public void setgetDatadenascimento(String getDatadenascimento) {
	        this.Datadenascimento=getDatadenascimento;
	    }
	    public void setRua(String Rua) {
	        this.Rua=Rua;
	    }
	    public void setBairro(String Bairro) {
	        this.Bairro=Bairro;
	    }
	    public void setCidade(String Cidade) {
	        this.Cidade=Cidade;
	    }
	    public void setEstado(String Estado) {
	        this.Estado=Estado;
	    }

	
}
