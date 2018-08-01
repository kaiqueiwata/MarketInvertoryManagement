package market.produtos;

public class BolaDeFutebol extends Produto{
    private static int quantidade = 50;
    public BolaDeFutebol(){
        nome = "BolaDeFutebol";
        preco = 15.25f;
        id = 3;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de futebol\n", quant, quant>1?"bolas":"bola");
    }
}
