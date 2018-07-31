package market.produtos;

public class Arroz extends Produto {
    private static boolean temArroz = false;
    private static int quantidade = 50;
    public Arroz(){
        if(temArroz){
            throw  new RuntimeException("Ja existe vei");
        }
        nome = "Arroz";
        preco = 15.25f;
        id = 0;
        temArroz = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
