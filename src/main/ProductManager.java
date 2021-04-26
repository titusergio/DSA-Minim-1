package main;

import java.util.List;
import main.Clases.Producto;
import main.Clases.Pedido;
import main.Clases.Usuario;


public interface ProductManager {



    //nos devuelve una lista de productos ordenadas por precio
    List<Producto> getProductsPrice();

    //nos devuelve una lista de productos ordenadas por numero de ventas
    List<Producto> getProductsSales();

     void newPedido(Pedido pedido,Usuario user);

     Pedido servirPedido();

     List<Pedido> getProductos(Integer idUser);


























}
