package com.esmartsheet.controller;

import com.esmartsheet.model.Client;
import com.esmartsheet.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	@RequestMapping("/clientList")
	public String getClients(Model model){
		List<Client> clients=clientService.getClientList();
		model.addAttribute("clients",clients);

		return  "clientlist";
	}
	
}
