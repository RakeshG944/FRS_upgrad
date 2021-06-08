package com.company;

public class RegularTicket extends Ticket{
    private String specialServices;

    public String getSpecialServices() { return specialServices; }
    public void setSpecialServices(String specialServices){this.specialServices = specialServices;}

    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, Float price) {
        super(pnr, from, to, flight, departureDateTime,
                arrivalDateTime, passenger,  seatNo, price);
    }
}
