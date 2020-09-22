package SistemaAnimal;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TesteAnimal extends Animal{
    Scanner leitor = new Scanner(System.in);
    public TesteAnimal( int idade, int quantidadeDeMembros, double peso){
        super(idade, quantidadeDeMembros, peso);
    }

    public static void main(String[] args) {

        Animal animal = new Animal(2, 4, 25.6);

        animal.emitirSom();

    }
}