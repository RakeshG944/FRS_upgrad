package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passenger1=new Passenger("MG Nagar",
                "Bangalore","karnataka","Ramesh",
                "9242100100","abc@gmail.com");
        Flight flight1=new Flight("Spice_45","Spicejet",150,95);
        RegularTicket regTick1=new RegularTicket("Spice949852","Bangalore","Sanfransisco",
                flight1,"10.30AM","5.30PM",passenger1,"B23", 4500F);
        TouristTicket tourTick1=new TouristTicket("Spice765932","Bangalore","Mumbai",
                flight1,"10.30AM","5.30PM",passenger1,"B23", 4500F);

        printTicketDetails(regTick1);
        printTicketDetails(tourTick1);

    }

    public static void printTicketDetails(Ticket regTick1){
        System.out.println(regTick1.getPnr());
    }
}
