package Atividades;

import java.util.Scanner;

public class atvd13 {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        // Solicita ao usuário os valores de a, b e c
		        System.out.print("Input a: ");
		        double a = sc.nextDouble();
		        System.out.print("Input b: ");
		        double b = sc.nextDouble();
		        System.out.print("Input c: ");
		        double c = sc.nextDouble();
		        
		        // Calcula o discriminante
		        double discriminante = Math.pow(b, 2) - 4*a*c;
		        
		        // Verifica o valor do discriminante e imprime as raízes correspondentes
		        if (discriminante > 0) {
		            double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
		            double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
		            System.out.println("As raízes são " + x1 + " e " + x2);
		        } else if (discriminante == 0) {
		            double x = -b / (2*a);
		            System.out.println("A raiz dupla é " + x);
		        } else {
		            System.out.println("A equação não possui raízes reais.");
		        }
		        
		        sc.close();
		    }	
		
	}
