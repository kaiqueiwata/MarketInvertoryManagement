package market.produtos;

public class Farinha extends Produto{
    private static int quantidade = 50;
    public Farinha(){
        nome = "Farinha";
        preco = 3.25f;
        id = 0;
        unidade = "kg";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
