package Clases;

public class Producte {

    private String nom;
    private float preu;
    private int ventas = 0;

    public Producte(String nom, float preu) {
        this.nom  = nom;
        this.preu = preu;
    }

    public void addSales() {
        this.ventas++;
    }
    public void setPreu(float price) {
        this.preu = price;
    }
    public void setSales(int sales) { this.ventas = sales; }
    public float getPreu() {
        return preu;
    }
    public int getSales() {
        return ventas;
    }
    public String getName() {
        return nom;
    }
}
