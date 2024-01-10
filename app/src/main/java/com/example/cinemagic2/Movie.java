package com.example.cinemagic2;

public class Movie {

    String moviename,date,address,language,seats,dimension;
    int moiveticketscount;
    Double price;

    public Movie(String moviename, String date, String address, String language, String seats, String dimension, int moiveticketscount, Double price) {
        this.moviename = moviename;
        this.date = date;
        this.address = address;
        this.language = language;
        this.seats = seats;
        this.dimension = dimension;
        this.moiveticketscount = moiveticketscount;
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Movie(String moviename, int moiveticketscount, Double price, String date, String address, String language, String seats, String dimension) {
        this.moviename = moviename;
        this.moiveticketscount = moiveticketscount;
        this.price = price;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getMoiveticketscount() {
        return moiveticketscount;
    }

    public void setMoiveticketscount(int moiveticketscount) {
        this.moiveticketscount = moiveticketscount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
