package com.esmartsheet.service;

import com.esmartsheet.model.Tache;

import java.util.List;

public interface TacheService {

    void addTache(Tache tache);
    Tache getTacheById(int id);
    List<Tache> getTacheList();
    void deleteTache(Tache tache);
    void editTache(Tache tache);
}
