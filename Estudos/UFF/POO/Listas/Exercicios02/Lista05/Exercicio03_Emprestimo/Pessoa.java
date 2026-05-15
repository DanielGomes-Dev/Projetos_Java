public class Pessoa {

    private String nome;
    private String CPF;
    private String endereco;


    public Pessoa (String nome, String CPF, String endereco) {
        System.out.println("Constructor Pessoa Iniciada");
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.CPF;
    }

    public String getEndereco(){
        return this.endereco;
    }
}