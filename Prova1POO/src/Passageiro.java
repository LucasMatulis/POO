//LUCAS MATULIS TURMA B ID: 1142445383
public class Passageiro {
    private String nome;
    private int idade;
    private String numeroPassaporte;

    public Passageiro( ){}

    public Passageiro(String nome, int idade, String numeroPassaporte) {
        this.nome = nome;
        this.idade = idade;
        this.numeroPassaporte = numeroPassaporte;
    }

    @Override
    public String toString(){

        return "Nome: "+nome+"\nIdade: "+idade+"\nNumero do Passaporte: "+numeroPassaporte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }
}
