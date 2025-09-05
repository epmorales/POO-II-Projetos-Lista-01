package veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo carro2 = new Moto();
        Veiculo carro3 = new Bicicleta();
        System.out.println("--- Carro ---");
        carro.ligarMotor();
        carro.acelerar();
        carro.frear();
        System.out.println("--- Moto ---");
        carro2.ligarMotor();
        carro2.acelerar();
        carro2.frear();
        System.out.println("--- Bicicleta ---");
        carro3.ligarMotor();
        carro3.acelerar();
        carro3.frear();
    }
}

// O uso de default na interface permite escrever uma implementação comum uma única vez,
// evitando duplicação de código nas classes que compartilham esse comportamento (como Carro e Moto).
