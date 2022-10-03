/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Alexander Elias
 */
@Entity
@Table(name = "COMENTARIOS", schema = "TB_COMENTARIOS")
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMENTARIO")
    private Long id;

    
    @JoinColumn(name = "ID_TAREA")
    private int idTarea;

    @Column(name = "COMENTARIO")
    private String comentario;
    
    @Column(name = "FECHA_ADICION")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaAdicion;
    
    @Column(name = "USUARIO_ADICIONO")
    private String usuarioAdiciono;
    
    @Column(name = "ESTADO")
    private String estado;
    
    @PrePersist
    public void prePersist() {
        this.estado = "A";
    }

    public Comentarios() {
    }

    public Comentarios(Long id, int idTarea, String comentario, Date fechaAdicion, String usuarioAdiciono, String estado) {
        this.id = id;
        this.idTarea = idTarea;
        this.comentario = comentario;
        this.fechaAdicion = fechaAdicion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaAdicion() {
        return fechaAdicion;
    }

    public void setFechaAdicion(Date fechaAdicion) {
        this.fechaAdicion = fechaAdicion;
    }

    public String getUsuarioAdiciono() {
        return usuarioAdiciono;
    }

    public void setUsuarioAdiciono(String usuarioAdiciono) {
        this.usuarioAdiciono = usuarioAdiciono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

      
    
    

}
