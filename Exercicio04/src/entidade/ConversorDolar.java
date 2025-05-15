package entidade;

public class ConversorDolar {

    public static final double IOF = 0.06;

    public static double ConversorMoeda (double preco, double quantidade) {
        double valorBruto = preco * quantidade;
        return valorBruto += (valorBruto * IOF);

    }
}
