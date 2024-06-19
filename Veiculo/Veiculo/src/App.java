import Automovel.Carro;
import Automovel.Veiculo; 

class App {

 public static void ligarMoto(Veiculo veiculo) {
    veiculo.ligar();
   }
   
   public static void main(String[]args){
    Veiculo corsa = new Carro();

    App.ligarMoto(corsa);
   }
}   