//LUCAS MATULIS TURMA B ID: 1142445383
public class Reserva {
    private Voo voo;
    private Passageiro passageiro;
    private int numeroAssento;
    private String classe;
    private double valorTarifa;

    private Tarifa tarifa;

    public Reserva(){}

    public Reserva(Voo voo, Passageiro passageiro, int numeroAssento, String classe) {
        this.voo = voo;
        this.passageiro = passageiro;
        this.numeroAssento = numeroAssento;
        this.classe = classe;

        if(classe.equalsIgnoreCase("executiva")) {
            tarifa = new TarifaExecutiva();
            this.valorTarifa = tarifa.Valor(voo.getPreco());
        }
        else if(classe.equalsIgnoreCase("economica")){
            tarifa=new TarifaEconomica();
            this.valorTarifa = tarifa.Valor(voo.getPreco());
        }

    }

    @Override
    public String toString() {
        return   passageiro +
                "\nAssento= " + numeroAssento +
                "\nClasse= " + classe +
                "\nValor da Tarifa= " + valorTarifa;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }
}
