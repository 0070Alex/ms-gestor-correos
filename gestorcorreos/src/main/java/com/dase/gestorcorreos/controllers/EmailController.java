package com.dase.gestorcorreos.controllers;

import com.dase.gestorcorreos.componentes.EmailNotificacion;
import com.dase.gestorcorreos.dto.EmailDto;
import com.dase.gestorcorreos.service.impl.EmailService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Locale;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="https://app-organizador-tareas.herokuapp.com")
@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService email;

    @Autowired
    EmailNotificacion noti;

    @PostMapping("emailSimple")
    @ApiOperation(value = "Envia un correo solicitando el destinatario, asunto y el texto")
    public String emailSimple(@RequestBody EmailDto entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) throws MessagingException {
        this.email.sendWithAttach(entity);
        return "Email enviado con éxito";
    }
    
  
    @PostMapping("emailHtml")
    @ApiOperation(value = "Envia un correo solicitando el destinatario, asunto y el texto, puede llevar texto en formato HTML")
    public String emailHtml(@RequestBody EmailDto entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) throws MessagingException {
        this.email.sendWithAttach(entity);
        return "Email enviado con éxito";
    }
    
    
    @GetMapping("notificacionInvitacion/{emailDestino}/{asunto}/{nombreTablero}")
    @ApiOperation(value = "Envia un correo de invitacion solicitando el destinatario, asunto y el nombre de un Tablero")
    public String emailInvitacion(
            @PathVariable(required = true) @ApiParam(value = "emailDestino") String emailDestino,
            @PathVariable(required = true) @ApiParam(value = "asunto") String asunto,
            @PathVariable(required = true) @ApiParam(value = "nombreTablero") String nombreTablero,
            @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) throws MessagingException {

        if (this.noti.notificacionInvitacion(emailDestino, asunto, nombreTablero)) {
            return "Correo enviado con éxito";
        } else {
            return "No fue posible enviar el correo, por favor intente mas tarde";
        }

    }
    
    
    @GetMapping("notificacionRegistro/{emailDestino}/{asunto}")
    @ApiOperation(value = "Envia un correo de notificacion solicitando el destinatario, asunto y el nombre de un Tablero")
    public String emailRegistro(
            @PathVariable(required = true) @ApiParam(value = "emailDestino") String emailDestino,
            @PathVariable(required = true) @ApiParam(value = "asunto") String asunto,
            @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) throws MessagingException {

        if (this.noti.notificacionRegistro(emailDestino, asunto)) {
            return "Correo enviado con éxito";
        } else {
            return "No fue posible enviar el correo, por favor intente mas tarde";
        }

    }

}
