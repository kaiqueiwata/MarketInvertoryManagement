package market.produtos;

public class Televisao extends Produto{
    private static int quantidade = 50;
    public Televisao(){
        nome = "Televisao";
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
        System.out.printf("%d %s de televisão\n", quant, quant>1?"aparelhos":"aparelho");
    }
}

