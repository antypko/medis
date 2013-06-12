package com.chetyrkin.medis.dao.impl;

import org.springframework.stereotype.Repository;

import com.chetyrkin.medis.dao.UserDAO;
import com.chetyrkin.medis.domain.User;

@Repository("userDAO")
public class UserDAOImpl extends AbstractDAOImpl<User, Long> implements UserDAO {

	protected UserDAOImpl() {
		super(User.class);
	}


}
