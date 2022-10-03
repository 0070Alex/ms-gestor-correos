package com.dase.gestorcorreos.controllers;

import com.dase.gestorcorreos.service.impl.EmailService;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {
    
    @Autowired
    EmailService email;
	
	@GetMapping(value = "email")
	public String email(){
            
            email.send("d700.elias@gmail.com", "hola", "Hola atodsdafs");
		return "";
	}
        
        
        @GetMapping(value = "email2")
	public String email2() throws MessagingException{
            
            InputStreamSource casa;
            
            email.sendWithAttach("d700.elias@gmail.com", "hola", "<b>Prueba desde Spring de Java</b>");
		return "Correo enviado con exito";
	}
	
	
}
