package pagamentos;

import notificacoes.Notificacao;

public class Pix implements Pagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Pix.");
    }
}
