package com.esmartsheet.controller;

import com.esmartsheet.dao.EmployeDao;
import com.esmartsheet.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {
        @RequestMapping("/")
        public String home(){
            return "home";
        }


 }
