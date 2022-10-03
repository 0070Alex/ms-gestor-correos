/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.services;

import javax.mail.MessagingException;
import org.springframework.core.io.InputStreamSource;

/**
 *
 * @author Alexander Elias
 */
public interface EmailService {

    public void send(String from, String to, String subject, String text);

    public void sendWithAttach(String from, String to, String subject,
            String text, String attachName,
            InputStreamSource inputStream) throws MessagingException;

}
