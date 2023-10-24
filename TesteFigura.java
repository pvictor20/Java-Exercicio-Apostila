public class TesteFigura {
    public static void main(String[] args) {

        
        Figura quadrado = new Quadrado("quadrado", 10);

        System.out.println(quadrado.getNome());

        
        double area = quadrado.calcularArea();

       
        System.out.println(area);

        
        double perimetro = quadrado.calcularPerimetro();

        System.out.println(perimetro);
    }
}
