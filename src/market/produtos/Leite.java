package market.produtos;

public class Leite extends Produto{
    private static boolean temLeite = false;
    private static int quantidade = 50;
    public Leite(){
        if(temLeite){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Leite";
        preco = 15.25f;
        id = 0;
        temLeite = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
