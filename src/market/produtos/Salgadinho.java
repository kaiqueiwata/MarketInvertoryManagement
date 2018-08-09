package market.produtos;

public class Salgadinho extends Produto{
    private static int quantidade = 50;
    public Salgadinho(){
        nome = "Salgadinho";
        preco = 5.99f;
        id = 0;
        unidade = "pacote";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

