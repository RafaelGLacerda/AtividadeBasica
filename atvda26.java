package Atividades;

import java.util.Scanner;

public class atvd26 {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int pares = 0;
	        
	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o " + (i + 1) + " numero: ");
	            int numero = sc.nextInt();
	            
	      
		            if (numero % 2 == 0) {
		                pares++;
		            } 
		            
		            	
		           
		            }
	        System.out.println("numeros pares: " + pares);
		           
	    } 
	       
	    }
	
