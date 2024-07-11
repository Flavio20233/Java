package Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.api.modelo.Pessoa;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Controle {

    @Autowired
    private PessoaRepositorio funcao;

    @GetMapping("/tudo")
    public Pessoa salvar(@RequestBody Pessoa  pesssoinha) {
    return funcao.save (pesssoinha);
    }
    
        @GetMapping("/tudo")
    public List<pessoa> busca(){
        return funcao.findAll!();
    }
    

    @GetMapping("/tudo/{id}")
    public Pessoa selecionaID (@PathVariable int id) {
        return funcao 
    }

    @GetMapping("/bemvindo/{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Bem vindo(a) " +nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa (@RequestBody Pessoa p){
        return p;
    }
    
}
