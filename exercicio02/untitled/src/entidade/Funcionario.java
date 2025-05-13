package entidade;

public class Funcionario {
    public String nome;
    public double salario_bruto;
    public double imposto;

    public double SalarioLiquido() {
        return salario_bruto - imposto;
    }

    public void Porcentagem(double porcentagem){
        salario_bruto += ((salario_bruto * porcentagem)/100.00);
    }

    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", SalarioLiquido());
    }
}
