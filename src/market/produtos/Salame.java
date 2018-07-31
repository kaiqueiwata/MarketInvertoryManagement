package market.produtos;

public class Salame extends Produto{
    private static boolean temSalame = false;
    private static int quantidade = 50;
    public Salame(){
        if(temSalame){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Salame";
        preco = 15.25f;
        id = 0;
        temSalame = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

