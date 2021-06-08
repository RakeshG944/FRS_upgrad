package com.company;

public class Passenger {
        private static int idCounter;
        private int id;

        static {
                idCounter = 0;
        }

    public Passenger(String street, String city, String state, String name, String phone,String email) {
            this.id=++idCounter;
            this.address= new Address(street,city,state);
            this.contact= new Contact(name,phone,email);
    }

    public static class Address {
            private String street;
            private String city;
            private String state;

            public Address(String street,String city,String state){
                    this.street=street;
                    this.city=city;
                    this.state=state;
            }

            // Getters and Setters

            public String getStreet() { return street; }
            public void setStreet(String street) { this.street = street; }

            public String getCity() { return city; }
            public void setCity(String city) { this.city = city; }

            public String getState() { return state; }
            public void setState(String state) { this.state = state; }

//            Methods
            public String addressDetails() { return street+","+city+","+state; }
        }
        private Address address;
        public String getAddress() { return address.addressDetails(); }

    public static class Contact{
            private String name;
            private String phone;
            private String email;

            public Contact(String name, String phone, String email) {
                    this.name = name;
                    this.phone = phone;
                    this.email = email;
            }
// Getters and Setters

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public String getPhone() { return phone; }
            public void setPhone(String phone) { this.phone = phone; }

            public String getEmail() { return email; }
            public void setEmail(String email) { this.email = email; }

//            Methods
            public String contactDetails(){ return name+phone+email;}
        }
        private Contact contact;

        public String getContact() { return contact.contactDetails(); }




}
