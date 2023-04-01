package Atividades;

import java.util.Scanner;

public class atvd14 {
	public static void main(String[] args) {

		
		    Scanner input = new Scanner(System.in);

		    System.out.print("Digite o primeiro número: ");
		    int num1 = input.nextInt();

		    System.out.print("Digite o segundo número: ");
		    int num2 = input.nextInt();

		    System.out.print("Digite o terceiro número: ");
		    int num3 = input.nextInt();

		    if (num1 <= num2 && num1 <= num3) {
		      System.out.print(num1 + " ");

		      if (num2 <= num3) {
		        System.out.print(num2 + " ");
		        System.out.print(num3 + " ");
		      } else {
		        System.out.print(num3 + " ");
		        System.out.print(num2 + " ");
		      }
		    } else if (num2 <= num1 && num2 <= num3) {
		      System.out.print(num2 + " ");

		      if (num1 <= num3) {
		        System.out.print(num1 + " ");
		        System.out.print(num3 + " ");
		      } else {
		        System.out.print(num3 + " ");
		        System.out.print(num1 + " ");
		      }
		    } else {
		      System.out.print(num3 + " ");

		      if (num1 <= num2) {
		        System.out.print(num1 + " ");
		        System.out.print(num2 + " ");
		      } else {
		        System.out.print(num2 + " ");
		        System.out.print(num1 + " ");
		      }
		    }

		    input.close();
		  }
		}
		
