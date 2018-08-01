package market.produtos;

public class Lentilha extends Produto{
    private static int quantidade = 50;
    public Lentilha(){
        nome = "Lentilha";
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
        System.out.printf("%d %s de lentilha\n", quant, quant>1?"kgs":"kg");
    }
}
