public class ContaCorrente {
    private String numeroConta;
    private double saldoConta;


    public void Saque(double s){

        if(s>saldoConta) {
            System.out.println("Valor invalido para o saque!!");
        }
        else {
            System.out.println("Valor sacado com sucesso!!");
            saldoConta -= s;
        }
    }

    public void Deposito(double d){

        if(d>0){
            saldoConta+=d;
            System.out.println("Valor depositado com sucesso!!");
        }
        else {
            System.out.println("Valor invalido para deposito!");
        }



    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
