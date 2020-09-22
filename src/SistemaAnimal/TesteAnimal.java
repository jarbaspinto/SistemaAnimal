package SistemaAnimal;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TesteAnimal {
    Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        Animal animal = new Animal(2, 4, 25.6);
        animal.emitirSom();

        Mamifero mamifero = new Mamifero(25,5,14);
        mamifero.emitirSom();

        Lobo lobo = new Lobo(5,4,20);
        lobo.emitirSom();

        Cachorro cachorro = new Cachorro(4,4,10);
        cachorro.emitirSom();
    }
}