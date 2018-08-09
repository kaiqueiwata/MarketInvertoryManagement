package market.produtos;

public class VideoGame extends Produto  {
    private static int quantidade = 50;
    public VideoGame(){
        nome = "VideoGame";
        preco = 2499.90f;
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

