package Atividades;

import java.util.Scanner;

public class atvd22 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	
	int soma = 0;
	
	for(int i = 0; i < 20; i++) {
		
		System.out.print(" " +"Digite a idade da pessoa " + (1 + i) + ":");
		int numeros = sc.nextInt();
		
		if(numeros>=18) {
			System.out.println("Maior de Idade");
		} else
			System.out.println("Menor de Idade");
	}
	
	
	
	
	
}
}
