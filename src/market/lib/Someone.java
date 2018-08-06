package market.lib;

import market.entidades.Pessoa;

import java.util.Random;

public class Someone extends Pessoa {
    private String nomes[] = {"Ana", "Alberto", "Amarildo", "Beto", "Beatriz", "Bernado", "Carol", "Cintia", "Carolino", "Carlos", "diana",
            "Daiane", "Daniel", "Elisa", "Elisangelo", "Elza", "Fabio", "Fernanda", "Fagner", "Fabiano", "Giovane",
            "Giulia", "Guilherme", "Gustavo", "Gabriela", "Hugo", "Heior", "Helena", "Icaro", "Isabela", "Iago", "Jefferson",
            "Julia", "Juliana", "jose", "Kaique", "Kaue", "Kaio", "Karol", "Luciana", "Lais", "Leonardo", "Laura", "Mauro", "Marcelo",
            "Marcos", "Natalia", "Natan", "Otavio", "Osmar", "Paulo", "Pedro", "Poliana", "Renan", "Ronaldo", "Renata", "Roberta",
            "Samuel", "Samanta", "Samara", "Tatiana", "Tais", "Talita", "Tales", "Tamires", "Taison", "Thomas", "Ulisses",
            "Vitor", "Vitoria", "Vanessa", "Vinicius"};

    private String telefones[] = {"9999-7777", "1234-9874", "4562-9882", "1478-9632", "4568-9852", "1459-7534", "6666-4444", "2222-8888", "9898-4545"};

    private String CPFs[] = {"999.888.777.66"};

    public Someone()
    {
        Random ran = new Random();
        this.nome =nomes [ran.nextInt(nomes.length)];
        this.tel = telefones[ran.nextInt(telefones.length)];
        this.CPF = CPFs[ ran.nextInt(CPFs.length)];
    }
}
