package market.produtos;

public class Pao extends Produto {
    private boolean temPao = false;
    static int quantidade = 50;
    public Pao(){
        if(temPao){
            throw new RuntimeException("ja tem pao");
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
