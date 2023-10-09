package org.example;

import java.util.ArrayList;
import java.util.List;

public class AuctionItem {
    private int ItemID;
    private String ItemName;
    private String ItemDescription;
    private double StartingPrice;
    private double CurrentBid;
    private double BidIncrement;
    private long AuctionStartTime;
    private long AuctionEndTime;
    private String Seller;
    private List<String> Bidders;
    private String ItemStatus;
    private String ItemCategory;
    private List<String> ItemImages;
    private double ReservePrice;
    private String ShippingDetails;
    private String ItemCondition;
    private String ItemLocation;

    public AuctionItem(int itemID, String itemName, String itemDescription, double startingPrice,
                       String seller, long auctionStartTime, long auctionEndTime,
                       String itemCategory, String itemCondition, String itemLocation,
                       List<String> itemImages, double reservePrice, String shippingDetails) {
        this.ItemID = itemID;
        this.ItemName = itemName;
        this.ItemDescription = itemDescription;
        this.StartingPrice = startingPrice;
        this.CurrentBid = startingPrice;
        this.BidIncrement = 10;
        this.AuctionStartTime = auctionStartTime;
        this.AuctionEndTime = auctionEndTime;
        this.Seller = seller;
        this.Bidders = new ArrayList<>();
        this.ItemStatus = "Active";
        this.ItemCategory = itemCategory;
        this.ItemImages = itemImages;
        this.ReservePrice = reservePrice;
        this.ShippingDetails = shippingDetails;
        this.ItemCondition = itemCondition;
        this.ItemLocation = itemLocation;
    }

    public AuctionItem (){
        System.out.println("default constructor called");
    };

    public AuctionItem getThis() {
        return this;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        this.ItemID = itemID;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.ItemDescription = itemDescription;
    }

    public double getStartingPrice() {
        return StartingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.StartingPrice = startingPrice;
    }

    public double getCurrentBid() {
        return CurrentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.CurrentBid = currentBid;
    }

    public double getBidIncrement() {
        return BidIncrement;
    }

    public void setBidIncrement(double bidIncrement) {
        this.BidIncrement = bidIncrement;
    }

    public long getAuctionStartTime() {
        return AuctionStartTime;
    }

    public void setAuctionStartTime(long auctionStartTime) {
        this.AuctionStartTime = auctionStartTime;
    }

    public long getAuctionEndTime() {
        return AuctionEndTime;
    }

    public void setAuctionEndTime(long auctionEndTime) {
        this.AuctionEndTime = auctionEndTime;
    }

    public String getSeller() {
        return Seller;
    }

    public void setSeller(String seller) {
        this.Seller = seller;
    }

    public List<String> getBidders() {
        return Bidders;
    }

    public void setBidders(List<String> bidders) {
        this.Bidders = bidders;
    }

    public String getItemStatus() {
        return ItemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.ItemStatus = itemStatus;
    }

    public String getItemCategory() {
        return ItemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.ItemCategory = itemCategory;
    }

    public List<String> getItemImages() {
        return ItemImages;
    }

    public void setItemImages(List<String> itemImages) {
        this.ItemImages = itemImages;
    }

    public double getReservePrice() {
        return ReservePrice;
    }

    public void setReservePrice(double reservePrice) {
        this.ReservePrice = reservePrice;
    }

    public String getShippingDetails() {
        return ShippingDetails;
    }

    public void setShippingDetails(String shippingDetails) {
        this.ShippingDetails = shippingDetails;
    }

    public String getItemCondition() {
        return ItemCondition;
    }

    public void setItemCondition(String itemCondition) {
        this.ItemCondition = itemCondition;
    }

    public String getItemLocation() {
        return ItemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.ItemLocation = itemLocation;
    }

    public void closeAuction() {
        if ("Active".equals(ItemStatus)) {
            ItemStatus = "Sold";
        }
    }
}
