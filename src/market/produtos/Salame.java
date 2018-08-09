package market.produtos;

public class Salame extends Produto{
    private static int quantidade = 50;
    public Salame(){
        nome = "Salame";
        preco = 42.00f;
        id = 0;
        unidade = "kg";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

