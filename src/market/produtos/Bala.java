package market.produtos;

public class Bala extends Produto{
    private static int quantidade = 50;
    public Bala(){
        nome = "Bala";
        preco = .25f;
        id = 1;
        unidade = "pacote";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
