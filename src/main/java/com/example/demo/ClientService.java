package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ClientService {

    ClientStorage clientStorage;

    public ClientService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;

    }
    public BankService sendMoney(Client client, double balance) {

        return new BankService(client, new Transaction(balance));
    }

}
