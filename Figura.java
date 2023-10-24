public abstract class Figura {

    private String nome;

    public Figura(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    public abstract double calcularVolume();

    public abstract int calcularPerimetro();

    public String getNome() {
        return nome;
    }
}