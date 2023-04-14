package co.edu.udes.taller3.Cine;
/**
 *
 * @author Kamila
 */
public class Product {

    
    private String nameProd;
    private String idProd;
    private double priceProd;

    Product(String name, double priceProd, String idProd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public double getPriceProd() {
        return priceProd;
    }

    public void setPriceProd(double priceProd) {
        this.priceProd = priceProd;
    }

    public Product(String nameProd, String idProd, double priceProd) {
        this.nameProd = nameProd;
        this.idProd = idProd;
        this.priceProd = priceProd;
    }
    }
