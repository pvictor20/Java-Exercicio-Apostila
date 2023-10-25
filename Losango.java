public class Losango extends Figura {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(String nome, double diagonalMaior, double diagonalMenor) {
        super(nome);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

 
    public double calcularArea() {
        return (int) (0.5 * diagonalMaior * diagonalMenor);
    }

  
    public int calcularPerimetro() {
        return (int) (4 * diagonalMaior);
    }


    public double calcularVolume() {
       
        throw new UnsupportedOperationException("Unimplemented method 'calcularVolume'");
    }
}

