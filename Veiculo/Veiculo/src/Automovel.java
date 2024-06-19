import Automovel.Carro;
import Automovel.Veiculo; 

    class App {

 public static void ligarMoto(Veiculo veiculo) {
    veiculo.ligar();
   }
   public static void maim(String[]args){
    Veiculo corsa = new Carro();

    App.ligarMoto(corsa);
   }
}   
    




