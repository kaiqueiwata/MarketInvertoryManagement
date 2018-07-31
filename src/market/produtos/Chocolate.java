package market.produtos;

public class Chocolate extends Produto{
    private static boolean temChocolate = false;
    private static int quantidade = 50;
    public Chocolate(){
        if(temChocolate){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Chocolate";
        preco = 15.25f;
        id = 0;
        temChocolate = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
