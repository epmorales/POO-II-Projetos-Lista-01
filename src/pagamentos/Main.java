package pagamentos;

public class Main {
    public static void main(String[] args) {
        double precoProduto = 149.9;
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Pix();
        Pagamento p3 = new Dinheiro();
        p1.pagar(precoProduto);
        p2.pagar(precoProduto);
        p3.pagar(precoProduto);
    }
}

// Usar interface é mais flexível porque elimina if/else fixos,
// separa responsabilidades, facilita manutenção e permite adicionar
// novas formas de pagamento sem alterar o código existente.
