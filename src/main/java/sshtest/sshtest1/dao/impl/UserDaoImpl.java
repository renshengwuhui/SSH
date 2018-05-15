package sshtest.sshtest1.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sshtest.sshtest1.bo.User;
import sshtest.sshtest1.dao.IUserDao;



@Repository("userDao")
public class UserDaoImpl implements IUserDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }
	@Override
	public User load(Integer id) {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			return session.load(User.class, id);
		}finally {
			session.close();
		}
	}
	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			return session.get(User.class, id);
		}finally {
			session.close();
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			String hql="from User";
			Query<User> query=session.createQuery(hql);
			return query.list();
		}finally {
			session.close();
		}
	}
	@Override
	public void persist(User entity) {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			session.persist(entity);
		}finally {
			session.close();
		}
	}
	@Override
	public Integer save(User entity) {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			return (Integer)session.save(entity);
		}finally {
			session.close();
		}
	}
	@Override
	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			session.saveOrUpdate(entity);
		}finally {
			session.close();
		}
	}
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			session.delete(id);
		}finally {
			session.close();
		}
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		Session session=getCurrentSession();
		try {
			session.flush();
		}finally {
			session.close();
		}
	}
	
}
