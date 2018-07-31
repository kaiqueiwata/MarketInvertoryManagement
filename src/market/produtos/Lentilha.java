package market.produtos;

public class Lentilha extends Produto{
    private static boolean temLentilha = false;
    private static int quantidade = 50;
    public Lentilha(){
        if(temLentilha){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Lentilha";
        preco = 15.25f;
        id = 0;
        temLentilha = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
