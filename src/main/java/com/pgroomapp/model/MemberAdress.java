package com.pgroomapp.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberAdress {
    private String streetAddress;
    private String city;
    private String state;
    private int pinCode;
}
