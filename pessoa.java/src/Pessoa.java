public class Pessoa{
    
        private String nome;
        private int idade;
        private char sexo;

        public Pessoa (String nomePessoa,int idadePessoa,char sexoPessoa){
            nome = nomePessoa;
            idade = idadePessoa;
            sexo = sexoPessoa;
        }

        public String getPessoa(){
            String info = " pessoa se chama " + nome + ", tem a idade de " + idade +
            "anos" + " e e do sexo " + sexo ;
            return info;
        }

    }

