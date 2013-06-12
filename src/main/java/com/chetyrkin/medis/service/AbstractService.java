package com.chetyrkin.medis.service;

import java.io.Serializable;
import java.util.List;

public interface AbstractService<E, I extends Serializable> {

	E findById(I id);
	
    void saveOrUpdate(E e);
    
    void delete(E e);
    
    List<E> getAll();
    
}
