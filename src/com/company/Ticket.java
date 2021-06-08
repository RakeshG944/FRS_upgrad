package com.company;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNo;
    private Float price;
    private boolean cancelled = true;

    //getters and setters
    public String getPnr() {
        return pnr;
    }

    //    constructors

    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime,
                  String arrivalDateTime, Passenger passenger, String seatNo, Float price) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;

    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatNO() {
        return seatNo;
    }

    public void setSeatNO(String seatNO) {
        this.seatNo = seatNO;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

//    Methods
    public String checkStatus(){
        if(!isCancelled()) return "Cancelled";
        else return "Confirmed";
    }
//    public int flightDuration(){
//            return
//    }
    public void cancel(){
        this.cancelled=true;
    }




}
