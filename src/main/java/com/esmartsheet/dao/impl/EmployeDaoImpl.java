package com.esmartsheet.dao.impl;

import com.esmartsheet.dao.EmployeDao;
import com.esmartsheet.model.Employe;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EmployeDaoImpl implements EmployeDao {
    @Autowired
    public SessionFactory sessionFactory;



    public Employe getEmployeById(int id){
        Session session=sessionFactory.getCurrentSession();
        Employe employe=(Employe)session.get(Employe.class,id);

        return employe;
    }

    public List<Employe> getEmployeList(){
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Employe");
        List<Employe> employes=query.list();
        session.flush();
        return employes;
    }


    public void addEmploye(Employe employe){
        Session session =sessionFactory.getCurrentSession();
        session.saveOrUpdate(employe);
        session.flush();

    }

    public void deleteEmploye (Employe employe){
        Session session=sessionFactory.getCurrentSession();
        session.delete(employe);
        session.flush();
    }
    public void editEmploye(Employe employe){
        Session session =sessionFactory.getCurrentSession();
        session.saveOrUpdate(employe);
        session.flush();
    }
}
