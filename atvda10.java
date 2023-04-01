package Atividades;

import java.util.Scanner;

public class atvd10 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);

		  
		    System.out.print("Digite o valor do salário mínimo: ");
		    double salarioMinimo = sc.nextDouble();

		    
		    System.out.print("Digite o valor do salário do funcionário: ");
		    double salarioFuncionario = sc.nextDouble();

		    
		    double quantidadeSalarios = salarioFuncionario / salarioMinimo;

		    
		    System.out.println("O funcionário ganha " + quantidadeSalarios + " salários mínimos.");
		}
		}
