package com.company;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public String getHotelAddress() {
        return hotelAddress;
    }

    //Getters and setters
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    //Method
    public void removeAndAddLocations(String removeLocation, String addLocation){
        for(int i=0;i<selectedTouristLocation.length;i++) if (removeLocation == selectedTouristLocation[i]) {
            selectedTouristLocation[i] = addLocation;

        }
    }

    //Constructors
    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, Float price) {
        super(pnr, from, to, flight, departureDateTime,
                arrivalDateTime, passenger,  seatNo, price);
    }

}
