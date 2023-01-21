package com.example.demo;

public class Transfer {
    double transferAmount;

    int clientId;
    
    public Transfer(int clientId, double transferAmount) {
        this.clientId = clientId;
        this.transferAmount = transferAmount;
    }
    
}
