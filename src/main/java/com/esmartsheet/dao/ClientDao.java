package com.esmartsheet.dao;

import java.util.List;

import com.esmartsheet.model.Client;
import org.springframework.stereotype.Service;


public interface ClientDao {


	void addClient(Client client);
	Client getClientById(int id);
	List<Client> getClientList();
	void deleteClient(Client client);
	void editClient(Client client);

}
