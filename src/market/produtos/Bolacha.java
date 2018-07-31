package market.produtos;

public class Bolacha extends Produto{
    private static boolean temBolacha = false;
    private static int quantidade = 50;
    public Bolacha(){
        if(temBolacha){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Bolacha";
        preco = 15.25f;
        id = 0;
        temBolacha = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
