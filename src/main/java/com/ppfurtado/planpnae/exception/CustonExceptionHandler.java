package com.ppfurtado.planpnae.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustonExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IngredienteNotFoundException.class)
    public ResponseEntity<Object> handleIngredienteNotFoundException(IngredienteNotFoundException exception, WebRequest request) {
        ApiErrorMensagem mensagem = new ApiErrorMensagem(HttpStatus.NOT_FOUND, exception.getMessage());
        return new ResponseEntity<>(mensagem, new HttpHeaders(), mensagem.getStatus());
    }
}
