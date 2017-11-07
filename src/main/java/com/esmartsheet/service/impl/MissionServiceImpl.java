package com.esmartsheet.service.impl;

import com.esmartsheet.dao.MissionDao;
import com.esmartsheet.model.Mission;
import com.esmartsheet.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionServiceImpl implements MissionService {

    @Autowired
    private MissionDao missionDao;

    public Mission getMissionById(int emp_id) {
        return missionDao.getMissionById(emp_id);
    }

    public List<Mission> getMissionList() {
        return missionDao.getMissionList();
    }
    public void addMission(Mission mission) {
        missionDao.addMission(mission);
    }
    public void editMission(Mission mission) {
        missionDao.editMission(mission);
    }
    public void deleteMission(Mission mission) {
        missionDao.deleteMission(mission);
    }
}
