package market.produtos;

public class Shampoo extends Produto{
    static int quantidade = 50;
    public Shampoo(){
        nome = "Shampoo";
        preco = 12.90f;
        id = 1;
        unidade = "pote";
    }
    public int getQuantidade(){ return this.quantidade; }

    protected void setQuantidade(int novaQuant){ quantidade = novaQuant; }
}
