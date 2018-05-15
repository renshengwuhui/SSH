package sshtest.sshtest1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sshtest.sshtest1.bo.User;
import sshtest.sshtest1.dao.IUserDao;
import sshtest.sshtest1.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User load(Integer id) {
		// TODO Auto-generated method stub
		return userDao.load(id);
	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public void persist(User entity) {
		// TODO Auto-generated method stub
		userDao.persist(entity);
	}

	@Override
	public Integer save(User entity) {
		// TODO Auto-generated method stub
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		userDao.flush();
	}
	
	
}
