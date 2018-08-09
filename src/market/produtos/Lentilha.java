package market.produtos;

public class Lentilha extends Produto{
    private static int quantidade = 50;
    public Lentilha(){
        nome = "Lentilha";
        preco = 12.35f;
        id = 0;
        unidade =  "kg";
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
