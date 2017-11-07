package com.esmartsheet.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.esmartsheet.dao.TacheDao;
import com.esmartsheet.model.Tache;

@Repository("TacheDao")
@Transactional
public class TacheDaoImpl implements TacheDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public void addTache(Tache tache) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(tache);
		session.flush();
		
	}
	public void editTache(Tache tache) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(tache);
		session.flush();
		
	}

	public Tache getTacheById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Tache tache=(Tache)session.get(Tache.class, id);
		session.flush();
		return tache;
	}

	
	public List<Tache> getTacheList() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Tache");
		List<Tache>taches=query.list();
		session.flush();
		return taches;
	}

	
	public void deleteTache(Tache tache) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(tache);
		session.flush();
		
	}
	
	

}
