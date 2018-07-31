package market.produtos;

public class Televisao extends Produto{
    private static boolean temtelevisao = false;
    private static int quantidade = 50;
    public Televisao(){
        if(temtelevisao){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Televisao";
        preco = 15.25f;
        id = 0;
        temtelevisao = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

