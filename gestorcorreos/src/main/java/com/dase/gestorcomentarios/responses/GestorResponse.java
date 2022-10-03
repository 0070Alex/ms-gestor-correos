/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.responses;

import java.io.Serializable;

/**
 *
 * @author Fernando Garcia
 */
public class GestorResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String status;
    private String code;
    private String message;
    private T data;

    public GestorResponse(String status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public GestorResponse(String status, String code, String message, T data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
