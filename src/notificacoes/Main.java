package notificacoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notificacao> notificacoes = new ArrayList();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());
        String mensagem = "Seu pedido foi aprovado!";

        for(Notificacao n : notificacoes) {
            n.enviar(mensagem);
        }
    }
}

//  Com interface, é fácil adicionar novos tipos de notificação (WhatsApp, Push, etc.)
//  sem alterar o código já existente, apenas criando novas classes
