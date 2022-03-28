package com.pgroomapp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class RoomMember {
    @Id
    private Integer memberId;
    private String memberName;
    @Field(targetType = FieldType.STRING)
    private Purpose purpose;
    private MemberAdress memberAdress;
    @Field(targetType = FieldType.STRING)
    private Facilities[] facilities;
    private Double totalRent;
}
