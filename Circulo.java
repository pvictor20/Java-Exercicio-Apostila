public class Circulo extends Figura{
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

   
    public double calcularArea() {
        return (int) (Math.PI * raio * raio);
    }

   
    public int calcularPerimetro() {
        return (int) (2 * Math.PI * raio);
    }


    
    public double calcularVolume() {
        
        throw new UnsupportedOperationException("Unimplemented method 'calcularVolume'");
    }
}

