/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.services.impl;

import com.dase.gestorcomentarios.commons.CommonSvcImpl;
import com.dase.gestorcomentarios.entities.Comentarios;
import com.dase.gestorcomentarios.repositories.ComentariosRepository;
import com.dase.gestorcomentarios.services.ComentariosSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class ComentariosSvcImpl extends CommonSvcImpl<Comentarios,ComentariosRepository> implements   ComentariosSvc{
    
}
