package com.model;

public class Shelter {
    private String location;
    private string shelterId;
    private int capacity;
    private int occupancy;
    private String status; 
    private boolean petFriendly;

    public Shelter(String location, String shelterId, int capacity, int occupancy, String status, boolean petFriendly) {
        this.location = location;
        this.shelterId = shelterId;
        this.capacity = capacity;
        this.occupancy = occupancy;
        this.status = status;
        this.petFriendly = petFriendly;

    }
    public String Shelterstatus() {
        return this.status;
    }

    
    
}
