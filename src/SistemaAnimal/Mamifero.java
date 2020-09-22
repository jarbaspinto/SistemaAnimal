package SistemaAnimal;

public class Mamifero extends Animal {
    private String corDoPelo;

    public Mamifero(int idade, int quantidadeDeMembros, double peso) {
        super(idade, quantidadeDeMembros, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
        super.emitirSom();
    }
}
