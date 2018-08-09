package market.produtos;

public class Pao extends Produto {
    static int quantidade = 50;
    public Pao(){
        nome = "pao";
        preco = .56f;
        id = 1;
        unidade = "unidades";
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    protected void setQuantidade(int novaQuant){
        quantidade = novaQuant;
    }
}
