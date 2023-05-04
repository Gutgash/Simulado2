import java.util.ArrayList;

public class PedidoJogo implements Pedido{

    ArrayList<Produto> jogos = new ArrayList<>();

    @Override
    public void addProduto(Produto p) {
        jogos.add(p);
    }

    @Override
    public ArrayList<Produto> getProdutos() {
        return jogos;
    }

    @Override
    public float calculaValorTotal() {
        float valorTotal = 0f;
        for (Produto jogo : jogos){
            valorTotal += jogo.getValor();
        }
        return valorTotal;
    }
}
