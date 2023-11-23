package org.example;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class AuctionSystem {
    private List<AuctionItem> activeAuctions;
    private List<User> users;
    private List<Bid> bidHistory;

    private static int totalAuctions = 0;

    public AuctionSystem() {
        activeAuctions = new ArrayList<>();
        users = new ArrayList<>();
        bidHistory = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    // public void showUsers() {
    //     for (int i = 0; i < users.size(); i++) {
    //         System.out.println(users.get(i).getUsername());
    //     }
    // }

    public List<User> showUsers (){
        return users; 
    }

    public void startAuction(AuctionItem item) {
        activeAuctions.add(item);
        totalAuctions++;
    }

    public static int getTotalAuctions() {
        // System.out.println("total auctions are ");
        return totalAuctions;
    }

    public void placeBid(User bidder, AuctionItem item, double amount) {
        if (item.getItemStatus().equals("Active")) {
            double currentBid = item.getCurrentBid();
            if (amount > currentBid) {
                item.setCurrentBid(amount);
                bidHistory.add(new Bid(bidHistory.size() + 1, amount, new Date(), bidder.getUsername(), item.getItemName(), "Active"));
                System.out.println("Bidder: " + bidder.getUsername() + " placed a bid of "+  amount + " on " + item.getItemName() + ".");
            }
            else{
                System.out.println("Invalid bid");
            }
        }
    }

    public void closeAuction(AuctionItem item) {
        item.closeAuction();
    }

    
}
