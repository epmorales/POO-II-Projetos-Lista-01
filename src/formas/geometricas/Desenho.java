package formas.geometricas;

import java.util.ArrayList;
import java.util.List;

public class Desenho {
    private List<Forma> formas = new ArrayList();

    public void adicionarForma(Forma f) {
        this.formas.add(f);
    }

    public double calcularAreaTotal() {
        double soma = (double)0.0F;

        for(Forma f : this.formas) {
            soma += f.calcularArea();
        }

        return soma;
    }
}
