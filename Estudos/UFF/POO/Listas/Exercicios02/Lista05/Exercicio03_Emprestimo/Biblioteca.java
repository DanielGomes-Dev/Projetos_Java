
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    List<Emprestimo> emprestimos = new ArrayList<>();

    public boolean livroJaEmprestado(Livro livroAlvo) {
        for (Emprestimo e : this.emprestimos) {
            if (e.getLivro().equals(livroAlvo)) {
                return true; 
            }
        }
        return false; // Percorreu tudo e não encontrou
    }

    public Emprestimo realizar_emprestimos(Livro livro, Pessoa pessoa){
        if(!livroJaEmprestado(livro)){
            Emprestimo emprestimo = new Emprestimo(livro, pessoa);
            this.emprestimos.add(emprestimo);
            return emprestimo;
        } else {
            System.out.println("Erro Livro ja emprestado.");
            return null;
        }

    }

    public void devolver_livro(Emprestimo emprestimo){
        boolean devolvido = emprestimos.remove(emprestimo);       
        if(devolvido){
            System.out.println("Emprestimo Finalizado");
        }else{
            System.out.println("Erro ao finalizar emprestimo");
        }
    }
}