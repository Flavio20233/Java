package Automovel;
public class Carro implements Veiculo,Propietario {
    public void ligar(){
        System.out.println("ligando o carro");

    }
    public void desligar(){
        System.out.println("Desligando");
    }
    public void parar(){
        System.out.println("Parando o carro!");
    }
    public double velocidademax(){
        return 0;
    }
    
public String getNome(String nome){
    return nome ;
}
public String getEndereco(){
    return "Ceilandia";
}
}



