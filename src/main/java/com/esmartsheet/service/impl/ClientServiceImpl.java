package com.esmartsheet.service.impl;

import com.esmartsheet.dao.ClientDao;
import com.esmartsheet.model.Client;
import com.esmartsheet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    public Client getClientById(int cli_id) {
        return clientDao.getClientById(cli_id);
    }
    public List<Client> getClientList() {
        return clientDao.getClientList();
    }
    public void addClient (Client client) {
        clientDao.addClient(client);
    }
    public void editClient(Client client) {
        clientDao.editClient(client);
    }
    public void deleteClient(Client client) {
        clientDao.deleteClient(client);
    }
}
