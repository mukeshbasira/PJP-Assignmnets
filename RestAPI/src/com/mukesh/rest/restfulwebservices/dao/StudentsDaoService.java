package com.mukesh.rest.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mukesh.rest.restfulwebservices.model.Participant;

@Component
public class StudentsDaoService {

	private static List<Participant> participants = new ArrayList<>();

	private static int usersCount = 5;

	static {

	}

	public List<Participant> findAll() {
		return participants;
	}

	public Participant findOne(int id) {
		for (Participant participant : participants) {
			if (participant.getpId() == id) {
				return participant;
			}
		}
		return null;
	}



}
