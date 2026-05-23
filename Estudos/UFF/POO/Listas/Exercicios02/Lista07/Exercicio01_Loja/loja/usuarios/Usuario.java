package loja.usuarios;

public abstract class Usuario {
    protected String nome;
    protected String senha;

    public Usuario(String nome, String senha) {
        this.setNome(nome);
        this.setSenha(senha);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome não pode ser vazio.");
        }
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        if (senha != null) {
            this.senha = senha;
        } else {
            System.out.println("Erro: A senha nao pode se vazia.");
        }
    }
}