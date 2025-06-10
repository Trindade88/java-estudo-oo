package entities;

public class Accunt {

    private int numero_conta;
    private String titular;
    private double saldo;

    // CONSTRUTORES
    public Accunt(String titular, int numero_conta) {
        this.titular = titular;
        this.numero_conta = numero_conta;
    }

    public Accunt(int numero_conta, String titular, double depositoInicial) {
        this.numero_conta = numero_conta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    // GETTER E SETTER (ENCAPSULAMENTO DA CLASSE)
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    // METODOS DA CLASSE (ENCAPSULAMENTO NO CONSTRUTOR DE 3 ARGUMENTOS)
    public void deposito (double quantidade) {
        saldo += quantidade;
    }

    public void saque (double quantidade) {
        saldo -= quantidade + 5;
    }

    public String toString() {
        return "Conta numero: "
                + numero_conta
                + ", Titular: "
                + titular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }

}
