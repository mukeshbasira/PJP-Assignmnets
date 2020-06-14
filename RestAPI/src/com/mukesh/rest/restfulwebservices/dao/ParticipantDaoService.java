package com.mukesh.rest.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mukesh.rest.restfulwebservices.model.Participant;

@Component
public class ParticipantDaoService {
	@Autowired
	MeetingsDao meetingsDao;

	private static List<Participant> participants = new ArrayList<>();
	private static HashMap<Integer, HashSet<Participant>> map = new HashMap<Integer, HashSet<Participant>>();



	static {
		participants.add(new Participant(100, "mukesh", 1001));
		participants.add(new Participant(101, "ganesh", 1001));
		participants.add(new Participant(102, "aryan", 1001));
		participants.add(new Participant(103, "tripti", 1001));

		participants.add(new Participant(104, "vijay", 1002));
		participants.add(new Participant(105, "sanjay", 1002));
		participants.add(new Participant(106, "akshay", 1003));
		participants.add(new Participant(107, "salman", 1003));

	}




	public ParticipantDaoService() {
		super();
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

	public void AddParticipant(Participant p, Integer MeetingId) {
		System.out.println(map);

		if (meetingsDao.findOne(MeetingId) != null) {


			if (map.containsKey(MeetingId)) {
				map.get(MeetingId).add(p);

			} else {

				map.put(MeetingId, new HashSet<Participant>(Arrays.asList(p)));

			}

		}


	}

	public void AddAll() {

		for (Participant participant : participants) {
			AddParticipant(participant, participant.getMeetingId());
		}
		System.out.println(map);

	}

	public HashSet<Participant> findAllParticipantsFromMeeting(Integer Meetingid) {
		AddAll();
		if (map.containsKey(Meetingid)) {
			return map.get(Meetingid);

		}
		return null;
	}





}
