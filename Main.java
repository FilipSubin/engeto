package com.engeto.lekce02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Guest adela = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest jan = new Guest("Jan","Dvořáček", LocalDate.of(1995,5,5));

        System.out.println(adela.getDescription());
        System.out.println(jan.getDescription());

        Room room01 = new Room(1,1, BigDecimal.valueOf(1000),true,true);
        Room room02 = new Room(2,1, BigDecimal.valueOf(1000),true,true);
        Room room03 = new Room(3,3, BigDecimal.valueOf(2400),false,true);

        System.out.println(room01.getDescription());
        System.out.println(room02.getDescription());
        System.out.println(room03.getDescription());

        List<Guest> guestList01 = new ArrayList<>();
        List<Guest> guestList02 = new ArrayList<>();

        guestList01.add(adela);

        guestList02.add(adela);
        guestList02.add(jan);

        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(new Booking(guestList01,room01,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),true));
        bookingList.add(new Booking(guestList02,room03,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),true));

        // Vypiš seznam všech rezervací.
        for (Booking book : bookingList) {
            System.out.println(book.getDescription());
        }
    }
}