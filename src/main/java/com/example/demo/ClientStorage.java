package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class ClientStorage {
    private static final List<Client> clientList = new ArrayList<>();

    public void ClientList() {
        clientList.add(new Client("Tomasz Wasielewski", "1", 1234));
        clientList.add(new Client("Elon Muzg", "2", 300.50));
    }

    public static Optional<Client> findClientById(String id) {
        return getClientList().stream()
                .filter(storage -> storage.getId().equals(id))
                .findFirst();
    }

    public static List<Client> getClientList() {
        return clientList;
    }

}


