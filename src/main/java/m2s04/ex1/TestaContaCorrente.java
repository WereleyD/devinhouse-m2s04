package m2s04.ex1;
public class TestaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        System.out.println("Saldo inicial:");
        cc.ObterSaldoAtual();

        cc.sacar(500.00);

        System.out.println("Saldo após saque:");
        cc.ObterSaldoAtual();

        cc.depositar(600.00);

        System.out.println("Saldo após depósito:");
        cc.ObterSaldoAtual();
    }
}
