package loja.usuarios;


public class Cliente extends Usuario {
    private String cpf;
    private String email;
    private String endereco;

    public Cliente(String nome, String senha, String cpf, String email, String endereco) {
        super(nome, senha); 
        this.setCpf(cpf);
        this.setEmail(email);
        this.setEndereco(endereco);
    }


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        } else {
            System.out.println("Erro: CPF inválido ou vazio.");
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Erro: E-mail inválido. Deve conter '@'.");
        }
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.trim().isEmpty()) {
            this.endereco = endereco;
        } else {
            System.out.println("Erro: Endereço inválido ou vazio.");
        }
    }
}