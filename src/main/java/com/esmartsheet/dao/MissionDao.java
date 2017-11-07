package com.esmartsheet.dao;

import java.util.List;

import com.esmartsheet.model.Mission;



public interface MissionDao {


	void addMission(Mission mission);
	Mission getMissionById(int id);
	List<Mission> getMissionList();
	void deleteMission(Mission mission);
	void editMission(Mission mission);

}
