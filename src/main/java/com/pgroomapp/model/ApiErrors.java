package com.pgroomapp.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApiErrors {

    LocalDateTime localDateTime;
    //HttpStatus status;
    int status;
    String message;
    List<String> details;

}
