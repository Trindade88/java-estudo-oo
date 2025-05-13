package entidades;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotalEstoque() {
        return preco * quantidade;
    }

    public void AdicaoProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void RemoveProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + "unidades, total R$ "
                + String.format("%.2f", ValorTotalEstoque());
    }

}
