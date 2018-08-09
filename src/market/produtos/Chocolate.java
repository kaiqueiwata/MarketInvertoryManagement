package market.produtos;

public class Chocolate extends Produto{
    private static int quantidade = 50;
    public Chocolate(){
        nome = "Chocolate";
        preco = 5.40f;
        id = 5;
        unidade = "barra";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
