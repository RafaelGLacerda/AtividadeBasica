package Atividades;

import java.util.Scanner;

public class atvd20 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int soma = 0;
		for(int i = 0; i < 20; i++) {
			System.out.print(" " +"Digite a idade da pessoa " + (1 + i) + ":");
			int numeros2 = sc.nextInt();
			
			soma += numeros2;
			System.out.print(soma);

		}	
		
	}		
}
