package com.esmartsheet.controller;

import com.esmartsheet.model.Employe;
import com.esmartsheet.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employe")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

@RequestMapping("/employeList")
    public String getEmployes(Model model){
    List<Employe> employes=employeService.getEmployeList();
    model.addAttribute("employes",employes);

    return "employeList";
}
}
