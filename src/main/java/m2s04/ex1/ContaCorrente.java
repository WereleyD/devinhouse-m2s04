package m2s04.ex1;

public class ContaCorrente extends Conta{
    double saldo = 1000.00;
    protected void ObterSaldoAtual(){
        System.out.println(saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }
}
