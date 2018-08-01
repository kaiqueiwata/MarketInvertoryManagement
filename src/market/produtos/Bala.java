package market.produtos;

public class Bala extends Produto{
    private static int quantidade = 50;
    public Bala(){
        nome = "Bala";
        preco = 15.25f;
        id = 1;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de balas\n", quant, quant>1?"pacotes":"pacote");
    }
}
