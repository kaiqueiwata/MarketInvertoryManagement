package market.produtos;

public class Arroz extends Produto {
    private static int quantidade = 50;
    public Arroz(){
        nome = "Arroz";
        preco = 13.50f;
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
