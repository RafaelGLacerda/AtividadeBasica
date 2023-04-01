package Atividades;

import java.util.Scanner;

public class atvd25 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int soma = 0;
	for(int i = 0; i < 20; i++) {
		System.out.println("Digite o numero " + (i + 1) + ":");
		int numero = sc.nextInt();
		
		if(numero > 8) {
			soma++;
		}
		
	}
	System.out.println(soma);

}
}
