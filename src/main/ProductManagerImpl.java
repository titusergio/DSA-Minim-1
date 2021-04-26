package main;

import main.Clases.Pedido;
import main.Clases.Producto;
import main.Clases.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductManagerImpl implements ProductManager {


    private static ProductManager instance;  //no sabemos porq
    private List<Producto> listaProductos = new ArrayList<>();
    private HashMap<Integer, Usuario> usuarios= new HashMap<>();  //lista de usuarios en el sistemas


    private ProductManagerImpl(){
        //lo tendriamos q hacer aqui???
    }


    @Override
    public List<Producto> getProductsPrice() {
        return null;
    }

    @Override
    public List<Producto> getProductsSales() {
        return null;
    }

    @Override
    public void newPedido(Pedido pedido, Usuario user) {

    }

    @Override
    public Pedido servirPedido() {
        return null;
    }

    @Override
    public List<Pedido> getProductos(Integer idUser) {

        Usuario u = this.usuarios.get(idUser);
        return u.getPedidosUser();

    }
}
