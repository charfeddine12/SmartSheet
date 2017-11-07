package com.esmartsheet.service.impl;

import com.esmartsheet.dao.EmployeDao;
import com.esmartsheet.model.Employe;
import com.esmartsheet.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeDao employeDao;

    public Employe getEmployeById(int emp_id) {
        return employeDao.getEmployeById(emp_id);
    }

    public List<Employe> getEmployeList() {
        return employeDao.getEmployeList();
    }
    public void addEmploye (Employe employe) {
         employeDao.addEmploye(employe);
    }
    public void editEmploye(Employe employe) {
        employeDao.editEmploye(employe);
    }
    public void deleteEmploye(Employe employe) {
         employeDao.deleteEmploye(employe);
    }
}
