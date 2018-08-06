package market;

import market.entidades.Cliente;
import market.lib.ProdutoFactory;
import market.lib.Someone;
import market.produtos.ListaDeCompras;
import market.produtos.Produto;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Produtor extends Thread {
    BlockingQueue<ListaDeCompras> listaDeListaDeCompras;

    public Produtor(BlockingQueue<ListaDeCompras> listaDeListaDeCompras)
    {
        this.listaDeListaDeCompras = listaDeListaDeCompras;
    }

    @Override
    public void run() {
        Random ran = new Random();
        for (int i = 0; i < 15; i++)
        {
            Someone alguem = new Someone();
            Cliente cliente = new Cliente(alguem);
            ListaDeCompras listaDeCompras = new ListaDeCompras(cliente);
            int quantDeItens = ran.nextInt(29) + 1;
            System.out.println("itens comprados: " + quantDeItens);
            int j;
            while (quantDeItens > 0)
            {
                j = ran.nextInt(18);
                listaDeCompras.add(ProdutoFactory.getProduto(j));
                quantDeItens--;
            }
            try
            {
                listaDeCompras.ExibirLista();
                System.out.print("\n");
                listaDeListaDeCompras.put(listaDeCompras);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Erro de interrupcao");
            }
        }
    }
}
