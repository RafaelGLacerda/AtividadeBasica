package Atividades;

import java.util.Scanner;

public class atvd24 {
public static void main(String[] args) {
	
	
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um numero inteiro: ");
    int numero = scanner.nextInt();

    int soma = 0;
    while (numero > 0) {
        int digito = numero % 10;
        soma += digito;
        numero /= 10;
    }

    System.out.println("A soma dos digitos e: " + soma);
}
}
