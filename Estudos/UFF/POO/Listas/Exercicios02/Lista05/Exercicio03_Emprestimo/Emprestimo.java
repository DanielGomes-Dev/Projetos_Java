import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    Livro livro;
    Pessoa pessoa;

    public Emprestimo (Livro livro, Pessoa pessoa){
        System.out.println("Constructor Emprestimo");
        this.livro = livro;
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }
    
    
}