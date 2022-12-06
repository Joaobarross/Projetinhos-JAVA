package tarefa20;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Executavel {
    public static void main(String[] args) throws Exception {
        ArrayList emissoresCarbono = new ArrayList<>();
        int nPessoas = 3;
        boolean energiaRenovavel = false;
        int nLampadas = 5;
        boolean arCondicionado = true;
        Construtor construcao = new Construtor(nPessoas, energiaRenovavel, nLampadas, arCondicionado);
        emissoresCarbono.add(construcao);
        int nPessoas2 = 4;
        boolean energiaRenovavel2 = false;
        int nLampadas2 = 4;
        boolean arCondicionado2 = false;
        Construtor construcao2 = new Construtor(nPessoas2, energiaRenovavel2, nLampadas2, arCondicionado2);
        emissoresCarbono.add(construcao2);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + construcao.getCarbonFootprint());
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + construcao2.getCarbonFootprint());
        String combustivel = "aditivada";
        int cilindrada = 2;
        Carro carro = new Carro (combustivel, cilindrada);
        emissoresCarbono.add(carro);
        JOptionPane.showMessageDialog(null, "Emissao de carbono: " + carro.getCarbonFootprint());
        int cilindrada2 = 5;
        
    }
}
