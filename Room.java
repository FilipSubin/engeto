package com.engeto.lekce02;

import java.math.BigDecimal;

public class Room {
    private int roomNumber;
    private int beds;
    private BigDecimal price;
    private boolean balcony;
    private boolean seaView;

    public Room(int roomNumber, int beds, BigDecimal price, boolean balcony, boolean seaView) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.price = price;
        this.balcony = balcony;
        this.seaView = seaView;
    }

    public String getDescription(){
        return "Číslo pokoje: " + roomNumber + ", Počet postelí: " + beds + ", Cena: " + price + "kč, Má balkón: " + balcony + ", Má výhled na moře: " + seaView;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }
}
