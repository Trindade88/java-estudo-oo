package entidade;

public class Aluno {
    public String nome;
    public double nota1, nota2;

    public double media(double valor1, double valor2){
        return (valor1 + valor2) / 2;
    }
}
