package market.produtos;


public abstract class Produto {
    float preco;
    String nome;
    int id;

    public abstract void compra(int quant);
}
