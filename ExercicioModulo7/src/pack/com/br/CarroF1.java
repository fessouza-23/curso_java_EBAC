package pack.com.br;

/**
 * Representa um carro de Fórmula 1.
 * Esta classe contém atributos e métodos relacionados a um carro de F1.
 */
public class CarroF1 {
    // Atributos da classe
    private String time;
    private String piloto;
    private int hp;
    private double topSpeed;

    /**
     * Construtor da classe CarroF1.
     *
     * @param time      O nome da equipe.
     * @param piloto    O nome do piloto.
     * @param hp        A potência do motor em HP.
     * @param topSpeed  A velocidade máxima em km/h.
     */
    public CarroF1(String time, String piloto, int hp, double topSpeed) {
        this.time = time;
        this.piloto = piloto;
        this.hp = hp;
        this.topSpeed = topSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
