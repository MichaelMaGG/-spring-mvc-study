package com.imooc.mvcdemo.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Item {
    private int id;
    private Date time;
    private String startPoint;
    private String destination;
    private double transportCost;
    private double loudCost;
    private double unloudCost;
    private Timestamp timeStamp;
    private Date modifyTime;
    private int modifier;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public String getStartPoint() {
        return startPoint;
    }
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public double getTransportCost() {
        return transportCost;
    }
    public void setTransportCost(double transportCost) {
        this.transportCost = transportCost;
    }
    public double getLoudCost() {
        return loudCost;
    }
    public void setLoudCost(double loudCost) {
        this.loudCost = loudCost;
    }
    public double getUnloudCost() {
        return unloudCost;
    }
    public void setUnloudCost(double unloudCost) {
        this.unloudCost = unloudCost;
    }
    public Timestamp getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
    public Date getModifyTime() {
        return modifyTime;
    }
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
    public int getModifier() {
        return modifier;
    }
    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

}
