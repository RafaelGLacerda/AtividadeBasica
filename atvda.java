ckage Atividades;
import java.util.Scanner;

public class atvd18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		

		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		for(int i = 0; i < numero; i++) {
			System.out.println(nome);
		}
		
		

	}

}
