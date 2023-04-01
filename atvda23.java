
package Atividades;

import java.util.Scanner;

public class atvd23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int idadeMaisNova = Integer.MAX_VALUE;
    String nomeMaisNovo = "";

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o nome da pessoa " + i + ": ");
      String nome = scanner.nextLine();

      System.out.print("Digite a idade da pessoa " + i + ": ");
      int idade = scanner.nextInt();
      scanner.nextLine();

      if (idade < idadeMaisNova) {
        idadeMaisNova = idade;
        nomeMaisNovo = nome;
      }
    }

    System.out.println("A pessoa mais nova: " + nomeMaisNovo);

    scanner.close();
  }
}
