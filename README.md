# 🖥️ Exercícios de Programação Orientada à Objetos em Java

Este repositório contém exercícios práticos de **POO (Programação Orientada à Objetos)** em Java, abordando conceitos como **interfaces, composição, polimorfismo, herança e encapsulamento**.

## 📂 Estrutura dos Exercícios

1. **Interface de Animais 🐶🐱**
   - Interface `Animal` com método `emitirSom()`.
   - Implementações: `Cachorro` e `Gato`.
   - Demonstração do polimorfismo ao chamar `emitirSom()` para diferentes animais.

2. **Formas Geométricas 🔺⬛ (Composição)**
   - Interface `Forma` com método `calcularArea()`.
   - Implementações: `Quadrado` e `Circulo`.
   - Classe `Desenho` que contém várias formas e calcula a área total.

3. **Formas de Pagamento 💳💵**
   - Interface `Pagamento` com método `pagar(double valor)`.
   - Implementações: `CartaoCredito`, `Pix`, `Dinheiro`.
   - Demonstração de flexibilidade no uso de diferentes meios de pagamento.

4. **Veículos 🚗🚲🛴 (uso de `default`)**
   - Interface `Veiculo` com métodos `acelerar()`, `frear()` e `default ligarMotor()`.
   - Implementações: `Carro`, `Moto` e `Bicicleta` (sobrescreve `ligarMotor()`).

5. **Notificações 📧📱**
   - Interface `Notificacao` com método `enviarMensagem(String mensagem)`.
   - Implementações: `Email` e `SMS`.
   - Demonstração de flexibilidade para adicionar novos tipos no futuro.

---

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/poo-java-exercicios.git
