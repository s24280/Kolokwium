package com.example.demo;

public class Transaction {
    double transferAmount;

    public Transaction(double transfer) {

    this.transferAmount = transfer;
    }

    enum status {
        ACCEPTED, DECLINED
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }
}
