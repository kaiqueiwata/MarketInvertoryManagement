package market.produtos;

public class Peixe extends Produto{
    private static boolean temPeixe = false;
    private static int quantidade = 50;
    public Peixe(){
        if(temPeixe){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Peixe";
        preco = 15.25f;
        id = 0;
        temPeixe = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}

