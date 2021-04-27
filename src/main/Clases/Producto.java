package main.Clases;

public class Producto {


    private String nombre;
    private int numVentas;
    private int stock;
    private float precio;

    public Producto(String nombre, int stock, int precio) {
        this.nombre = nombre;
        this.numVentas = 0;
        this.stock = stock;
        this.precio = precio;
    }





    //getters and seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }

    public void addVentas(int numVentas){
        this.numVentas+= numVentas;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public void subtractSock(int cantidad){

        if(cantidad > this.stock){
            //log error
        }else
        this.stock-= cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
