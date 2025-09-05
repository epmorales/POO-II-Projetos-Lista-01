package veiculos;

public class Bicicleta implements Veiculo{
    public void acelerar() {
        System.out.println("A bicicleta está acelerando...");
    }

    public void frear() {
        System.out.println("A bicicleta está freando...");
    }

    public void ligarMotor() {
        System.out.println("A bicicleta não tem motor!");
    }
}
