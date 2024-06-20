package Populacao;

public class Filho implements Pai, Mae {
    private String nome;
    private int idade;


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

    @Override
    public double altura(double altura) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean barba(boolean tem) {
        // TODO Auto-generated method stub
        return tem;
    }

    @Override
    public boolean calvice(double tera) {
        // TODO Auto-generated method stub

        return true;
    }
   
   

    @Override
    public String corOlhos(String cor) {
// TODO Auto-generated method stub
        return null;
    }

    @Override
    public String corOlhos (String corA, String corB) {
        if(corA.equals(corB))
        return corA;
        else if(corA.equals("castanho") && corB.equals("Azul"))
        return corA;
        else if (corA.equals("Azul") && corB.equals("Verde"))
        return corB;
        else
        return corB;
    }

    @Override
    public String corPele(String cor) {
        // TODO Auto-generated method stub
        return cor;
    }

    @Override
    public String tipoCabelo(String tipo) {
        // TODO Auto-generated method stub
        return null;
    }
}

