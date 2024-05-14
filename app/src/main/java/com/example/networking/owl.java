package com.example.networking;

public class owl {

    private String name;
    private int size;
    private int cost;
    private String category;
    private String location;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public owl(String name, int size, int cost, String category, String location) {
        this.name = name;
        this.size = size;
        this.cost = cost;
        this.category = category;
        this.location = location;
    }
}
