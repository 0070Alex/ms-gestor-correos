/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.controllers;

import com.dase.gestorcomentarios.services.EmailService;
import io.swagger.annotations.ApiOperation;
import java.util.Locale;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/mail")
public class MailController {

   
    EmailService emailSvc;
    
    
     //@GetMapping(path = "/{user}/{pass}")
    @ApiOperation(value = "envia un email")
    public String findUserByUsernameAndPass(@RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        this.emailSvc.send("dase.sistemas@gmail.com", "d700.elias@gmail.com", "Preuba", "Hola");
        
        return "email enviado con exito";
    }

}
