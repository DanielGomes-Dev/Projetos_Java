
public class Emprestimo {

    private Livro livro;
    private Pessoa pessoa;

    public Emprestimo (Livro livro, Pessoa pessoa){
        System.out.println("Emprestimo Realizado");
        this.livro = livro;
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return this.livro;
    }

    
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    
}