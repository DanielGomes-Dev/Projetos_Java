public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Daniel Gomes");
        aluno1.setTrabalho1(8.0);
        aluno1.setP1(7.5);
        aluno1.setTrabalho2(9.0);
        aluno1.setP2(8.5);
        
        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Status: " + aluno1.verificarStatus());
        System.out.println("-----------------------------------");

        Aluno aluno2 = new Aluno("Maria Betania");
        aluno2.setTrabalho1(5.0);
        aluno2.setP1(4.0);
        aluno2.setTrabalho2(5.5);
        aluno2.setP2(6.0);
        
        System.out.println("Aluno: " + aluno2.getNome());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Status: " + aluno2.verificarStatus());
        System.out.println("-----------------------------------");

        Aluno aluno3 = new Aluno("Carlos Santos");
        aluno3.setTrabalho1(2.0);
        aluno3.setP1(3.0);
        aluno3.setTrabalho2(1.5);
        aluno3.setP2(4.0);
        
        System.out.println("Aluno: " + aluno3.getNome());
        System.out.println("Média: " + aluno3.calcularMedia());
        System.out.println("Status: " + aluno3.verificarStatus());
        System.out.println("-----------------------------------");

    }
}