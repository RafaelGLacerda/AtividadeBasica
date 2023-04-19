class Animal {
private String nome;

 
public Animal(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}
}
class Peixe extends Animal {
    private String caracteristicas;

public Peixe(String nome, String caracteristicas) {
super(nome);
this.caracteristicas = caracteristicas;
}

    
public String getCaracteristicas() {
return caracteristicas;
}

    
public void setCaracteristicas(String caracteristicas) {
this.caracteristicas = caracteristicas;
}
}

public class Fish {
public static void main(String[] args) {
        
Peixe peixe = new Peixe("Tilapia", "A Tilápia é um peixe de escamas, com corpo um pouco alto e comprimido e com uma coloração que varia muito.");

 System.out.println("Nome do peixe: " + peixe.getNome());
 System.out.println("Características do peixe: " + peixe.getCaracteristicas());

       
    
    }
}
