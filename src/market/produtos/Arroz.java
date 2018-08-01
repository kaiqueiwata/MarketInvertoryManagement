package market.produtos;

public class Arroz extends Produto {
    private static int quantidade = 50;
    public Arroz(){
        nome = "Arroz";
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
        System.out.printf("%d %s de arroz\n", quant, quant>1?"kgs":"kg");
    }
}
