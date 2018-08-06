package market;

import market.entidades.Cliente;
import market.produtos.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        int[] estoque = new int[18];
        BlockingQueue<ListaDeCompras> listaDeCompras = new ArrayBlockingQueue<ListaDeCompras>(200);

        Produto[] catalogo = new Produto[18];
        ListaDeCompras lista= new ListaDeCompras(new Cliente("vitor", "9999-8888","123456798"));
        /*lista.add(new Arroz());
        lista.add(new Arroz());
        lista.add(new Arroz());
        lista.add(new Feijao());
        lista.ExibirLista();*/
        Produtor p1 =  new Produtor(listaDeCompras);

        p1.start();
    }
}
