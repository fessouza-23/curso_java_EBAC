package pack.com.br;

public class TesteCarroF1 {
    public static void main(String[] args) {
        CarroF1 carro1 = new CarroF1("Mercedes", "Lewis Hamilton", 1000, 350.0);

        System.out.println("Equipe: " + carro1.getTime());
        System.out.println("Piloto: " + carro1.getPiloto());
        System.out.println("Potência: " + carro1.getHp() + " HP");
        System.out.println("Velocidade Máxima: " + carro1.getTopSpeed() + " km/h");

        // Modificando algumas informações
        carro1.setHp(1200);
        carro1.setTopSpeed(360.0);

        // Exibindo as informações atualizadas
        System.out.println("\nInformações Atualizadas:");
        System.out.println("Potência: " + carro1.getHp() + " HP");
        System.out.println("Velocidade Máxima: " + carro1.getTopSpeed() + " km/h");
    }
}
