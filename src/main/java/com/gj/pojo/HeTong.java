package com.gj.pojo;

public class HeTong {
    private int id;
    private String chuzu;
    private String chuzu_idcard;
    private String zuke;
    private String zuke_idcard;
    private String fromdate;
    private String todate;
    private double price;
    private String address;
    private String house_id;
    private int payday;

    public HeTong() {
    }

    public HeTong(int id, String chuzu, String chuzu_idcard, String zuke, String zuke_idcard, String fromdate, String today, double price, String address, String house_id, int payday) {
        this.id = id;
        this.chuzu = chuzu;
        this.chuzu_idcard = chuzu_idcard;
        this.zuke = zuke;
        this.zuke_idcard = zuke_idcard;
        this.fromdate = fromdate;
        this.todate = todate;
        this.price = price;
        this.address = address;
        this.house_id = house_id;
        this.payday = payday;
    }

    @Override
    public String toString() {
        return "HeTong{" +
                "id=" + id +
                ", chuzu='" + chuzu + '\'' +
                ", chuzu_idcard='" + chuzu_idcard + '\'' +
                ", zuke='" + zuke + '\'' +
                ", zuke_idcard='" + zuke_idcard + '\'' +
                ", fromdate='" + fromdate + '\'' +
                ", today='" + todate + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", house_id='" + house_id + '\'' +
                ", payday=" + payday +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChuzu() {
        return chuzu;
    }

    public void setChuzu(String chuzu) {
        this.chuzu = chuzu;
    }

    public String getChuzu_idcard() {
        return chuzu_idcard;
    }

    public void setChuzu_idcard(String chuzu_idcard) {
        this.chuzu_idcard = chuzu_idcard;
    }

    public String getZuke() {
        return zuke;
    }

    public void setZuke(String zuke) {
        this.zuke = zuke;
    }

    public String getZuke_idcard() {
        return zuke_idcard;
    }

    public void setZuke_idcard(String zuke_idcard) {
        this.zuke_idcard = zuke_idcard;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouse_id() {
        return house_id;
    }

    public void setHouse_id(String house_id) {
        this.house_id = house_id;
    }

    public int getPayday() {
        return payday;
    }

    public void setPayday(int payday) {
        this.payday = payday;
    }
}
