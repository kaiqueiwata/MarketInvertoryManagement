package market.produtos;

public class Bala extends Produto{
    private static boolean temBala = false;
    private static int quantidade = 50;
    public Bala(){
        if(temBala){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Bala";
        preco = 15.25f;
        id = 0;
        temBala = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
