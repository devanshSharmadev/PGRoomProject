package com.pgroomapp.exceptions;

import com.pgroomapp.model.ApiErrors;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        //Create a API Error objects with details as datetime, status and error message
        LocalDateTime dateTime=LocalDateTime.now();
        String message=ex.getMessage();

        List<String> details= Arrays.asList("Wrong HTTP Method",ex.getMessage());

        ApiErrors errors=new ApiErrors(dateTime,status.value(),message,details);

        return ResponseEntity.status(status).headers(headers).body(errors);
        //return super.handleHttpRequestMethodNotSupported(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        LocalDateTime dateTime=LocalDateTime.now();
        String message=ex.getMessage();
        List<String> details= Arrays.asList("Wrong Media type",ex.getMessage());
        ApiErrors errors=new ApiErrors(dateTime,status.value(),message,details);
        return ResponseEntity.status(status).headers(headers).body(errors);

        //return super.handleHttpMediaTypeNotSupported(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        LocalDateTime dateTime=LocalDateTime.now();
        String message=ex.getMessage();
        List<String> details= Arrays.asList("Missing Path Variable",ex.getMessage());
        ApiErrors errors=new ApiErrors(dateTime,status.value(),message,details);
        return ResponseEntity.status(status).headers(headers).body(errors);
        //return super.handleMissingPathVariable(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        LocalDateTime dateTime=LocalDateTime.now();
        String message=ex.getMessage();
        List<String> details= Arrays.asList("Missing Servlet Request Paramete ",ex.getMessage());
        ApiErrors errors=new ApiErrors(dateTime,status.value(),message,details);
        return ResponseEntity.status(status).headers(headers).body(errors);
        //return super.handleMissingServletRequestParameter(ex, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        LocalDateTime dateTime=LocalDateTime.now();
        String message=ex.getMessage();
        List<String> details= Arrays.asList("Type Mismatch",ex.getMessage());
        ApiErrors errors=new ApiErrors(dateTime,status.value(),message,details);
        return ResponseEntity.status(status).headers(headers).body(errors);
        //return super.handleTypeMismatch(ex, headers, status, request);
    }

    @ExceptionHandler(RoomNotFoundException.class)
    public ResponseEntity<Object> handleRoomNotFound(RoomNotFoundException ex){
        LocalDateTime dateTime=LocalDateTime.now();
        String message=ex.getMessage();
        List<String> details=Arrays.asList("Data types are not matching",ex.getMessage());
        ApiErrors errors=new ApiErrors(dateTime,HttpStatus.BAD_REQUEST.value(), message,details);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    }


}
