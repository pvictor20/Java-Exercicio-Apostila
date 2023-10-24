public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    
    public double calcularArea() {
        return largura * altura;
    }

   
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
