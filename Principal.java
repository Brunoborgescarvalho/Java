public class Principal {
    public static void main(String [] args){

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        produto1.setCodigo(001);
        produto1.setDescricao("Dyonathan");
        produto1.setValor(19);
        produto2.setCodigo(002);
        produto2.setDescricao("Chefe");
        produto2.setValor(38);

        pedido1.setCodigo(01);
        pedido1.setValor(20);
        pedido2.setCodigo(02);
        pedido2.setValor(30);

        ItemPedido itemPedido1 = new ItemPedido();
        ItemPedido itemPedido2 = new ItemPedido();
        

        itemPedido1.setPedido(pedido1);
        itemPedido1.setProduto(produto1);
        itemPedido2.setPedido(pedido2);
        itemPedido2.setProduto(produto2);
    }    
}
