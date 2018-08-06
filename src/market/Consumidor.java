package market;

import market.lib.ProdutoFactory;

import market.entidades.Cliente;
import market.produtos.ListaDeCompras;
import market.produtos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread {
    BlockingQueue<ListaDeCompras> FilaDeListaDeCompras;
    int[] estoque = new int[18];


    public Consumidor(BlockingQueue<ListaDeCompras> FilaDelistaDeCompras)
    {
        this.FilaDeListaDeCompras = FilaDelistaDeCompras;
        for (int i = 0; i < estoque.length; i++)
        {
            estoque[i] = 50;
        }
    }
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                ListaDeCompras lista = FilaDeListaDeCompras.take();

            }
            catch (InterruptedException e)
            {
            }

        }
    }
}
