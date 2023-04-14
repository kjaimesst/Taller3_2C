/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller3.Cine;

/**
 *
 * @author kamil
 */
public class Hall {
    private String numberHall;
    private int capacity;
    private String typeHall;

    public String getNumberHall() {
        return numberHall;
    }

    public void setNumberHall(String numberHall) {
        this.numberHall = numberHall;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTypeHall() {
        return typeHall;
    }

    public void setTypeHall(String typeHall) {
        this.typeHall = typeHall;
    }

    public Hall(String numberHall, int capacity, String typeHall) {
        this.numberHall = numberHall;
        this.capacity = capacity;
        this.typeHall = typeHall;
    }
}
