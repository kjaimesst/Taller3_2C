
package co.edu.udes.supermarket;

import java.util.Date;


public class Product {

    public Product(String nameProduct, double valueProduct, Date dateExpedition, Date fechaExpiration, String brandProducto) {
        this.nameProduct = nameProduct;
        this.valueProduct = valueProduct;
        this.dateExpedition = dateExpedition;
        this.fechaExpiration = fechaExpiration;
        this.brandProducto = brandProducto;
    }

    Product(String name, double price, String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getValueProduct() {
        return valueProduct;
    }

    public Date getDateExpedition() {
        return dateExpedition;
    }

    public Date getFechaExpiration() {
        return fechaExpiration;
    }

    public String getBrandProducto() {
        return brandProducto;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setValueProduct(double valueProduct) {
        this.valueProduct = valueProduct;
    }

    public void setDateExpedition(Date dateExpedition) {
        this.dateExpedition = dateExpedition;
    }

    public void setFechaExpiration(Date fechaExpiration) {
        this.fechaExpiration = fechaExpiration;
    }

    public void setBrandProducto(String brandProducto) {
        this.brandProducto = brandProducto;
    }
    private String nameProduct;
    private double valueProduct;
    private Date dateExpedition;
    private Date fechaExpiration;
    private String brandProducto;
}
