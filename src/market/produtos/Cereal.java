package market.produtos;

public class Cereal extends Produto{
    private static boolean temCereal = false;
    private static int quantidade = 50;
    public Cereal(){
        if(temCereal){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Cereal";
        preco = 15.25f;
        id = 0;
        temCereal = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
