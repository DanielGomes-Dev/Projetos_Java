import java.util.ArrayList;
import java.util.List;

public class Main {    


    List<Emprestimo> emprestimos = new ArrayList<>();

    
    public void realizar_emprestimos(Livro livro, Pessoa pessoa){
        if(!livroJaEmprestado(livro)){
            Emprestimo emprestimo = new Emprestimo(livro, pessoa);
            this.emprestimos.add(emprestimo);
        } else {
            System.out.println("Erro Livro ja emprestado.");
        }

    }

    public boolean livroJaEmprestado(Livro livroAlvo) {
        for (Emprestimo e : this.emprestimos) {
            if (e.getLivro().equals(livroAlvo)) {
                return true; 
            }
        }
        return false; // Percorreu tudo e não encontrou
    }
    
    public void main(String[] args){

        Livro livro_01 = new Livro(
            "0001",
            "1984",
            1984,
            "George"
        );
        
        System.out.println(livro_01.getAutor());
        
        Pessoa pessoa_01 = new Pessoa(
            "Daniel",
            "123.123.123-12",
            "Praia Vermelha"
        );

         Pessoa pessoa_02 = new Pessoa(
            "Daniel_02",
            "123.123.123-13",
            "Praia Vermelha"
        );
        
        
        System.out.println(pessoa_01.getNome());

        realizar_emprestimos(livro_01, pessoa_01);
        realizar_emprestimos(livro_01, pessoa_02);

        

    }
}
