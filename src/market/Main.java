package market;

import market.produtos.*;

public class Main {

    public static void main(String[] args) {
        int[] estoque = new int[18];
        Produto[] catalogo = new Produto[18];
        Consumidor c1 =  new Consumidor(estoque);

        c1.start();
    }
}
