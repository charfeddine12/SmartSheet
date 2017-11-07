package com.esmartsheet.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.esmartsheet.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.esmartsheet.dao.TacheDao;
import com.esmartsheet.model.Tache;
@Controller
@RequestMapping("/tache")
public class TacheController {

@Autowired
	private TacheService tacheService;

	@RequestMapping("/employeList")
	public String gettaches(Model model){
		List<Tache> taches=tacheService.getTacheList();
		model.addAttribute("taches",taches);

		return "tacheList";
	}

}
