package market.produtos;

public class Salgadinho extends Produto{
    private static boolean temSalgadinho = false;
    private static int quantidade = 50;
    public Salgadinho(){
        if(temSalgadinho){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Salgadinho";
        preco = 15.25f;
        id = 0;
        temSalgadinho = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

