package market.produtos;

public class Shampoo extends Produto{
    private boolean temShampoo = false;
    static int quantidade = 50;
    public Shampoo(){
        if(temShampoo){
            throw new RuntimeException("ja tem shampoo");
        }
        nome = "pao";
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
