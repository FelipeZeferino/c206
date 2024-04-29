import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrinho {
    List<Produto> produtos = new ArrayList<>();




    void addProduto (Produto produto){
        produtos.add(produto);
    }

    void mostraCarrinho(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getPreco());
        }
    }




}
