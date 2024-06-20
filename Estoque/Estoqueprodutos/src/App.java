import Populacao.Filho;

public class App {
    public static void main(String[] args) throws Exception {
        Filho filho =  new Filho();

        filho.setNome("Flavio");
        filho.setIdade(46);

        System.out.println("Nome:" + filho.getNome());
        System.out.println("Idade:" + filho.getIdade());

        System.out.println("Altura:" + filho.altura(1.78));
        System.out.println("Tem barba:" + filho.barba (true));
        System.out.println("Calvice:" + filho.calvice (filho.altura(1.78)));
        System.out.println("Cor dos olhos:" + filho.corOlhos ("castanho"));
        System.out.println("Cor da pele:" + filho.corPele ("Pardo"));
        System.out.println("Tipo do cabelo :" + filho.tipoCabelo ("Ondulado"));

        
    }
}
