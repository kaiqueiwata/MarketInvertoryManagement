package market.produtos;

public class Televisao extends Produto{
    private static int quantidade = 50;
    public Televisao(){
        nome = "Televisao";
        preco = 4000.00f;
        id = 0;
        unidade = "aparelho";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

