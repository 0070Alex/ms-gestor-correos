/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcorreos.dto;

/**
 *
 * @author Alexander Elias
 */
public class EmailDto {
    
    String emailDestino;
    String asunto;
    String texto;

    public EmailDto() {
    }

    public EmailDto(String emailDestino, String asunto, String texto) {
        this.emailDestino = emailDestino;
        this.asunto = asunto;
        this.texto = texto;
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    
   
   
    
    
}
