package entidades;

public class Retangulo {
    public double altura, largura;

    public double Area() {
        return altura * largura;
    }

    public double Perimetro() {
        return altura + largura;
    }

    public double Diametro() {
        return Math.sqrt(altura * altura + largura * altura);
    }

}
