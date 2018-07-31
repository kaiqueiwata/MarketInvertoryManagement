package market.produtos;

public class Picanha extends Produto{
    private static boolean temPicanha = false;
    private static int quantidade = 50;
    public Picanha(){
        if(temPicanha){
            throw  new RuntimeException("Ja existe");
        }
        nome = "Cereal";
        preco = 15.25f;
        id = 0;
        temPicanha = true;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
