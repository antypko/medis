package com.chetyrkin.medis.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chetyrkin.medis.dao.AbstractDAO;
import com.chetyrkin.medis.service.AbstractService;

@Service("abstractService")
@Transactional(readOnly = true)
public class AbstractServiceImpl<E, I extends Serializable> implements
		AbstractService<E, I> {

	private AbstractDAO<E, I> abstractDAO;

	@Autowired
	protected AbstractServiceImpl(AbstractDAO<E, I> abstractDAO) {
		this.abstractDAO = abstractDAO;
	}

	public E findById(I id) {
		return abstractDAO.findById(id);
	}
	
	@Transactional(readOnly = false)
	public void saveOrUpdate(E e) {
		abstractDAO.saveOrUpdate(e);
	}

	@Transactional(readOnly = false)
	public void delete(E e) {
		abstractDAO.delete(e);
	}

	public List<E> getAll() {
		return abstractDAO.getAll();
	}

}
