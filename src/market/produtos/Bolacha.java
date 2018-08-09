package market.produtos;

public class Bolacha extends Produto{
    private static int quantidade = 50;
    public Bolacha(){
        nome = "Bolacha";
        preco = 2.25f;
        id = 2;
        unidade = "pacote";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

}
