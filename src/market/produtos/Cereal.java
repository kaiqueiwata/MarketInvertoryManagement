package market.produtos;

public class Cereal extends Produto{
    private static int quantidade = 50;
    public Cereal(){
        nome = "Cereal";
        preco = 15.25f;
        id = 4;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }

    @Override
    public void compra(int quant) {
        System.out.printf("%d %s de cereal\n", quant, quant>1?"kgs":"kg");
    }
}
