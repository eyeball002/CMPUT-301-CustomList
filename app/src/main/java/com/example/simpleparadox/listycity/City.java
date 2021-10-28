package com.example.simpleparadox.listycity;

public class City {
    private String city;
    private String province;

    // For test to work, this needs to be public rather than private.
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
}
