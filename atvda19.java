package Atividades;

import java.util.Scanner;

public class atvd19 {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Digite a quantidade de numeros: ");
	int quanti = sc.nextInt();
	
	int[] numeros = new int[quanti];
	int soma = 0;
	for(int i = 0; i < quanti; i++) {
		System.out.print(" " +"Digite o numero " + (1 + i) + ":");
		int numeros2 = sc.nextInt();
		
		soma += numeros2;
		System.out.print(soma);

		
	}
	

}
