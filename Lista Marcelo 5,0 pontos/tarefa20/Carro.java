package tarefa20;

public class Carro implements CarbonFootprint {
    private int pegadasCarbono;

    public Carro(String combustivel, int cilindrada) {
		
	}

	public int getCarbonFootprint() {
        pegadasCarbono = (int) 2.12;
        return pegadasCarbono;
    }
}
