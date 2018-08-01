package market.produtos;

public class Chocolate extends Produto{
    private static int quantidade = 50;
    public Chocolate(){
        nome = "Chocolate";
        preco = 15.25f;
        id = 5;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de chocolate\n", quant, quant>1?"barras":"barras");
    }
}
