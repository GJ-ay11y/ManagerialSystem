package com.gj.pojo;

public class Paid {
    private int id;
    private String house_id;
    private String address;
    private double price;
    private String date;
    private String paydate;
    private String name;
    private int userlist_id;
    private String status;

    public Paid() {
    }

    public Paid(int id, String house_id, String address, double price, String date, String paydate, String name, int userlist_id, String status) {
        this.id = id;
        this.house_id = house_id;
        this.address = address;
        this.price = price;
        this.date = date;
        this.paydate = paydate;
        this.name = name;
        this.userlist_id = userlist_id;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Paid{" +
                "id=" + id +
                ", house_id='" + house_id + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", paydate='" + paydate + '\'' +
                ", name='" + name + '\'' +
                ", userlist_id=" + userlist_id +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouse_id() {
        return house_id;
    }

    public void setHouse_id(String house_id) {
        this.house_id = house_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserlist_id() {
        return userlist_id;
    }

    public void setUserlist_id(int userlist_id) {
        this.userlist_id = userlist_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
