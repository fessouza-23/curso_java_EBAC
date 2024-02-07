import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    private static void numeros() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        numeros();
    }
}
