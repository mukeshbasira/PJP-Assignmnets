package com.mukesh.rest.restfulwebservices.controller;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mukesh.rest.restfulwebservices.dao.MeetingsDao;
import com.mukesh.rest.restfulwebservices.model.Meeting;
import com.mukesh.rest.restfulwebservices.model.Participant;




@RestController
public class MeetingsController {

	@Autowired
	private MeetingsDao meetingsDao;

	@GetMapping(path = "/meeting")
	public ArrayList<Meeting> findAllMeetings() {
		return meetingsDao.findAll();
	}

	@GetMapping(path = "/meeting/{id}")
	public Meeting FindOneMeeting(@PathVariable Integer id) {
		return meetingsDao.findOne(id);
	}

	@GetMapping(path = "/meeting/{id}/participants")
	public HashSet<Participant> FindMeetingParticipants(@PathVariable Integer id) {

		return meetingsDao.FindParticipants(id);


	}
}
