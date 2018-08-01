package market.produtos;

public class Feijao extends Produto{
    private static int quantidade = 50;
    public Feijao(){
        nome = "feijao";
        preco = 10.90f;
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
        System.out.printf("%d %s de feijao\n", quant, quant>1?"kgs":"kg");
    }
}
