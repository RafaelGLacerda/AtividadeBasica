package Atividades;
import java.util.Scanner;

public class atvd29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        while (true) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
