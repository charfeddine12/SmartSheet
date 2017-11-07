package com.esmartsheet.service.impl;

import com.esmartsheet.dao.TacheDao;
import com.esmartsheet.model.Tache;
import com.esmartsheet.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheServiceImpl implements TacheService {

    @Autowired
    private TacheDao tacheDao;

    public Tache getTacheById(int emp_id) {
        return tacheDao.getTacheById(emp_id);
    }

    public List<Tache> getTacheList() {
        return tacheDao.getTacheList();
    }
    public void addTache(Tache tache) {
        tacheDao.addTache(tache);
    }
    public void editTache(Tache tache) {
        tacheDao.editTache(tache);
    }
    public void deleteTache(Tache tache) {
        tacheDao.deleteTache(tache);
    }
}
