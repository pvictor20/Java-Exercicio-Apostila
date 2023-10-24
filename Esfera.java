public class Esfera extends Figura3D{
    private int raio;

    public Esfera(String nome, int raio) {
        super(nome);
        this.raio = raio;
    }

   
    public double calcularArea() {
        return 4 * raio * raio * 6;
    }


    public int calcularPerimetro() {
        return (int) (2 * raio * 2 * Math.PI);
    }
}
