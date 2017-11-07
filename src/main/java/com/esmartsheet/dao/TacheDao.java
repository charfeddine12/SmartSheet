package com.esmartsheet.dao;

import java.util.List;

import com.esmartsheet.model.Tache;

public interface TacheDao {


	void addTache(Tache tache);
	Tache getTacheById(int id);
	List<Tache> getTacheList();
	void deleteTache(Tache tache);
	void editTache(Tache tache);

}
