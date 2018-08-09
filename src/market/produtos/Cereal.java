package market.produtos;

public class Cereal extends Produto{
    private static int quantidade = 50;
    public Cereal(){
        nome = "Cereal";
        preco = 12.30f;
        id = 4;
        unidade = "kg";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

}
