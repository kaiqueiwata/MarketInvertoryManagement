package market.produtos;

public class Salgadinho extends Produto{
    private static int quantidade = 50;
    public Salgadinho(){
        nome = "Salgadinho";
        preco = 15.25f;
        id = 0;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de Salgadinho\n", quant, quant>1?"pacotes":"pacote");
    }
}

