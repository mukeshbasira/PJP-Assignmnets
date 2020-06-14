package com.mukesh.rest.restfulwebservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mukesh.rest.restfulwebservices.dao.ParticipantDaoService;
import com.mukesh.rest.restfulwebservices.model.Participant;


@RestController
public class ParticipantContoller {

	@Autowired
	private ParticipantDaoService participantDaoService;

	@GetMapping(path = "/participants")
	public List<Participant> findparticipants() {
		return participantDaoService.findAll();
	}

	@GetMapping(path = "/participant/{id}")
	public Participant participant(@PathVariable Integer id) {

		return participantDaoService.findOne(id);
	}

}
