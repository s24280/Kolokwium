package com.example.demo;

import java.util.Optional;

public class BankService {
    Client client;
    Transaction transaction;

    public BankService(Client client, Transaction transaction){
        this.client=client;
        this.transaction=transaction;
    }

    public Client registerCustomer(String name, String id, double balance) {
        return new Client(name, id, balance);
    }

    public Transaction sendMoney(String id, double balance) {
        Optional<Client> client = ClientStorage.findClientById(id);
        if(client.isEmpty()) {
            System.out.println("There is no such client");
            return null;
        }   else {
            client.get().setBalance(-balance);
        }

        return new Transaction(balance);
    }
}


