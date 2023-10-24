public class Cubo extends Figura3D{
    private int aresta;

    public Cubo(String nome, int aresta) {
        super(nome);
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return 6 * aresta * aresta;
    }

    @Override
    public int calcularPerimetro() {
        return 12 * aresta;
    }
}

