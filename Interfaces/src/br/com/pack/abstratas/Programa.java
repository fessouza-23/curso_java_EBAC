package br.com.pack.abstratas;

public class Programa {
    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Joao");
        empregado.setSobrenome("Souza");
        empregado.setSalario(100d);
        System.out.println(empregado.vencimento());
    }
}
