package com.teste.apiTeste.domain.entity;

import lombok.Data;

@Data
public class ResponseDTO {
    private String status;// ok or error
    private String message;// error description
    private Object body;// in case of success
}


