/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcorreos.service.impl;

import com.dase.gestorcorreos.dto.EmailDto;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class EmailService {

    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String Sender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void send(
            //String to, String subject, String text
            EmailDto dto
    ) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(Sender);
        message.setTo(dto.getEmailDestino());
        message.setSubject(dto.getAsunto());
        message.setText(dto.getTexto());
        mailSender.send(message);
        
    }

    public void sendWithAttach( EmailDto dto
            //String to, String subject, String text//, //String attachName
    /*InputStreamSource inputStream*/
    ) throws MessagingException {

        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(Sender);
        helper.setTo(dto.getEmailDestino());
        helper.setSubject(dto.getAsunto());
        helper.setText(dto.getTexto(), true);
        //helper.addAttachment(attachName, inputStream);
        mailSender.send(message);

        
    }

}
