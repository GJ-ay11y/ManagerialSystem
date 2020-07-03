package com.gj.pojo;

public class HouseList {
    private int id;
    private String houseid;
    private String address;
    private double area;
    private double price;
    private String status;

    @Override
    public String toString() {
        return "HouseList{" +
                "id=" + id +
                ", houseid='" + houseid + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    public HouseList(int id, String houseid, String address, double area, double price, String status) {
        this.id = id;
        this.houseid = houseid;
        this.address = address;
        this.area = area;
        this.price = price;
        this.status = status;
    }

    public HouseList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseid() {
        return houseid;
    }

    public void setHouseid(String houseid) {
        this.houseid = houseid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
