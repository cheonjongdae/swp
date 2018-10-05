package com.jade.swp.service;

import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jade.swp.domain.User;
import com.jade.swp.dto.LoginDTO;
import com.jade.swp.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	private UserDAO dao;

	@Override
	public User login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}

	@Override
	public void keepLogin(String uid, String id, Date expire) {
		dao.keepLogin(uid, id, expire);
	}

}
