package Atividades;

import java.util.Scanner;

public class atvd28 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int entre100e0 = 0; 
	int entre101e200 = 0;
	int Maiorq200 = 0;
	
	for(int i = 0; i < 20; i++) {
		System.out.print("Digite o nuemro: " + (i + 1) + ":");
		int numero = sc.nextInt();
		
		if(numero <= 100) {
			entre100e0++;
		} if((numero >= 101) && (numero <= 200)) {
			
		}
			entre101e200++;
			if(numero >= 201) {
				Maiorq200++;
			}
		
	}
	System.out.println("A quantidade de numeros entre 0 e 100 e: " + entre100e0);
	System.out.println("A quantidade de numeros entre 101 e 200 e: " + entre101e200);
	System.out.println("A quantidade de numeros mais de 200 e: " + Maiorq200);
}
}
