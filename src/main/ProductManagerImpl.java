package main;

import main.Clases.Pedido;
import main.Clases.Producto;
import main.Clases.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;


public class ProductManagerImpl implements ProductManager {


    private static ProductManager instance;  //no sabemos porq
    private List<Producto> listaProductos = new ArrayList<>();    //lista de productos del sistema
    private HashMap<Integer, Usuario> usuarios= new HashMap<>();  //lista de usuarios en el sistema
    private Queue<Pedido> colaPedidos = new LinkedList<>();       //cola de pedidos por atender
    private int contador=0;                                       //variable q usaremos para identificar los pedidos, enumerandolos de manera ascendetne


    private ProductManagerImpl(){
        //lo tendriamos q hacer aqui???
    }


    @Override
    public List<Producto> getProductsPrice() {

        List<Producto> p = this.listaProductos;
        Collections.sort(p, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Float.compare(o1.getPrecio(), o2.getPrecio());    //porq asi??
            }

        });

        return p;
    }

    @Override
    public List<Producto> getProductsSales() {

        List<Producto> p = this.listaProductos;
        Collections.sort(p, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return Integer.compare(o1.getNumVentas(), o2.getNumVentas());    //porq asi??
            }

        });

        return p;


    }


    @Override
    public void newPedido(Pedido pedido, Usuario usuario) {

        //usuario registro pedidos -> user.addPedido(pedido)
        // añadir a la cola

        // q es mejor pasarle el objeto usuario enterio, o solo el identificador y construir el objeto usuario dentro??



         if ( usuarios.get(usuario.getId()) == null)   {

             //logger error

         }else{
             pedido.setId(contador);  //identificamos el pedido
             this.contador++;

             this.colaPedidos.add(pedido);    //si el usuario esta en el sistema, añadimos el pedido al registro de pedidos
             usuario.addPedido(pedido);//del usuario y al registro de pedidos del sistema

         }
    }


    @Override
    public Pedido servirPedido() {
        //si hay stock en los productos del pedido hacemos -->

        //remove de la cola pedidos por atender
        // incrementar numero de ventas de cada objeto del pedido y decrementamos el num de stock

        Pedido pedidoAtender = this.colaPedidos.poll();  //cogemos el pedido de la cola

        //bucle de productos de mi pedido--> para cada producto buscar este en mi lista y modificar un valor
        List<String> nombreProductos = pedidoAtender.getProductos();  //obtenemos la lista con los nombres de los productos


        for(String name:nombreProductos){

            int cantidad = pedidoAtender.getCantidad(name);
            if(cantidad==0){

                return null;  //logger error

            }else{
                //buscamos el producto en nuestra lista de productos del sistema
                for(Producto p: listaProductos){


                    if(name.equals(p.getNombre())){

                        p.addVentas(cantidad);

                    }


                }
            }


        }








        return null;
    }


    @Override
    public List<Pedido> getProductos(Integer idUser) {

        Usuario u = this.usuarios.get(idUser);
        return u.getPedidosUser();

    }
}
