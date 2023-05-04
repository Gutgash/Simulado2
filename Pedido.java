import java.util.ArrayList;
public interface Pedido {
    void addProduto(Produto p);
    ArrayList getProdutos();
    float calculaValorTotal();

}
