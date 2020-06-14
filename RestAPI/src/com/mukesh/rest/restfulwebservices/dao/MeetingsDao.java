package com.mukesh.rest.restfulwebservices.dao;

import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mukesh.rest.restfulwebservices.model.Meeting;

@Component
public class MeetingsDao {
	@Autowired
	Meeting meeting;



	private static ArrayList<Meeting> meetings = new ArrayList<>();
	Calendar c1 = Calendar.getInstance();
	static {
		meetings.add(new Meeting(1001, "Spring", "2011-01-01 00:00:00", "2011-01-01 02:00:00"));
		meetings.add(new Meeting(1001, "Java", "2011-01-01 10:00:00", "2011-01-01 12:00:00"));
		meetings.add(new Meeting(1001, "SpringBOOT", "2012-01-01 00:05:00", "2011-01-01 02:00:00"));

	}

	public ArrayList<Meeting> findAll() {
		return meetings;
	}



	public Meeting findOne(int id) {
		for (Meeting meet : meetings) {
			if (meet.getMeetingId() == id) {
				return meet;
			}
		}
		return null;
	}




}
