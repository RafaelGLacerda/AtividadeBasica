package Atividades;

import java.util.Scanner;

public class atvd27 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int entre100e0 = 0; 
	
	for(int i = 0; i < 20; i++) {
		System.out.print("Digite o nuemro: " + (i + 1) + ":");
		int numero = sc.nextInt();
		
		if(numero <= 100) {
			entre100e0++;
		}
	}
	System.out.println("A quantidade de numeros entre 0 e 100 e: " + entre100e0);
	

}
}
