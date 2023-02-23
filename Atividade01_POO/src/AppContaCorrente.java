import javax.swing.*;

public class AppContaCorrente {
    public static void main(String[] args) {

        int n=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de contas"));

        char opcao;

        Agencia agencia[]=new Agencia[n];
        ContaCorrente contaCorrente[]= new ContaCorrente[n];
        String nAgencia;
        String nContacorrente;
        boolean acesso=false;

        for(int i=0;i<agencia.length;i++){

            Agencia agencia1=new Agencia();
            ContaCorrente contaCorrente1=new ContaCorrente();

            agencia1.setIdAgencia(JOptionPane.showInputDialog("Crie o id da agencia "+(i+1)));
            agencia1.setNomeAgencia(JOptionPane.showInputDialog("Crie o nome da agencia "+(i+1)));
            contaCorrente1.setNumeroConta(JOptionPane.showInputDialog("Crie o numero da conta "+(i+1)));
            contaCorrente1.setSaldoConta(Double.parseDouble(JOptionPane.showInputDialog("Defina o saldo da conta "+(i+1))));

            contaCorrente[i]=contaCorrente1;
            agencia[i]=agencia1;

        }

        nAgencia=JOptionPane.showInputDialog("Digite o numero da Agencia");
        nContacorrente=JOptionPane.showInputDialog("Digite o numero da Conta");

    }
}
