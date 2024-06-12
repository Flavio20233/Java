package Escola;

public class Escola {
    public static void main(String[]args){
        Aluno Damarcones = new Aluno ();
        Damarcones.setNome (" Damarcones Porto");
        Damarcones.setIdade(29);
        Damarcones.setNota(7);

        System.out.println("O Nome do aluno e:" + Damarcones.getNome());
        System.out.println("A idade do aluno e:" + Damarcones.getNome());
        System.out.println("A media final do Aluno:" + Damarcones.getNota());

    }
}
