package com.chetyrkin.medis.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;

public interface AbstractService<E, I extends Serializable> {

	E findById(I id);
	
    void saveOrUpdate(E e);
    
    void delete(E e);
    
    List<E> getAll();
    
}
