package market.produtos;

public class Feijao extends Produto{
    private static int quantidade = 50;
    public Feijao(){
        nome = "feijao";
        preco = 7.90f;
        id = 1;
        unidade = "kg";
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
