package market.produtos;

public class VideoGame extends Produto{
    private static boolean temVideoGame = false;
    private static int quantidade = 50;
    public VideoGame(){
        if(temVideoGame){
            throw  new RuntimeException("Ja existe");
        }
        nome = "VideoGame";
        preco = 15.25f;
        id = 0;
        temVideoGame = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

