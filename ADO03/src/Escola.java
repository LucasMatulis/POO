import javax.swing.*;

public class Escola {
    public static void main(String[] args) {
        Pessoa p=null;


        String pessoa= JOptionPane.showInputDialog("Digite para que enviar o email\nProfessor, aluno ou funcionario");

        if(pessoa.equalsIgnoreCase("professor")){

            p=new Professor();
        }
        else if((pessoa.equalsIgnoreCase("aluno"))){
            p=new Aluno();
        }
        else if( pessoa.equalsIgnoreCase("funcionario")){

            p=new Funcionario();

        }

        p.email();
    }
}
