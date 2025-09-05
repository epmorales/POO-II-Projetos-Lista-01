package veiculos;

public interface Veiculo {
    void acelerar();

    void frear();

    default void ligarMotor() {
        System.out.println("O motor está ligado!");
    }
}
