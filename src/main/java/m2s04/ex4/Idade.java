package m2s04.ex4;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        while (true) {
            try{
                System.out.print("Digite a sua idade: ");
                idade = Integer.parseInt(sc.nextLine());
                testarIdade(idade);
                break;
            } catch (IdadeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("O valor informado é inválido.");
            }
        }

    }

    static void testarIdade(int idade) throws IdadeException{
        if(idade <= 0 || idade > 100) {
            throw new IdadeException("A idade informada deve ser maior que zero e menor que 100 anos");
        } else {
            System.out.println("Olá, você tem " + idade + " anos.");
        }
    }
}
