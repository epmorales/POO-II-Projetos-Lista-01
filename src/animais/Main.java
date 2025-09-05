package animais;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList();
        animais.add(new Cachorro());
        animais.add(new Gato());

        for(Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

// Se você quiser adicionar novos animais no futuro, basta criar uma nova classe que implements
// Animal e colocar ela na lista. O programa já está preparado para isso, porque usa polimorfismo.
// Assim, cada animal novo sabe como emitir seu som, e o for vai chamar automaticamente o som certo
// sem você precisar mexer no resto do código.
