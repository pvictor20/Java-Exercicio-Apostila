public class Losango extends Figura {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(String nome, double diagonalMaior, double diagonalMenor) {
        super(nome);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

 
    public double calcularArea() {
        return 0.5 * diagonalMaior * diagonalMenor;
    }

  
    public double calcularPerimetro() {
        return 4 * diagonalMaior;
    }
}

