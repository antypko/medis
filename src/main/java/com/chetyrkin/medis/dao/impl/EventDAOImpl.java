package com.chetyrkin.medis.dao.impl;

import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.EventDAO;
import com.chetyrkin.medis.domain.Event;

@Repository("eventDAO")
public class EventDAOImpl extends GenericDAOImpl<Event, Long> implements EventDAO {

	protected EventDAOImpl() {
		super(Event.class);
	}

	

}
