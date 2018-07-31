package market;

import market.produtos.Produto;
import market.entidades.Cliente;

import java.util.Random;

public class Consumidor extends Thread {
    int[] estoque;
    int[] ListaDecompras;
    static String nomes[] = {"Ana", "Alberto", "Amarildo", "Beto", "Beatriz", "Bernado", "Carol", "Cintia", "Carolino", "Carlos", "diana",
                            "Daiane", "Daniel", "Elisa", "Elisangelo", "Elza", "Fabio", "Fernanda", "Fagner", "Fabiano", "Giovane",
                            "Giulia", "Guilherme", "Gustavo", "Gabriela", "Hugo", "Heior", "Helena", "Icaro", "Isabela", "Iago", "Jefferson",
                            "Julia", "Juliana", "jose", "Kaique", "Kaue", "Kaio", "Karol", "Luciana", "Lais", "Leonardo", "Laura", "Mauro", "Marcelo",
                            "Marcos", "Natalia", "Natan", "Otavio", "Osmar", "Paulo", "Pedro", "Poliana", "Renan", "Ronaldo", "Renata", "Roberta",
                            "Samuel", "Samanta", "Samara", "Tatiana", "Tais", "Talita", "Tales", "Tamires", "Taison", "Thomas", "Ulisses",
                            "Vitor", "Vitoria", "Vanessa", "Vinicius"};
    static String telefones[] = {"9999-7777", "1234-9874", "4562-9882", "1478-9632", "4568-9852", "1459-7534", "6666-4444", "2222-8888", "9898-4545"};
    static String CPFs[] = {"999.888.777.66"};

    public Consumidor(int[] estoque){
        this.estoque = estoque;
        ListaDecompras = new int[18];
        for (int i = 0; i < ListaDecompras.length; i++) {
            ListaDecompras[i] = 0;
        }
    }

    @Override
    public void run() {
        Random ran = new Random();
        int nome = ran.nextInt(nomes.length);
        int telefone = ran.nextInt(telefones.length);
        int cpf = ran.nextInt(CPFs.length);
        Cliente cliente = new Cliente(nomes[nome], telefones[telefone], CPFs[cpf]);
        int quantDeItens = ran.nextInt(29)+1;

        int j;
        while(quantDeItens > 0){
            j = ran.nextInt(18);
            synchronized (this) {
                if (estoque[j] > 0) {
                    estoque[j] -= 1;
                    quantDeItens--;
                    ListaDecompras[j] ++;
                }
            }
        }
        ExibirListaDeCompras(cliente);
    }

    public void ExibirListaDeCompras(Cliente cliente){
        System.out.printf("O cliente %s comprou:\n", cliente.nome);
        for (int i = 0; i < this.ListaDecompras.length; i++) {
            if(ListaDecompras[i] > 0)System.out.printf("   %d de %s\n",ListaDecompras[i], );
        }
    }
}
