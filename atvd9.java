package Atividades;

import java.util.Scanner;

public class atv9 {
	public static void main(String[] args) {
		
		
		        Scanner input = new Scanner(System.in);

		       
		        System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
		        double ipi = input.nextDouble();

		        
		        System.out.print("Digite o código da peça 1: ");
		        int codigo1 = input.nextInt();
		        System.out.print("Digite o valor unitário da peça 1: ");
		        double valor1 = input.nextDouble();
		        System.out.print("Digite a quantidade de peças 1: ");
		        int quant1 = input.nextInt();

		     
		        System.out.print("Digite o código da peça 2: ");
		        int codigo2 = input.nextInt();
		        System.out.print("Digite o valor unitário da peça 2: ");
		        double valor2 = input.nextDouble();
		        System.out.print("Digite a quantidade de peças 2: ");
		        int quant2 = input.nextInt();

		      
		        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
		        System.out.printf("O valor total a ser pago é: R$ ", total);

		        input.close();
		    }
		}

