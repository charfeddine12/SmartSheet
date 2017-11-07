package com.esmartsheet.service;

import com.esmartsheet.model.Employe;

import java.util.List;

public interface EmployeService {

    List<Employe> getEmployeList();
    Employe getEmployeById(int id);
    void addEmploye(Employe employe);
    void editEmploye(Employe employe);
    void deleteEmploye(Employe employe);
}
