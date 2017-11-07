package com.esmartsheet.service;

import com.esmartsheet.model.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {

    void addClient(Client client);
    Client getClientById(int id);
    List<Client> getClientList();
    void deleteClient(Client client);
    void editClient(Client client);
}
