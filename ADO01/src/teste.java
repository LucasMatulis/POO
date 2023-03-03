import javax.swing.*;

public class teste {
    public static void main(String[] args) {

        AcessoConta acessoConta= new AcessoConta();
        String nome;
        String senha;
        int tentaivas=5;

        acessoConta.setNome(JOptionPane.showInputDialog("Crie o nome do usuario"));
        acessoConta.setSenha(JOptionPane.showInputDialog("Crie a senha do usuario"));


        do {
            nome=JOptionPane.showInputDialog("Digite o nome do usuario");
            senha=JOptionPane.showInputDialog("Digite a senha do usuario");

            if(!acessoConta.VerificarConta(senha,nome)) {
                System.out.println("Nome ou senha incorreto tente novamente");
                tentaivas--;

            }

            if(tentaivas<=0){
                System.out.println("Maximo de tentativas alcançadas, bloqueando acesso");
                break;
            }

        }while(!acessoConta.VerificarConta(senha,nome));

        if(acessoConta.VerificarConta(senha,nome)){
            System.out.println("Acesso concedido");


        }






    }
}
