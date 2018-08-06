package market.entidades;

public class Cliente extends Pessoa{
    public Cliente(String nome, String tel, String CPF){
        this.nome = nome;
        this.tel = tel;
        this.CPF = CPF;
    }
    public Cliente(Pessoa pessoa)
    {
        this.nome = pessoa.nome;
        this.tel = pessoa.tel;
        this.CPF = pessoa.CPF;
    }
}
