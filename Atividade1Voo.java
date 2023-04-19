import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vooo {
public static void main(String[] args){

List<String> voo = new ArrayList<>();

voo.add("Compahia - Gol");
voo.add("Origem - Brasil, Salvador");
voo.add("Destino - França, Paris");
voo.add("Data do voo: 25/05/2023 ");
voo.add("Hora do voo: 14:30");
voo.add("Numero do Voo: 831289371-33");
voo.add("Total de Assentos: 100 (Poucos disponiveis)");
voo.add("Status do voo: Confirmado");

for(String elementos : voo){
System.out.println(elementos);
}
System.out.println();
Scanner sc = new Scanner(System.in);

List<Integer> assentos = new ArrayList<>();

assentos.add(15);
assentos.add(12);
assentos.add(33);
assentos.add(42);
assentos.add(100);
assentos.add(97);
assentos.add(18);
assentos.add(29);

for(int cadeiras : assentos){
    System.out.println("Assento disponivel: " + cadeiras);
}
System.out.println();
System.out.print("Escolha entre um dos assentos disponiveis acima: ");
int escolha = sc.nextInt();

if (assentos.contains(escolha)) {
    System.out.println("Assento escolhido com sucesso!, " + escolha);
} else {
    System.out.println("Assento ocupado ou inexistente.");
}

}
}
