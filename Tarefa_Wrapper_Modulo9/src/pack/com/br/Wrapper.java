package pack.com.br;
import java.util.Scanner;

public class Wrapper {
    int valor;

    public void lerValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor: ");
        valor = scanner.nextInt();
    }

    public void casting() {
        Integer valorWrapper = Integer.valueOf(valor); // Realizando o casting para Integer
        System.out.println("Valor (Wrapper): " + valorWrapper);
    }

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();
        wrapper.lerValor();
        wrapper.casting();
    }
}
