public class Livro {

    private String code;
    private String name;
    private int ano;
    private String autor;

    public Livro (String code, String name, int ano, String autor) {
        System.out.println("Constructor Livro Iniciada");
        this.code = code;
        this.name = name;
        this.ano = ano;
        this.autor = autor;

    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }
    
    public int getAno(){
        return this.ano;
    }

    
    public String getAutor(){
        return this.autor;
    }

}