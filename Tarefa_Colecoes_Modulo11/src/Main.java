import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        List<Pessoa> listaMasculino = new ArrayList<Pessoa>();
        List<Pessoa> listaFeminino = new ArrayList<Pessoa>();

        System.out.print("Digite nome e sexo das pessoas (ex: João-M, Maria-F): ");
        String input = scan.nextLine();
        String[] pessoasInfo = input.split(",");

        for (String pessoaInfo : pessoasInfo) {
            String[] info = pessoaInfo.split("-");
            String nome = info[0].trim();
            char sexo = info[1].toUpperCase().charAt(0);

            Pessoa pessoa = new Pessoa(nome, sexo);
            listaPessoas.add(pessoa);

            if (sexo == 'M') {
                listaMasculino.add(pessoa);
            } else if (sexo == 'F') {
                listaFeminino.add(pessoa);
            }
        }

        ordenacaoNome(listaPessoas);
        ordenacaoNome(listaMasculino);
        ordenacaoNome(listaFeminino);

        System.out.println("Nomes ordenados: ");
        imprimirPessoas(listaPessoas);

        System.out.println("Nomes masculinos ordenados: ");
        imprimirPessoas(listaMasculino);

        System.out.println("Nomes femininos ordenados: ");
        imprimirPessoas(listaFeminino);
    }

    public static void ordenacaoNome(List<Pessoa> lista) {
        Collections.sort(lista, (p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
    }

    public static void imprimirPessoas(List<Pessoa> lista) {
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.getNome());
        }
    }
}
