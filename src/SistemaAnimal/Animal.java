package SistemaAnimal;

public class Animal {
    private int idade;
    private int quantidadeDeMembros;
    private double peso;

    public Animal(int idade, int quantidadeDeMembros, double peso) {
        this.idade = idade;
        this.quantidadeDeMembros = quantidadeDeMembros;
        this.peso = peso;
    }
    public void emitirSom(){
        System.out.println("som animal");
    }
    public void movimentoAnimal(){
        System.out.println("Movimento animal");
    }
}
