package market.produtos;

import market.entidades.Cliente;
import market.lib.CompraString;
import market.lib.ProdutoFactory;
import java.util.ArrayList;

        public class ListaDeCompras {
    public ArrayList<Produto> produtos;
    public Cliente cliente;
    public int length = 0;
    public double total = 0;
    public ListaDeCompras(Cliente cliente)
    {
        this.cliente = cliente;
        produtos = new ArrayList<Produto>();
    }

    public void add(Produto produto)
    {
        this.produtos.add(produto);
        length ++;
        total += produto.preco;
    }

    public void ExibirLista()
    {
        System.out.println("O(A) cliente "+ this.cliente.nome + " comprou:");
        for (int i = 0, count = 0; i < 18; i++, count = 0) {
            for (Produto produto: produtos)
            {
                if(ProdutoFactory.getProduto(i).getClass().getSimpleName().equals(produto.getClass().getSimpleName()))
                {
                    count++;
                }
            }
            if(count > 0)
            {
                CompraString.compra(ProdutoFactory.getProduto(i),count);
            }
        }
        System.out.printf("Total: R$%.2f\n",total);
    }

    public int getQuant(int id)
    {
        Produto prod = ProdutoFactory.getProduto(id);
        int count = 0;
        for (Produto p: produtos)
        {
            if(prod.getClass().equals(p.getClass()))
            {
                count++;
            }
        }
        return count;
    }
    //get propriedade by Id

}
