/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.taller3.Cine;

/**
 *
 * @author kamil
 */
public class Function {
    private String numberHall;
    private String schedule;
    private double priceTicket;

    public String getNumberHall() {
        return numberHall;
    }

    public void setNumberHall(String numberHall) {
        this.numberHall = numberHall;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public Function(String numberHall, String schedule, double priceTicket) {
        this.numberHall = numberHall;
        this.schedule = schedule;
        this.priceTicket = priceTicket;
    }
    Function(Movie myMovie, String numberHall, String schedule, double priceTicket) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
