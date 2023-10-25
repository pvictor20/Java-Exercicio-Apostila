public class Quadrado extends Figura {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }
    
    public double calcularArea() {
        return (int) (lado * lado);
    }

    
    public int calcularPerimetro() {
        return (int) (4 * lado);
    }

    @Override
    public double calcularVolume() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularVolume'");
    }
}