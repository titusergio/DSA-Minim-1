package main.Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import main.Clases.Producto;

public class Pedido {

    private HashMap<String, Integer> mapPedido = new HashMap<>();
    private String id;



   public Pedido(String nombre){
       this.id = nombre;
   }

   public void addProduct(String producto, int cantidad){


       String product = producto.toLowerCase();// por si se equivoca y escribe el key value en mayusculas

       this.mapPedido.put(product,cantidad);

   }

   public int getCantidad(String product){

       return mapPedido.get(product);
   }




   //getters and seters
    public HashMap<String, Integer> getPedido() {
        return mapPedido;
    }


    public void setMapPedido(HashMap<String, Integer> mapPedido) {
        this.mapPedido = mapPedido;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}