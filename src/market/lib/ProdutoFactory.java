package market.lib;
import market.produtos.*;

public class ProdutoFactory {
    public static Produto getProduto(int id) {
        switch (id) {
            case 0:
                return new Arroz();
            case 1:
                return new Bala();
            case 2:
                return new Bolacha();
            case 3:
                return new BolaDeFutebol();
            case 4:
                return new Cereal();
            case 5:
                return new Chocolate();
            case 6:
                return new Farinha();
            case 7:
                return new Feijao();
            case 8:
                return new Leite();
            case 9:
                return new Lentilha();
            case 10:
                return new Pao();
            case 11:
                return new Peixe();
            case 12:
                return new Picanha();
            case 13:
                return new Salame();
            case 14:
                return new Salgadinho();
            case 15:
                return new Shampoo();
            case 16:
                return new Televisao();
            case 17:
                return new VideoGame();
            default:
                return null;
        }
    }
}
