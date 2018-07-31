package market.produtos;

public class Feijao extends Produto{
    private boolean temFeijao = false;
    private static int quantidade = 50;
    public Feijao(){
        if(temFeijao){
            throw new RuntimeException("ja tem feijao");
        }
        nome = "feijao";
        preco = 10.90f;
        id = 1;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
