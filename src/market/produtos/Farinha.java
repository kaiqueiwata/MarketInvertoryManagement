package market.produtos;

public class Farinha extends Produto{
    private static boolean temFarinha = false;
    private static int quantidade = 50;
    public Farinha(){
        if(temFarinha){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Farinha";
        preco = 15.25f;
        id = 0;
        temFarinha = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
