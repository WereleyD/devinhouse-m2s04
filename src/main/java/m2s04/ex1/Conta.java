package m2s04.ex1;

public abstract class Conta implements Operavel{
    double saldo;
    protected void ObterSaldoAtual(){
        System.out.println("Saldo: R$ " + saldo);
    }
}
