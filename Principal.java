import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String [] args){
        
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();
    Pedido pedido1 = new Pedido();
    Pedido pedido2 = new Pedido();

    produto1.setCodigo(100);
    produto1.setDescricao("Caneta");
    produto1.setValor(5.00);
    produto2.setCodigo(200);
    produto2.setDescricao("Lápis");
    produto2.setValor(3.00);

    pedido1.setCodigo(120);
    pedido1.setValor(200.00);
    pedido2.setCodigo(150);
    pedido2.setValor(300.00);

    ItemPedido itemPedido1 = new ItemPedido();
    ItemPedido itemPedido2 = new ItemPedido();
    
    itemPedido1.setPedido(pedido1);
    itemPedido1.setProduto(produto1);
    itemPedido2.setPedido(pedido2);
    itemPedido2.setProduto(produto2);







        
    }
    
}
