package org.example;

import java.util.Date;
import java.util.List;

public interface UserInterface {
    int getUserID();
    void setUserID(int userID);

    String getUsername();
    void setUsername(String username);

    String getPassword();
    void setPassword(String password);

    String getEmail();
    void setEmail(String email);

    String getFullName();
    void setFullName(String fullName);

    String getAddress();
    void setAddress(String address);

    double getAccountBalance();
    void setAccountBalance(double accountBalance);

    List<String> getPaymentMethods();
    void setPaymentMethods(List<String> paymentMethods);

    int getAuctionsCreated();
    void setAuctionsCreated(int auctionsCreated);

    int getAuctionsParticipated();
    void setAuctionsParticipated(int auctionsParticipated);

    User.UserType getUserType();
    void setUserType(User.UserType userType);

    int getBidsWon();
    void setBidsWon(int bidsWon);

    int getBidsPlaced();
    void setBidsPlaced(int bidsPlaced);

    double getRating();
    void setRating(double rating);

    String getProfilePicture();
    void setProfilePicture(String profilePicture);

    Date getLastLogin();
    void setLastLogin(Date lastLogin);

    enum UserType {
        COMPANY_USER,
        REGULAR_USER
    }
}
