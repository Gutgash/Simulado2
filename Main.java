public class Main {
    public static void main(String[] args) {
        PedidoJogo pedido = new PedidoJogo();

        pedido.addProduto(new Produto(10f));
        pedido.addProduto(new Produto(25f));
        pedido.addProduto(new Produto(100f));

        System.out.println("Preço por produto: ");
        for (int i = 0; i < pedido.getProdutos().size(); i++){
            System.out.println((i + 1) + ". R$ " + pedido.getProdutos().get(i).getValor());
        }
        System.out.println("Valor total: R$ " + pedido.calculaValorTotal());

    }
}