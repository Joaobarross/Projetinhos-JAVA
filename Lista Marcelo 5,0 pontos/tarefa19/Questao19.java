package tarefa19;

import javax.swing.JOptionPane;

public class Questao19 {
    public static void main(String[] args) throws Exception {
        String nomeMarca = "Volkswagen";
        int nModelosMarca = 21;
        int anoLancamentoModelo = 1974;
        int codigoIdentificador = 763123;
        String cor = "Prata";
        int chassi = 16823;
        String bairroProprietario = "Centro";
        String ruaProprietario = "Crescêncio Lacerda";
        int nCasaProprietario = 34;
        int velocidadeMaxima = 120;
        int velocidadeAtual = 30;
        int nDePortas = 4;
        boolean tetoSolar = false;
        int nMarchas = 5;
        boolean cambioAutomatico = false;
        double volumeCombustivel = 60;
        Carro c = new Carro (nomeMarca, nModelosMarca, anoLancamentoModelo, codigoIdentificador, ruaProprietario, bairroProprietario, nCasaProprietario, cor, chassi, velocidadeMaxima,  velocidadeAtual, nDePortas, tetoSolar,  cambioAutomatico, volumeCombustivel, nMarchas);
        JOptionPane.showMessageDialog(null, c.imprimir());
        JOptionPane.showMessageDialog(null, "Acelerando");
        c.aceleraCarro();
        JOptionPane.showMessageDialog(null, "Velocidade atual: " + c.getVelocidadeAtual());
        JOptionPane.showMessageDialog(null, "Freiando");
        c.freiaCarro();
        JOptionPane.showMessageDialog(null, "Velocidade atual: " + c.getVelocidadeAtual());
        c.trocaMarcha();
        JOptionPane.showMessageDialog(null, "Trocou de marcha!!");
        JOptionPane.showMessageDialog(null, "Marcha atual: " + c.getMarcha());
        c.reduzMarcha();
        JOptionPane.showMessageDialog(null, "Reduziu a marcha!!");
        JOptionPane.showMessageDialog(null, "Marcha atual: " + c.getMarcha());
        c.marchaRé();
        JOptionPane.showMessageDialog(null, "Dando marcha ré");
        JOptionPane.showMessageDialog(null, "Marcha atual: " + c.getMarcha());
        
    }
}
