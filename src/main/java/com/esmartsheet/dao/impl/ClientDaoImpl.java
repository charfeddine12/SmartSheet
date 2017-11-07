package com.esmartsheet.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esmartsheet.dao.ClientDao;
import com.esmartsheet.model.Client;

@Repository("clientDao")
@Transactional
public class ClientDaoImpl implements ClientDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Client getClientById(int id){
		Session session=sessionFactory.getCurrentSession();
		Client client=(Client) session.get(Client.class,id);

		return client;
	}

	public List<Client> getClientList() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Client");
		List<Client>clients=query.list();
		session.flush();
		return clients;
	}

	public void addClient(Client client) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(client);
		session.flush();
		
	}
	public void editClient(Client client) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(client);
		session.flush();
		
	}

	
	public void deleteClient(Client client) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(client);
		session.flush();
		
	}
	
	

}
