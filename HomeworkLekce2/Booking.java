package com.engeto.lekce02;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private List<Guest> guestList;
    private Room bookedRoom;
    private LocalDate bookedSince;
    private LocalDate bookedTo;
    private boolean isRecreational;

    public Booking(List<Guest> guestList, Room bookedRoom, LocalDate bookedSince, LocalDate bookedTo, boolean isRecreational) {
        this.guestList = guestList;
        this.bookedRoom = bookedRoom;
        this.bookedSince = bookedSince;
        this.bookedTo = bookedTo;
        this.isRecreational = isRecreational;
    }

    public String getDescription(){
        String guests = "";
//        for (Guest guest : guestList) {
//            guests += " " + guest.getName() + " " + guest.getSurname();
//        }
        for (int i = 0; i < guestList.size(); i++) {
            guests += guestList.get(i).getName() + " " + guestList.get(i).getSurname();
            if (i != (guestList.size() - 1)){
                guests += " a ";
            }
        }
        return "Rezervováno pro: " + guests + ", Pokoj číslo: " + bookedRoom.getRoomNumber() + ", Rezervováno od: " + bookedSince + " Do: " + bookedTo + ", Je rekreační: " + isRecreational;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public Room getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Room bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public LocalDate getBookedSince() {
        return bookedSince;
    }

    public void setBookedSince(LocalDate bookedSince) {
        this.bookedSince = bookedSince;
    }

    public LocalDate getBookedTo() {
        return bookedTo;
    }

    public void setBookedTo(LocalDate bookedTo) {
        this.bookedTo = bookedTo;
    }

    public boolean isRecreational() {
        return isRecreational;
    }

    public void setRecreational(boolean recreational) {
        isRecreational = recreational;
    }
}
