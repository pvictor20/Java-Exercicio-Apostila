public class Quadrilatero extends Figura2D{
    private int base;
    private int altura;

    public Quadrilatero(String nome, int base, int altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

   
    public double calcularArea() {
        return base * altura;
    }
}

