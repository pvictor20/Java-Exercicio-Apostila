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


    @Override
    public double calcularVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularVolume'");
    }
}

