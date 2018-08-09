package market.produtos;

public class BolaDeFutebol extends Produto{
    private static int quantidade = 50;
    public BolaDeFutebol(){
        nome = "BolaDeFutebol";
        preco = 40.35f;
        id = 3;
        unidade = "unidade";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
