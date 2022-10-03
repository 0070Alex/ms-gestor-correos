/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.repositories;

import com.dase.gestorcomentarios.entities.Comentarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Elias
 */
public interface ComentariosRepository extends CrudRepository<Comentarios, Object> {
    
}
