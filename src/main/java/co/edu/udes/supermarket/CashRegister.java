
package co.edu.udes.supermarket;

import java.util.Date;

public class CashRegister {

    public CashRegister(String codeProduct, double productValue, Date saleDate, int productQuantity, double fullValue, String clientId) {
        this.codeProduct = codeProduct;
        this.productValue = productValue;
        this.saleDate = saleDate;
        this.productQuantity = productQuantity;
        this.fullValue = fullValue;
        this.clientId = clientId;
    }

    CashRegister(String modelo, String marca, String nombre, String placa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public double getProductValue() {
        return productValue;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getFullValue() {
        return fullValue;
    }

    public String getClientId() {
        return clientId;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public void setProductValue(double productValue) {
        this.productValue = productValue;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setFullValue(double fullValue) {
        this.fullValue = fullValue;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    private String codeProduct;
    private double productValue;
    private Date saleDate;
    private int productQuantity;
    private double fullValue;
    private String clientId;
}
