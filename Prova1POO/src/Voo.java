
//LUCAS MATULIS TURMA B ID: 1142445383
public class Voo {

    private String numeroVoo;
    private String origem;
    private String destino;
    private String horaPartida;
    private String diaPartida;
    private String horaChegada;
    private String diaChegada;
    private int capacidadeAeronave;
    private double preco;

    public Voo(){

    }

    public Voo(String numeroVoo, String origem, String destino, String horaPartida, String diaPartida, String horaChegada, String diaChegada, int capacidadeAeronave, double preco) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.diaPartida = diaPartida;
        this.horaChegada = horaChegada;
        this.diaChegada = diaChegada;
        this.capacidadeAeronave = capacidadeAeronave;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return
                "Numero do voo=" + numeroVoo +
                "\nOrigem=" + origem +
                "\nDestino=" + destino +
                "\nHora de Partida=" + horaPartida +
                "\nDia de Partida=" + diaPartida +
                "\nHora de Chegada=" + horaChegada +
                "\nDia de Chegada=" + diaChegada +
                "\nCapacidade da Aeronave=" + capacidadeAeronave +
                "\nPreco=" + preco;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getDiaPartida() {
        return diaPartida;
    }

    public void setDiaPartida(String diaPartida) {
        this.diaPartida = diaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getDiaChegada() {
        return diaChegada;
    }

    public void setDiaChegada(String diaChegada) {
        this.diaChegada = diaChegada;
    }

    public int getCapacidadeAeronave() {
        return capacidadeAeronave;
    }

    public void setCapacidadeAeronave(int capacidadeAeronave) {
        this.capacidadeAeronave = capacidadeAeronave;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
