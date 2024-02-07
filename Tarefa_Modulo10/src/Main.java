import java.util.Scanner;

public class Main {
    double[] notas = new double[4];
    double media;

    public void lerNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as quatro notas: ");
        for(int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            this.notas[i] = scanner.nextDouble();
        }
    }

    public void calcularMedia() {
        double soma = 0;
        for(double nota : this.notas) {
            soma += nota;
        }
        this.media = soma/4;
        System.out.println("MEDIA: " + this.media);
    }

    public void condicao() {
        if(this.media >= 7) {
            System.out.println("APROVADO!");
        } else if(this.media >= 5) {
            System.out.println("RECUPERACAO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }

    public static void main(String[] args) {
        Main aluno = new Main();
        aluno.lerNotas();
        aluno.calcularMedia();
        aluno.condicao();
    }
}
