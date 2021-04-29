package edu.upc.eetac.dsa.Models;

public class Producto {


    private String nombre;
    private int numVentas;
    private int stock;  //sin implementar
    private double precio;

    public Producto(String nombre, int stock, Double precio) {
        this.nombre = nombre;
        this.numVentas = 0;
        this.stock = stock;
        this.precio = precio;
    }

    public Producto(){

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
