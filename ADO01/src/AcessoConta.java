public class AcessoConta {
    private String nome;
    private String senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public boolean VerificarConta(String senha,String nome){

        if(this.nome.equals(nome) && this.senha.equals(senha))
            return true;

        return false;
    }
}
