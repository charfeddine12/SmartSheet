package com.esmartsheet.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.esmartsheet.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.esmartsheet.dao.MissionDao;
import com.esmartsheet.model.Mission;
@Controller
@RequestMapping("/mission")
public class MissionController {
	@Autowired
	private MissionService missionService;

	@RequestMapping("/employeList")
	public String getMissions(Model model){
		List<Mission> missions=missionService.getMissionList();
		model.addAttribute("missions",missions);

		return "missionList";
	}


}
