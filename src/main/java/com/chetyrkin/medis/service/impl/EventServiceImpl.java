package com.chetyrkin.medis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.EventDAO;
import com.chetyrkin.medis.service.EventService;

@Service("eventService") 
@Transactional(readOnly = true)
public class EventServiceImpl implements EventService {

	
	private EventDAO eventDAO;
	
	@Autowired
	public EventServiceImpl(EventDAO eventDAO) {
		this.eventDAO = eventDAO;
	}
}
