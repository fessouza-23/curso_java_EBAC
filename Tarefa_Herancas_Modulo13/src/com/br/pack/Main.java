package com.br.pack;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua A, 123", "123.456.789-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Avenida B, 456", "12.345.678/0001-90");

        System.out.println("Informações da Pessoa Física:");
        pessoaFisica.informacoes();

        System.out.println("\nInformações da Pessoa Jurídica:");
        pessoaJuridica.informacoes();
    }
}