public class Circulo extends Figura{
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

   
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

   
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

