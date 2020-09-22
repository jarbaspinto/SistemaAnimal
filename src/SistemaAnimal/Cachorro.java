package SistemaAnimal;

public class Cachorro extends Mamifero{
    public Cachorro(int idade, int quantidadeDeMembros, double peso) {
        super(idade, quantidadeDeMembros, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
}
