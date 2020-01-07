package com.eventapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eventapp.models.Event;
import com.eventapp.repository.EventRepository;

@Controller
public class EventController {

	@Autowired
	private EventRepository eventRep;
	
	@GetMapping("/registerEvent")
	public String form() {
		return "./event/formEvent";
	}
	
	@PostMapping("/registerEvent")
	public String form(Event event) {
		eventRep.save(event);
		return "redirect:/registerEvent";
	}
	
}
