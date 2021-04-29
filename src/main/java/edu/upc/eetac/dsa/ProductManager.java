package edu.upc.eetac.dsa;

import edu.upc.eetac.dsa.Models.Pedido;
import edu.upc.eetac.dsa.Models.Producto;
import edu.upc.eetac.dsa.Models.Usuario;


import java.util.List;
import java.util.Queue;


public interface ProductManager {



    //nos devuelve una lista de productos ordenadas por precio
    List<Producto> getProductsPrice();

    //nos devuelve una lista de productos ordenadas por numero de ventas
    List<Producto> getProductsSales();

     void newPedido(Pedido pedido, Usuario user);

     Pedido servirPedido();

     List<Pedido> getProductos(Integer idUser);

    public Queue<Pedido> getColaPedidos();

    public List<Producto> getListaProductos();

    public void clearInstances();



    public void addProducto(Producto p);
    public void addUser(Integer id, Usuario u);
    public Pedido addPedido(Pedido pedido);



























}
