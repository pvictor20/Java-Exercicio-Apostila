public class Trapezio extends Figura{
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(String nome, double baseMaior, double baseMenor, double altura) {
        super(nome);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return (int) (0.5 * (baseMaior + baseMenor) * altura);
    }

    
    public int calcularPerimetro() {
        return (int) (baseMaior + baseMenor + 2 * altura);
    }


    @Override
    public double calcularVolume() {
       
        throw new UnsupportedOperationException("Unimplemented method 'calcularVolume'");
    }
}

