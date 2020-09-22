package SistemaAnimal;

public class Lobo extends Mamifero{
    public Lobo(int idade, int quantidadeDeMembros, double peso) {
        super(idade, quantidadeDeMembros, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("uivo");
    }
}
