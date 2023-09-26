package org.example;

import java.util.Date;

public class Bid {
    private int bidID;
    private double bidAmount;
    private Date bidTime;
    private String bidder;
    private String auctionItem;
    private String bidStatus;

    // Constructor
    public Bid(int bidID, double bidAmount, Date bidTime, String bidder, String auctionItem, String bidStatus) {
        this.bidID = bidID;
        this.bidAmount = bidAmount;
        this.bidTime = bidTime;
        this.bidder = bidder;
        this.auctionItem = auctionItem;
        this.bidStatus = bidStatus;
    }

    public int getBidID() {
        return bidID;
    }

    public void setBidID(int bidID) {
        this.bidID = bidID;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    public String getBidder() {
        return bidder;
    }

    public void setBidder(String bidder) {
        this.bidder = bidder;
    }

    public String getAuctionItem() {
        return auctionItem;
    }

    public void setAuctionItem(String auctionItem) {
        this.auctionItem = auctionItem;
    }

    public String getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }
}
