package org.example;

import java.util.List;
import java.util.Date;

public class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String address;
    private double accountBalance;
    private List<String> paymentMethods;
    private int auctionsCreated;
    private int auctionsParticipated;
    private UserType userType;
    private int bidsWon;
    private int bidsPlaced;
    private double rating;
    private String profilePicture;
    private Date lastLogin;

    public User(int userID, String username, String password, String email, String fullName, String address,
                double accountBalance, List<String> paymentMethods, int auctionsCreated,
                int auctionsParticipated, UserType userType, int bidsWon, int bidsPlaced, double rating,
                String profilePicture, Date lastLogin) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullName = fullName;
        this.address = address;
        this.accountBalance = accountBalance;
        this.paymentMethods = paymentMethods;
        this.auctionsCreated = auctionsCreated;
        this.auctionsParticipated = auctionsParticipated;
        this.userType = userType;
        this.bidsWon = bidsWon;
        this.bidsPlaced = bidsPlaced;
        this.rating = rating;
        this.profilePicture = profilePicture;
        this.lastLogin = lastLogin;
    }

    public int getUserID() { return userID; }
    public void setUserID(int userID) { this.userID = userID; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getAccountBalance() { return accountBalance; }
    public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

    public List<String> getPaymentMethods() { return paymentMethods; }
    public void setPaymentMethods(List<String> paymentMethods) { this.paymentMethods = paymentMethods; }

    public int getAuctionsCreated() { return auctionsCreated; }
    public void setAuctionsCreated(int auctionsCreated) { this.auctionsCreated = auctionsCreated; }

    public int getAuctionsParticipated() { return auctionsParticipated; }
    public void setAuctionsParticipated(int auctionsParticipated) { this.auctionsParticipated = auctionsParticipated; }

    public UserType getUserType() { return userType; }
    public void setUserType(UserType userType) { this.userType = userType; }

    public int getBidsWon() { return bidsWon; }
    public void setBidsWon(int bidsWon) { this.bidsWon = bidsWon; }

    public int getBidsPlaced() { return bidsPlaced; }
    public void setBidsPlaced(int bidsPlaced) { this.bidsPlaced = bidsPlaced; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String getProfilePicture() { return profilePicture; }
    public void setProfilePicture(String profilePicture) { this.profilePicture = profilePicture; }

    public Date getLastLogin() { return lastLogin; }
    public void setLastLogin(Date lastLogin) { this.lastLogin = lastLogin; }

    public enum UserType {
        COMPANY_USER,
        REGULAR_USER
    }
}
