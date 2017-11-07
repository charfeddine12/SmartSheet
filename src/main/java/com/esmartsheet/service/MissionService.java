package com.esmartsheet.service;

import com.esmartsheet.model.Mission;

import java.util.List;

public interface MissionService {

    void addMission(Mission mission);
    Mission getMissionById(int id);
    List<Mission> getMissionList();
    void deleteMission(Mission mission);
    void editMission(Mission mission);
}
