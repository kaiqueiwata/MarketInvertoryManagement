package market.produtos;

public class Bolacha extends Produto{
    private static int quantidade = 50;
    public Bolacha(){
        nome = "Bolacha";
        preco = 15.25f;
        id = 2;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de bolacha\n", quant, quant>1?"pacotes":"pacote");
    }
}
