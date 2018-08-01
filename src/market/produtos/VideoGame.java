package market.produtos;

public class VideoGame extends Produto  {
    private static int quantidade = 50;
    public VideoGame(){
        nome = "VideoGame";
        preco = 15.25f;
        id = 0;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }


    public void compra(int quant) {
        System.out.printf("%d %s de video game\n", quant, quant>1?"aparelhos":"aparelho");
    }
}

