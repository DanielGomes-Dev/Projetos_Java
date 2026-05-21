public class ContaCorrente {
    private int saldo;
    public ContaCorrente (){
        System.out.println("Constructor ContaCorrente");
    }




    public void deposito(int saldo){
        if(saldo <= 0){
            System.out.println("Erro deposito valor invalido");
        }else {
            this.saldo += saldo;
        }
    }
}