package market.produtos;

public class Shampoo extends Produto{
    static int quantidade = 50;
    public Shampoo(){
        nome = "pao";
        preco = 10.90f;
        id = 1;
    }
    public int getQuantidade(){ return this.quantidade; }

    protected void setQuantidade(int novaQuant){ quantidade = novaQuant; }

    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de picanha\n", quant, quant>1?"kgs":"kg");
    }
}
