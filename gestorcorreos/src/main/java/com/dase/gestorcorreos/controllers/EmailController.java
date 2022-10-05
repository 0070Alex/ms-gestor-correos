package com.dase.gestorcorreos.controllers;

import com.dase.gestorcorreos.dto.emailDto;
import com.dase.gestorcorreos.service.impl.EmailService;
import io.swagger.annotations.ApiOperation;
import java.util.Locale;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/email")
@RestController
public class EmailController {

    @Autowired
    EmailService email;

   @PostMapping("emailSimple")
    @ApiOperation(value = "Envia un correo solicitando el destinatario, asunto y el texto")
    public String emailSimple(@RequestBody emailDto entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) throws MessagingException{
        this.email.sendWithAttach(entity);           
        return "Email enviado con éxito";
    }
    
    @PostMapping("emailWithHtml")
    @ApiOperation(value = "Envia un correo solicitando el destinatario, asunto y el texto, puede llevar texto en formato HTML")
    public String emailWithHtml(@RequestBody emailDto entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) throws MessagingException{
        this.email.sendWithAttach(entity);           
        return "Email enviado con éxito";
    }    

}
