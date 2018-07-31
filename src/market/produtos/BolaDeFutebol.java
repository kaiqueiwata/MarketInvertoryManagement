package market.produtos;

public class BolaDeFutebol extends Produto{
    private static boolean temBolaDeFutebol = false;
    private static int quantidade = 50;
    public BolaDeFutebol(){
        if(temBolaDeFutebol){
            throw  new RuntimeException("Ja existe");
        }
        nome = "BolaDeFutebol";
        preco = 15.25f;
        id = 0;
        temBolaDeFutebol = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
