package market.produtos;

public class Peixe extends Produto{
    private static int quantidade = 50;
    public Peixe(){
        nome = "Peixe";
        preco = 45.25f;
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

