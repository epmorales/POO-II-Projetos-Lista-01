package formas.geometricas;

public class Main {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        desenho.adicionarForma(new Quadrado((double) 2.0F));
        desenho.adicionarForma(new Circulo((double) 1.0F));
        double total = desenho.calcularAreaTotal();
        System.out.println("Área total do desenho: " + total);
    }
}
