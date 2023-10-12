package m2s04.ex3;

public class Produto implements Tributavel{
    double valor = 52.00;
    double valorImposto = 15.00;
    @Override
    public void calcularValorComImposto() {
        System.out.println("Valor com imposto: R$ " + (valor + valorImposto));
    }
}
