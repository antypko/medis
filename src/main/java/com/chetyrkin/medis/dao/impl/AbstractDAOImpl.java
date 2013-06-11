package com.chetyrkin.medis.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;

import com.chetyrkin.medis.dao.AbstractDAO;


public class AbstractDAOImpl<E, I extends Serializable> implements AbstractDAO<E,I> {

	private Class<E> entityClass;
	 
    protected AbstractDAOImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
 
    @SuppressWarnings("unchecked")
	public E findById(I id) {
        return (E) getCurrentSession().get(entityClass, id);
    }
 
    public void saveOrUpdate(E e) {
    	getCurrentSession().saveOrUpdate(e);
    }
 
    public void delete(E e) {
    	getCurrentSession().delete(e);
    }
 
    @SuppressWarnings("unchecked")
	public List<E> findByCriteria(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        if (criterion == null) { 
        	return criteria.list();
        } else {
        	criteria.add(criterion);
        	return criteria.list();
        }
    }

	public List<E> getAll() {
		return findByCriteria(null);
	}

}
