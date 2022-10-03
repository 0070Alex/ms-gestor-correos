/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.commons;

import java.util.Optional;
/**
 *
 * @author cvsantos
 */
public interface CommonSvc<E> {
    
    public Iterable<E> findAll();
	
    public Optional<E> findById(Object id);

    public E save(E entity);

    public void deleteById(Object id);
}
