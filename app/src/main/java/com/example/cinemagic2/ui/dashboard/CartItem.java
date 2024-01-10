package com.example.cinemagic2.ui.dashboard;

// CartItem.java
public class CartItem {
    private String moviename,seats,date,address;
    private double price;

    public CartItem(String moviename, String seats,String address, String date, double price) {
        this.moviename = moviename;
        this.seats = seats;
        this.address=address;
        this.date = date;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pricerice) {
        this.price = price;
    }
}
