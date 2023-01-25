package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.DtoLayer.DTO;

@Controller
public class searchController {

	@Autowired
	private ClientController client;
	
	@RequestMapping("/searchPage")
	public String searchPage() {
		return "searchLead";		
	}
	
	@RequestMapping(value="/searchingLeadById",method=RequestMethod.POST)
	public String searchingTheLead(@RequestParam("id")long id,ModelMap model) {
		
		DTO lead=client.getOneLead(id);
		model.addAttribute("details", lead);
		return "allLeadDetails";
	}
}
