

public class Main {    

    
    public static void main(String[] args){

        Biblioteca biblioteca = new Biblioteca();


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

        Emprestimo emprestimo01 = biblioteca.realizar_emprestimos(livro_01, pessoa_01);
        Emprestimo emprestimo02 = biblioteca.realizar_emprestimos(livro_01, pessoa_02);

        biblioteca.devolver_livro(emprestimo01);

        Emprestimo emprestimo03 = biblioteca.realizar_emprestimos(livro_01, pessoa_02);


    }
}
