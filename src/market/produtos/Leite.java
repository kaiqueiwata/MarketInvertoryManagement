package market.produtos;

public class Leite extends Produto{
    private static int quantidade = 50;
    public Leite(){
        nome = "Leite";
        preco = 2.30f;
        id = 0;
        unidade = "caixa";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
