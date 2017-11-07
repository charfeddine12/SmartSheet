package com.esmartsheet.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.esmartsheet.dao.MissionDao;
import com.esmartsheet.model.Mission;

@Repository("MissionDao")
@Transactional
public class MissionDaoImpl implements MissionDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public void addMission(Mission mission) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(mission);
		session.flush();
		
	}
	public void editMission(Mission mission) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(mission);
		session.flush();
		
	}

	public Mission getMissionById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Mission mission=(Mission)session.get(Mission.class, id);
		session.flush();
		return mission;
	}

	
	public List<Mission> getMissionList() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Mission");
		List<Mission>missions=query.list();
		session.flush();
		return missions;
	}

	
	public void deleteMission(Mission mission) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(mission);
		session.flush();
		
	}
	
	

}
