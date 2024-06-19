package Automovel;
public interface Veiculo {
        public String placa = "";
        public double velocidademax();
        public void ligar();
        public void desligar();
        public void parar();
        default void buzinar (){
            System.out.println("Buzina");

        }
    }


