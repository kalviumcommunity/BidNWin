package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AuctionSystem auctionSystem = new AuctionSystem();

        User seller = new User(1, "Dr Frank", "password123", "Evil@example.com", "Frank Castalinio", "BatCave",
                1000.0, new ArrayList<>(), 1, 0, User.UserType.REGULAR_USER, 0, 0, 5.0, "seller.jpg", new Date());

        auctionSystem.registerUser(seller);

        List<String> itemImages = new ArrayList<>();
        itemImages.add("item1.jpg");
        itemImages.add("item2.jpg");
        AuctionItem item = new AuctionItem(1, "Gamma Pulsator", "High Density Gamma rays pulsator", 100.0, seller.getUsername(),
                new Date().getTime(), new Date().getTime() + 3600000, "Electronics", "New", "Gotham",
                itemImages, 150.0, "Free shipping");

        auctionSystem.startAuction(item);

        User bidder = new User(2, "bidder456", "password456", "bidder@example.com", "Bidder Name", "Bidder Address",
                500.0, new ArrayList<>(), 0, 0, User.UserType.COMPANY_USER, 0, 0, 4.5, "bidder.jpg", new Date());

        auctionSystem.registerUser(bidder);

        System.out.println("Auction System: Auction started.");

        System.out.println("Seller: " + seller.getUsername() + " registered.");
        System.out.println("Item: " + item.getItemName() + " listed for auction.");

        auctionSystem.placeBid(bidder, item, 120.0);
        // System.out.println("Bidder: " + bidder.getUsername() + " placed a bid of $120 on " + item.getItemName() + ".");

        User bidder2 = new User(3, "bidder789", "password789", "anotherbidder@example.com", "Another Bidder", "Bidder Address",
                700.0, new ArrayList<>(), 0, 0, User.UserType.REGULAR_USER, 0, 0, 4.0, "another_bidder.jpg", new Date());

        auctionSystem.registerUser(bidder2);

        auctionSystem.placeBid(bidder2, item, 150.0);
        // System.out.println("Bidder: " + bidder2.getUsername() + " placed a bid of $150 on " + item.getItemName() + ".");

        auctionSystem.closeAuction(item);
        System.out.println("Auction for " + item.getItemName() + " closed.");
        auctionSystem.showUsers();
        // System.out.println(auctionSystem.showUsers());
    }
}