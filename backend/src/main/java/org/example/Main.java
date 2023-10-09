package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bid bid1 = new Bid(1, 100.0, new Date(), "JohnDoe", "Item1", "Active");

        List<String> paymentMethods = new ArrayList<>();
        paymentMethods.add("Credit Card");
        paymentMethods.add("PayPal");

        User user1 = new User(1, "JohnDoe", "password123", "john@example.com", "John Doe",
                "123 Main St", 1000.0, paymentMethods, 5, 10, User.UserType.COMPANY_USER,
                2, 20, 4.5, "profile.jpg", new Date());

        List<String> itemImages = new ArrayList<>();
        itemImages.add("image1.jpg");
        itemImages.add("image2.jpg");

        AuctionItem auctionItem1 = new AuctionItem(1, "Item1", "A nice item", 50.0, "JohnDoe",
                System.currentTimeMillis(), System.currentTimeMillis() + 86400000, "Electronics",
                "New", "New York", itemImages, 75.0, "Free shipping");

        // auctionItem1.setCurrentBid(80.0);
        auctionItem1.getBidders().add("Bidder1");
        // System.out.println("Auction Status: " + auctionItem1.getItemStatus());

        // auctionItem1.closeAuction();

        // System.out.println("Bidder: " + bid1.getBidder());
        // System.out.println("User: " + user1.getUsername());
        // System.out.println("Auction Status: " + auctionItem1.getItemStatus());
        AuctionItem auctionItem2 = new AuctionItem();
        int address = System.identityHashCode(auctionItem2);
        System.out.println(Integer.toHexString(address));
        System.out.println(auctionItem2.getThis());
    }
}