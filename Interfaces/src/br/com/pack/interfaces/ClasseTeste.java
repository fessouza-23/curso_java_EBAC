package br.com.pack.interfaces;

public class ClasseTeste {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Ola Joao");
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Ola Joao");
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Ola Joao");
        System.out.println(lapis.getCor());
    }
}
