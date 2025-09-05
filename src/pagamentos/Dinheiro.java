package pagamentos;

public class Dinheiro implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Dinheiro.");
    }
}
