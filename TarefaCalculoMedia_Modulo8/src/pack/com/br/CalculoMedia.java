package pack.com.br;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoMedia {
    double[] notas = new double[4];
    double media;

    public void lerNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as quatro notas: ");

        for(int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

    public void calcularMedia(){
        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        media = soma/4;
    }

    public void exibirMedia() {
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Média: " + formato.format(media));
    }

    public static void main(String[] args){
        CalculoMedia calculadora = new CalculoMedia();
        calculadora.lerNotas();
        calculadora.calcularMedia();
        calculadora.exibirMedia();
    }
}
