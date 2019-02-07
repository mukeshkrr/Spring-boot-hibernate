package com.das.nic.components;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.das.nic.entities.User;
import com.das.nic.repositories.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	private Session getSession() {
        //return sessionFactory.getCurrentSession();
		try {
		    return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    return sessionFactory.openSession();
		}
    }
	
	
	
	@Override
	public String saveUser(User user) {
		
		int isSuccess = (int) getSession().save(user);
        if(isSuccess >= 1){
            return "Success";
        }else{
            return "Error while Saving Person";
        }
	}

	@Override
	public boolean delete(User user) {
		getSession().delete(user);
        return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		Query q = getSession().createQuery("from User WHERE id < :id");
		q.setParameter("id", 7);
		
		return q.getResultList();
	}

}
