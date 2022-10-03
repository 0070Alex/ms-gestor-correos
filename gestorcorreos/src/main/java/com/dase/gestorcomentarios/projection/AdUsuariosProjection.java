/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.projection;

/**
 *
 * @author Fernando Garcia
 */
public interface AdUsuariosProjection {
    
    Long getId();
    String getNit();
    String getUsuario();
    String getEmail();
    String getPassword();
    String getRol();
    
}
