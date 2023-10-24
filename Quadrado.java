public class Quadrado extends Figura {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }
    
    public double calcularArea() {
        return lado * lado;
    }

    
    public double calcularPerimetro() {
        return 4 * lado;
    }
}