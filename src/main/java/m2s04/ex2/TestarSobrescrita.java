package m2s04.ex2;

public class TestarSobrescrita {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        System.out.println("Funcionário: " + f.ObterCargo());
        System.out.println("Gerente: " + g.ObterCargo());
    }
}

