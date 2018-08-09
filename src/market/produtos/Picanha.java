package market.produtos;

public class Picanha extends Produto{
    private static int quantidade = 50;
    public Picanha(){
        nome = "Cereal";
        preco = 37.30f;
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
