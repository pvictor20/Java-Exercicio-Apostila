public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return (int) (largura * altura);
    }

   
    public int calcularPerimetro() {
        return (int) (2 * (largura + altura));
    }


    @Override
    public double calcularVolume() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularVolume'");
    }
}
