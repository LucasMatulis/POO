import javax.swing.*;
//LUCAS MATULIS TURMA B ID: 1142445383
public class App {
    public static void main(String[] args) {
         String numeroVoo= JOptionPane.showInputDialog("Digite o numero do voo");
         String origem=JOptionPane.showInputDialog("Digite a origem do voo");
         String destino=JOptionPane.showInputDialog("Digite o destino do voo");
         String horaPartida=JOptionPane.showInputDialog("Digite a hora de partida do voo");
         String diaPartida=JOptionPane.showInputDialog("Digite o dia partida do voo");
         String horaChegada=JOptionPane.showInputDialog("Digite a hora de chegada do voo");
         String diaChegada=JOptionPane.showInputDialog("Digite o dia de chegada do voo");
         int capacidadeAeronave=Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade de passageiros na Aeronave"));
         double preco=Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do voo"));
         Voo voo= new Voo(numeroVoo,origem,destino,horaPartida,diaPartida,horaChegada,diaChegada,capacidadeAeronave,preco);

         String classes[]={"economica","executiva"};

         Reserva reserva[]=new Reserva[capacidadeAeronave];

         int escolha;

         for(int i=0;i<capacidadeAeronave;i++){
             Reserva reserva1= new Reserva();

             escolha=JOptionPane.showConfirmDialog(null,"Deseja adicionar um passageiro?");

             if (escolha == 0) {

                 String classe;
                 escolha=JOptionPane.showOptionDialog(null, "Classe do passageiro","",
                         JOptionPane.DEFAULT_OPTION,
                         JOptionPane.INFORMATION_MESSAGE, null, classes, classes[0]);
                 if(escolha==0){
                     classe="economica";
                 }
                 else{
                     classe="executiva";
                 }

                 int numeroAssento=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero no assento"));


                 reserva1=new Reserva(voo,criarPassageiro(),numeroAssento,classe);

                 reserva[i]=reserva1;


                 System.out.println("INFORMAÇÕES DO VOO");
                 System.out.println(voo);
                 System.out.println("---------------------------------------------------------------------");
                 System.out.println("RESERVA DO PASSAGEIRO");
                 System.out.println(reserva[i]);
                 System.out.println("-----------------------------------------------");
             }
            else {
                 break;
             }
         }

    }

    public static Passageiro criarPassageiro(){

        String nome = JOptionPane.showInputDialog("Digite o nome do passageiro");
        int idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do passageiro"));
        String numeroPassaporte=JOptionPane.showInputDialog("Digite o numero de passaporte do passageiro");

        Passageiro passageiro= new Passageiro(nome,idade,numeroPassaporte);

        return passageiro;

    }


}
