import javax.swing.*;
//LUCAS MATULIS TURMA B ID: 1142445383
public class TarifaExecutiva extends Tarifa{

    private int itensRefeicao;



    public double Valor(double precoVoo){
        itensRefeicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens que o passageiro escolheu do cardapio"));

        precoVoo = (precoVoo * 1.5)*((0.01 * itensRefeicao)+1);

        return precoVoo;
    }
}
